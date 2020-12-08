public class Main{
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
    Inventory<Device> inventoryDevice = new Inventory<Device>();

    DeviceSpecs espec = new DeviceSpecs(Brand.LG, "Model0", true, false);
    Device device0 = new TV(0, true, "TV", espec, "HD");
    
    inventoryDevice.addElement( device0 );
    
    }
}