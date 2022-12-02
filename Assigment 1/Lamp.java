public class Lamp {
    private Base base;
    private Bulb bulb;

    protected void setBase(Base base) {
        this.base = base;
    }

    protected void setBulb(Bulb bulb) {
        this.bulb = bulb;
    }

    protected Base getBase() {
        return this.base;
    }

    protected Bulb getBulb() {
        return this.bulb;
    }

    protected String getSerialNumber() {
        //serial number is all the parts' IDs concatenated
        if (base != null && base != null) {
            return this.bulb.getId() + this.base.getId();
        } else {
            return null;
        }
    }
}//