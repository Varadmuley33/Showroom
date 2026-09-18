/*
    File Name : Car.java
    Description : Represents the basic details of a car available in the showroom.
    Author : Varad Nitin Muley
    Date : 18 September 2026
*/

package vehicle;

public class Car
{
    public String modelName;
    public double price;
    public String fuelType;
    public int engineCapacity;
    public int stock;

    public Car(String modelName, double price, String fuelType,
               int engineCapacity, int stock)
    {
        this.modelName = modelName;
        this.price = price;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.stock = stock;
    }

    public void Display()
    {
        System.out.println("Model Name : " + modelName);
        System.out.println("Price : " + price);
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Engine Capacity : " + engineCapacity);
        System.out.println("Stock : " + stock);
    }
}
