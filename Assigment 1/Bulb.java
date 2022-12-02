public class Bulb extends Part{
    private Colors color;

    protected Bulb(int inventory, Colors color, int brightness) {
        super(inventory);
        this.color = color;
    }

    protected Colors getColor() {
        return this.color;
    }

}//