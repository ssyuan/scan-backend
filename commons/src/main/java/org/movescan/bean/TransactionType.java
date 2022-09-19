package org.movescan.bean;

public enum TransactionType {
    //starcoin txn type
    Script("Script"),
    Package("Package"),
    ScriptFunction("ScriptFunction"),

    //aptos txn type
    BlockMetadataTransaction("block_metadata_transaction"),
    GenesisTransaction("genesis_transaction"),
    StateCheckpointTransaction("state_checkpoint_transaction"),
    UserTransaction("user_transaction"),

    //Sui txn type
    Call("Call"),
    TransferSui("TransferSui"),
    Publish("Publish"),
    TransferObject("TransferObject");

    public final String name;

    TransactionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
