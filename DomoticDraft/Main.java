public class Main{
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
    Inventory<Device> inventoryDevice = new Inventory<Device>();

    DeviceSpecs espec = new DeviceSpecs(Brand.LG, "Model0", true, false);
    Device device0 = new TV(0, true, "TV", espec, "HD");
    
    DeviceSpecs espec1 = new DeviceSpecs(Brand.LG, "Model0", true, false);
    Device device1 = new TV(0, true, "TV", espec1, "LED");

    DeviceSpecs espec2 = new DeviceSpecs(Brand.LG, "Model0", true, false);
    Device device2 = new TV(0, true, "TV", espec2, "OLED");

    // Prueba de agregar dispositivo.
    inventoryDevice.addElement( device0 );
    inventoryDevice.addElement( device1 );
    inventoryDevice.addElement( device2 );
    
    // Prueba de busqueda.
    System.out.println( inventoryDevice.searchElement( device2 ) );
    
    // Prueba para comprobar que funcione el remover.
    inventoryDevice.removeElement( device1 );
    System.out.println( inventoryDevice.searchElement( device2 ) );

    }
}