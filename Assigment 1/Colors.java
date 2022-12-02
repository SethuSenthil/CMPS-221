public class Colors {
    private int colorsEnum;

    protected Colors(int colorsEnum) {
        this.colorsEnum = colorsEnum;
    }

    protected String getColor() {
        switch(colorsEnum) {
            case 1:
                return "RED";
            case 2:
                return "GREEN";
            case 3:
                return "BLUE";
            default:
                return null;
        }
    }
    protected int getColorsInt(){
        return this.colorsEnum;
    }
} 