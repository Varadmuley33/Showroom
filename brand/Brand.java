/*
    File Name : Brand.java
    Description : Represents the details of a vehicle brand in the showroom.
    Author : Varad Nitin Muley
    Date : 18 September 2026
*/
   
package brand;

public class Brand
{
    public String brandName;
    public String vehicleType;

    public Brand(String brandName, String vehicleType)
    {
        this.brandName = brandName;
        this.vehicleType = vehicleType;
    }

    public void Display()
    {
        System.out.println("Brand Name : " + brandName);
        System.out.println("Vehicle Type : " + vehicleType);
    }
}
