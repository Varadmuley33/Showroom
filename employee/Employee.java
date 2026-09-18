/*
    File Name : Employee.java
    Description : Represents the details of an employee working in the showroom.
    Author : Varad Nitin Muley
    Date : 18 September 2026   
*/

package employee;

public class Employee
{
    public String employeeName;
    public String department;
    public String contactNumber;

    public Employee(String employeeName, String department, String contactNumber)
    {
        this.employeeName = employeeName;
        this.department = department;
        this.contactNumber = contactNumber;
    }

    public void Display()
    {
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department : " + department);
        System.out.println("Contact Number : " + contactNumber);
    }
}
