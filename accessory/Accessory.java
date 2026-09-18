/*
    File Name : Accessory.java
    Description : Represents the details of an accessory available in the showroom.
    Author : Varad Nitin Muley
    Date : 18 September 2026
*/

package accessory;

public class Accessory
{
    public String accessoryName;
    public double price;
    public int stock;

    public Accessory(String accessoryName, double price, int stock)
    {
        this.accessoryName = accessoryName;
        this.price = price;
        this.stock = stock;
    }

    public void Display()
    {
        System.out.println("Accessory Name : " + accessoryName);
        System.out.println("Price : " + price);
        System.out.println("Stock : " + stock);
    }
}
