import java.util.UUID;

public abstract class Part {
    private String id = UUID.randomUUID().toString(); //generates a random unique ID
    private int inventory;

    protected Part(int inventory) {
        this.inventory = inventory;
    }

    protected String getId(){
        return this.id;
    };

    protected int getInventory(){
        return this.inventory;
    };
}//