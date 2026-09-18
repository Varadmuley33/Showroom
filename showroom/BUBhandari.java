/*
    File Name : BUBhandari.java
    Description : Represents the B.U. Bhandari showroom and its basic information.
    Author : Varad Nitin Muley
    Date : 18 September 2026
*/

package showroom;    

public class BUBhandari
{
    public String showroomName;
    public String location;
    public String contactNumber;

    public BUBhandari(String showroomName, String location, String contactNumber)
    {
        this.showroomName = showroomName;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    public void Display()
    {
        System.out.println("Showroom Name : " + showroomName);
        System.out.println("Location : " + location);
        System.out.println("Contact Number : " + contactNumber);
    }
}
