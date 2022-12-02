import java.util.*;

public class Factory {
    private int totalShipped = 0;
    private List<List<String>> inventories = new ArrayList<List<String>>();
    private ArrayList<Lamp> assembly = new ArrayList<Lamp>();

    protected void shipProduct(Lamp lamp) {
        totalShipped++;
        assembly.remove(lamp);
    }

    protected void createInventory() {
        inventories.add(new ArrayList<String>());
    }

    protected void prepLamp(Lamp lamp) {
        totalShipped++;
        assembly.add(lamp);
    }

    protected int getTotalShipped() {
        return this.totalShipped;
    }

    protected int totalNumberInPrep() {
        return assembly.size();
    }
}//
