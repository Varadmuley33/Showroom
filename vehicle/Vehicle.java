/*
    File Name : Vehicle.java
    Description : Represents the basic details of a vehicle in the showroom.
    Author : Varad Nitin Muley
    Date : 18 September 2026
*/

package vehicle;

public class Vehicle
{
    public String modelName;
    public double price;
    public String fuelType;
    public int stock;

    public Vehicle(String modelName, double price, String fuelType, int stock)
    {
        this.modelName = modelName;
        this.price = price;
        this.fuelType = fuelType;
        this.stock = stock;
    }

    public void Display()
    {
        System.out.println("Model Name : " + modelName);
        System.out.println("Price : " + price);
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Stock : " + stock);
    }
}
