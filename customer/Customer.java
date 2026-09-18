/*
    File Name : Customer.java
    Description : Represents the details of a customer visiting the showroom.
    Author : Varad Nitin Muley
    Date : 18 September 2026
*/

package customer;
   
public class Customer
{
    public String customerName;
    public String contactNumber;
    public String address;

    public Customer(String customerName, String contactNumber, String address)
    {
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public void Display()
    {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Address : " + address);
    }
}
