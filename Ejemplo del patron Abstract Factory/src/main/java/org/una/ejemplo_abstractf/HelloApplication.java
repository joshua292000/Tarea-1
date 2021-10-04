package org.una.ejemplo_abstractf;



public class HelloApplication {

    public static void main(String[] arg){
        Client client =new Client();

        System.out.println("**Prueba de tape devices");
        client.selectTechnology(new TapeDevicesFactory());
        client.test("Strings-Taemin\n");

        System.out.println("**Prueba de CD devices");
        client.selectTechnology(new CDDevicesFactory());
        client.test("So I-Super Junior");
    }
}