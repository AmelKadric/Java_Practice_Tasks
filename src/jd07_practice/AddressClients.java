package jd07_practice;

public class AddressClients {

    public static void main(String[] args) {

        Address address = new Address();
        address.buildingNumber = 55;
        address.street = "highland";
        address.city = "Chicago";
        address.state = "IL";
        address.zipCode = "60016";

        System.out.println(address);


    }
}
