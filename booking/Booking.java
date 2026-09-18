/*
    File Name : Booking.java
    Description : Represents the details of a vehicle booking made by a customer.
    Author : Varad Nitin Muley
    Date : 18 September 2026
*/
   
package booking;

public class Booking
{
    public String customerName;
    public String vehicleName;
    public String bookingDate;
    public double bookingAmount;

    public Booking(String customerName, String vehicleName,
                   String bookingDate, double bookingAmount)
    {
        this.customerName = customerName;
        this.vehicleName = vehicleName;
        this.bookingDate = bookingDate;
        this.bookingAmount = bookingAmount;
    }

    public void Display()
    {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Vehicle Name : " + vehicleName);
        System.out.println("Booking Date : " + bookingDate);
        System.out.println("Booking Amount : " + bookingAmount);
    }
}
