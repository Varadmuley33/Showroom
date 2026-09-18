/*
    File Name : Payment.java
    Description : Represents the payment details of a vehicle purchase.
    Author : Varad Nitin Muley
    Date : 18 September 2026
*/

package payment;

public class Payment
{
    public String customerName;
    public double amount;
    public String paymentMode;

    public Payment(String customerName, double amount, String paymentMode)
    {
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMode = paymentMode;
    }

    public void Display()
    {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Amount : " + amount);
        System.out.println("Payment Mode : " + paymentMode);
    }
}
