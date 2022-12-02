public class Base extends Part {
   private String portType;
   private Boolean wirelessCharging;

   protected Base(int inventory, String portType, Boolean wirelessCharging) {
      super(inventory);
      this.portType = portType;
   }

   protected String getPortType() {
      return this.portType;
   }

   protected Boolean getWirelessCharging() {
      return this.wirelessCharging;
   }
}//