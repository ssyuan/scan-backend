
--add types
DROP DOMAIN IF EXISTS uint_64;
CREATE DOMAIN uint_64 AS NUMERIC(20, 0) NOT NULL
    CHECK (VALUE >= 0 AND VALUE <= 2^64)
    CHECK (SCALE(VALUE) = 0);

DROP DOMAIN IF EXISTS uint_128;
CREATE DOMAIN uint_128 AS NUMERIC(39, 0) NOT NULL
    CHECK (VALUE >= 0 AND VALUE <= 2^128)
    CHECK (SCALE(VALUE) = 0);

DROP DOMAIN IF EXISTS uint_256;
CREATE DOMAIN uint_256 AS NUMERIC(78, 0) NOT NULL
    CHECK (VALUE >= 0 AND VALUE <= 2^256)
    CHECK (SCALE(VALUE) = 0);

-- database movescan

CREATE DATABASE movescan
    WITH
    OWNER = csy
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

CREATE SCHEMA starcoin_main;

-- table block
CREATE TABLE IF NOT EXISTS starcoin_main.block
(
    author                  character varying(255) COLLATE pg_catalog."default" NOT NULL,
    block_accumulator_root  character varying(255) COLLATE pg_catalog."default" NOT NULL,
    block_hash              character varying(255) COLLATE pg_catalog."default" NOT NULL,
    body_hash               character varying(255) COLLATE pg_catalog."default",
    chain_id                smallint NOT NULL,
    difficulty              character varying(255) COLLATE pg_catalog."default" NOT NULL,
    extra                   character varying(255) COLLATE pg_catalog."default" NOT NULL,
    gas_used                bigint NOT NULL,
    nonce                   bigint NOT NULL,
    height                  uint_64 NOT NULL,
    parent_hash             character varying(255) COLLATE pg_catalog."default" NOT NULL,
    state_root              character varying(255) COLLATE pg_catalog."default" NOT NULL,
    txn_accumulator_root    character varying(255) COLLATE pg_catalog."default" NOT NULL,
    create_at               timestamp with time zone DEFAULT now(),
    CONSTRAINT block_pkey PRIMARY KEY (block_hash)
    );

-- table transaction
CREATE TABLE IF NOT EXISTS starcoin_main.transactions
(
    txn_type                character varying(255) COLLATE pg_catalog."default" NOT NULL,
    block_hash              character varying(255) COLLATE pg_catalog."default" NOT NULL,
    block_number            uint_64      NOT NULL,
    payload                 jsonb       NOT NULL,
    global_index            uint_64     NOT NULL,
    txn_hash                character varying(255) COLLATE pg_catalog."default" NOT NULL,
    state_root_hash         character varying(255) COLLATE pg_catalog."default" NOT NULL,
    event_root_hash         character varying(255) COLLATE pg_catalog."default" NOT NULL,
    gas_used                uint_64 NOT NULL,
    success                 boolean NOT NULL,
    vm_status               text COLLATE pg_catalog."default" NOT NULL,
    accumulator_root_hash   character varying(255) COLLATE pg_catalog."default" NOT NULL,
    create_at               timestamp without time zone NOT NULL DEFAULT now(),
    CONSTRAINT transactions_pkey PRIMARY KEY (txn_hash),
    CONSTRAINT transactions_index_key UNIQUE (global_index)
);

-- table user_transactions
CREATE TABLE IF NOT EXISTS starcoin_main.user_transactions
(
    txn_hash                character varying(255) COLLATE pg_catalog."default" NOT NULL,
    signature               jsonb NOT NULL,
    sender                  character varying(255) COLLATE pg_catalog."default" NOT NULL,
    sequence_number         uint_64 NOT NULL,
    max_gas_amount          uint_64 NOT NULL,
    expiration_secs         timestamp without time zone NOT NULL,
    gas_unit_price          uint_64 NOT NULL,
    chain_time              timestamp without time zone NOT NULL,
    create_at             timestamp without time zone NOT NULL DEFAULT now(),
    CONSTRAINT user_transactions_pkey PRIMARY KEY (txn_hash),
    CONSTRAINT user_transactions_sender_sequence_number_key UNIQUE (sender, sequence_number)
);

-- table transfers
CREATE TABLE IF NOT EXISTS starcoin_main.transfers
(
    txn_hash                character varying(255) COLLATE pg_catalog."default" NOT NULL,
    sender                  character varying(255) COLLATE pg_catalog."default" NOT NULL,
    receiver                character varying(255) COLLATE pg_catalog."default" NOT NULL,
    amount                  character varying(255) COLLATE pg_catalog."default" NOT NULL,
    type_tag                character varying(255) COLLATE pg_catalog."default" NOT NULL,
    identifier              character varying(255) COLLATE pg_catalog."default",
    amount_value            uint_64 NOT NULL,
    create_at             timestamp without time zone NOT NULL DEFAULT now(),
    CONSTRAINT transfers_pkey PRIMARY KEY (txn_hash)
);

-- table address
CREATE TABLE IF NOT EXISTS starcoin_main.address
(
    address                character varying(255) COLLATE pg_catalog."default" NOT NULL,
    supply                 uint_64 NOT NULL,
    hold_amount            uint_64 NOT NULL,
    create_at             timestamp without time zone NOT NULL DEFAULT now(),
    CONSTRAINT address_pkey PRIMARY KEY (address)
);

-- table token
CREATE TABLE IF NOT EXISTS starcoin_main.token
(
    type_tag               character varying(255) COLLATE pg_catalog."default" NOT NULL,
    creator                character varying(255) COLLATE pg_catalog."default" NOT NULL,
    supply                 uint_64 NOT NULL,
    maximum                uint_64 NOT NULL,
    holders                uint_64 NOT NULL,
    create_at             timestamp without time zone NOT NULL DEFAULT now(),
    CONSTRAINT token_pkey PRIMARY KEY (type_tag)
);

-- table write_set_changes
CREATE TABLE IF NOT EXISTS starcoin_main.write_set_changes
(
    txn_hash                character varying(255) COLLATE pg_catalog."default" NOT NULL,
    state_key_hash          character varying(255) COLLATE pg_catalog."default" NOT NULL,
    change_type             character varying(255) COLLATE pg_catalog."default" NOT NULL,
    address                 character varying(255) COLLATE pg_catalog."default" NOT NULL,
    change_data             jsonb NOT NULL,
    create_at               timestamp without time zone NOT NULL DEFAULT now(),
    CONSTRAINT write_set_changes_pkey PRIMARY KEY (txn_hash, state_key_hash)
);

-- table events
CREATE TABLE IF NOT EXISTS starcoin_main.events
(
    txn_hash                character varying(255) COLLATE pg_catalog."default" NOT NULL,
    event_key               character varying(100) COLLATE pg_catalog."default" NOT NULL,
    event_sequence_number   uint_64 NOT NULL,
    type_tag                text COLLATE pg_catalog."default" NOT NULL,
    event_data              jsonb NOT NULL,
    global_index            uint_64 NOT NULL,
    create_at               timestamp without time zone NOT NULL DEFAULT now(),
    CONSTRAINT events_pkey PRIMARY KEY (event_key, event_sequence_number)
);

