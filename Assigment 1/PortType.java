public class PortType {
    private int portEnum;

    protected PortType(int portEnum) {
        this.portEnum = portEnum;
    }

    protected String getPortType() {
        switch(portEnum) {
            case 1:
                return "USB-C";
            case 2:
                return "Micro-USB";
            case 3:
                return "Lightning";
            default:
                return null;
        }
    }
    protected int getPortTypeInt(){
        return this.portEnum;
    }
}//