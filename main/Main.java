/*
    File Name : Main.java
    Description : Provides vehicle, accessory and employee selection for the showroom.
    Author : Varad Nitin Muley
    Date : 18 September 2026
*/

package main;

import java.io.*;
import java.util.*;
import vehicle.Bike;
import vehicle.Car;

public class Main
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("===== B.U. BHANDARI =====");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Accessories");
        System.out.println("4. Employees");
        System.out.println("5. Exit");

        System.out.print("Enter your choice : ");
        int iChoice = sobj.nextInt();

        if(iChoice == 1)
        {
            System.out.println("\nBike Brands :");
            ShowBrands("Bike");

            System.out.print("\nEnter brand choice : ");
            int iBrandChoice = sobj.nextInt();

            if(iBrandChoice == 1)
            {
                ShowModels("Triumph", "data/bikes.txt", "Bike");
            }
            else if(iBrandChoice == 2)
            {
                ShowModels("KTM", "data/bikes.txt", "Bike");
            }
            else if(iBrandChoice == 3)
            {
                ShowModels("Bajaj", "data/bikes.txt", "Bike");
            }
            else if(iBrandChoice == 4)
            {
                ShowModels("Royal Enfield", "data/bikes.txt", "Bike");
            }
        }
        else if(iChoice == 2)
        {
            System.out.println("\nCar Brands :");
            ShowBrands("Car");

            System.out.print("\nEnter brand choice : ");
            int iBrandChoice = sobj.nextInt();

            if(iBrandChoice == 1)
            {
                ShowModels("Volkswagen", "data/cars.txt", "Car");
            }
            else if(iBrandChoice == 2)
            {
                ShowModels("Skoda", "data/cars.txt", "Car");
            }
            else if(iBrandChoice == 3)
            {
                ShowModels("Jeep", "data/cars.txt", "Car");
            }
            else if(iBrandChoice == 4)
            {
                ShowModels("Toyota", "data/cars.txt", "Car");
            }
        }
        else if(iChoice == 3)
        {
            ShowAccessories();
        }
        else if(iChoice == 4)
        {
            ShowEmployees();
        }
        else
        {
            System.out.println("Thank you for visiting B.U. Bhandari.");
        }

        sobj.close();
    }

    public static void ShowBrands(String vehicleType)
    {
        try
        {
            File file = new File("data/brands.txt");
            Scanner sobj = new Scanner(file);

            int iCount = 1;

            while(sobj.hasNextLine())
            {
                String line = sobj.nextLine();
                String Arr[] = line.split("\\|");

                if(Arr[0].equals(vehicleType))
                {
                    System.out.println(iCount + ". " + Arr[1]);
                    iCount++;
                }
            }

            sobj.close();
        }
        catch(Exception e)
        {
            System.out.println("Unable to read brands file.");
        }
    }

    public static void ShowModels(String brandName, String fileName, String vehicleType)
    {
        try
        {
            File file = new File(fileName);
            Scanner sobj = new Scanner(file);

            String Arr[] = new String[20];
            int iCount = 0;

            System.out.println("\nModels :");

            while(sobj.hasNextLine())
            {
                String line = sobj.nextLine();
                String Data[] = line.split("\\|");

                if(Data[0].equals(brandName))
                {
                    System.out.println((iCount + 1) + ". " + Data[1]);
                    Arr[iCount] = line;
                    iCount++;
                }
            }

            sobj.close();

            Scanner qobj = new Scanner(System.in);

            System.out.print("\nEnter model choice : ");
            int iChoice = qobj.nextInt();

            String Data[] = Arr[iChoice - 1].split("\\|");

            if(vehicleType.equals("Bike"))
            {
                Bike bobj = new Bike(Data[1], Double.parseDouble(Data[2]),
                                     Data[3], Integer.parseInt(Data[4]),
                                     Integer.parseInt(Data[5]));

                System.out.println("\nSelected Vehicle : " + bobj.modelName);

                int iQuestion = 0;

                while(iQuestion != 5)
                {
                    System.out.println("\nWhat do you want to know?");
                    System.out.println("1. Price");
                    System.out.println("2. Fuel Type");
                    System.out.println("3. Engine Capacity");
                    System.out.println("4. Stock");
                    System.out.println("5. Exit");

                    System.out.print("Enter your choice : ");
                    iQuestion = qobj.nextInt();

                    if(iQuestion == 1)
                    {
                        System.out.println("Price : " + bobj.price);
                    }
                    else if(iQuestion == 2)
                    {
                        System.out.println("Fuel Type : " + bobj.fuelType);
                    }
                    else if(iQuestion == 3)
                    {
                        System.out.println("Engine Capacity : " + bobj.engineCapacity);
                    }
                    else if(iQuestion == 4)
                    {
                        System.out.println("Stock : " + bobj.stock);
                    }
                    else if(iQuestion == 5)
                    {
                        System.out.println("Thank you.");
                    }
                    else
                    {
                        System.out.println("Invalid choice.");
                    }
                }
            }
            else if(vehicleType.equals("Car"))
            {
                Car cobj = new Car(Data[1], Double.parseDouble(Data[2]),
                                   Data[3], Integer.parseInt(Data[4]),
                                   Integer.parseInt(Data[5]));

                System.out.println("\nSelected Vehicle : " + cobj.modelName);

                int iQuestion = 0;

                while(iQuestion != 5)
                {
                    System.out.println("\nWhat do you want to know?");
                    System.out.println("1. Price");
                    System.out.println("2. Fuel Type");
                    System.out.println("3. Engine Capacity");
                    System.out.println("4. Stock");
                    System.out.println("5. Exit");

                    System.out.print("Enter your choice : ");
                    iQuestion = qobj.nextInt();

                    if(iQuestion == 1)
                    {
                        System.out.println("Price : " + cobj.price);
                    }
                    else if(iQuestion == 2)
                    {
                        System.out.println("Fuel Type : " + cobj.fuelType);
                    }
                    else if(iQuestion == 3)
                    {
                        System.out.println("Engine Capacity : " + cobj.engineCapacity);
                    }
                    else if(iQuestion == 4)
                    {
                        System.out.println("Stock : " + cobj.stock);
                    }
                    else if(iQuestion == 5)
                    {
                        System.out.println("Thank you.");
                    }
                    else
                    {
                        System.out.println("Invalid choice.");
                    }
                }
            }

            qobj.close();
        }
        catch(Exception e)
        {
            System.out.println("Unable to read vehicle file.");
        }
    }

    public static void ShowAccessories()
    {
        try
        {
            File file = new File("data/accessories.txt");
            Scanner sobj = new Scanner(file);

            System.out.println("\nAccessories :");

            while(sobj.hasNextLine())
            {
                String line = sobj.nextLine();
                String Data[] = line.split("\\|");

                System.out.println(Data[0] + " - Rs." + Data[1] + " - Stock : " + Data[2]);
            }

            sobj.close();
        }
        catch(Exception e)
        {
            System.out.println("Unable to read accessories file.");
        }
    }

    public static void ShowEmployees()
    {
        try
        {
            File file = new File("data/employees.txt");
            Scanner sobj = new Scanner(file);

            System.out.println("\nEmployees :");

            while(sobj.hasNextLine())
            {
                String line = sobj.nextLine();
                String Data[] = line.split("\\|");

                System.out.println(Data[0] + " - " + Data[1] + " - " + Data[2]);
            }

            sobj.close();
        }
        catch(Exception e)
        {
            System.out.println("Unable to read employees file.");
        }
    }
}
