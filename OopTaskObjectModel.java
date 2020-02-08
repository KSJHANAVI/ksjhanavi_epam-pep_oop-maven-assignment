
interface vehicle
{
	public String vehicleName();
	public String vehicleCompany();
	
}
//abstract classes and interface implementation
abstract class Vehicle implements vehicle
{
	public String vehicleName()
	{
		return "";
	}
	public String vehicleCompany()
	{
		return "";
	}
}
//inheritance and poymorphism
class Car extends Vehicle
{
	String carname,carcompany;
	Car()
	{
		carname="Unspecified Value for car name";
		carcompany="Unspecified Value for car company";
	}
	Car(String carname)
	{
		this.carname=carname;
	}
	Car(String carname,String carcompany)
	{
		this.carname=carname;
		this.carcompany=carcompany;
	}
	public String vehicleName()
	{
		return carname;
	}
	public String vehicleCompany()
	{
		return carcompany;
	}
}
class Bike extends Vehicle
{
	String bikename,bikecompany;
	Bike()
	{
		bikename="Unspecified Value for Bike name";
		bikecompany="Unspecified Value for Bike Company";
	}
	Bike(String bikename)
	{
		this.bikename=bikename;
	}
	Bike(String bikename,String bikecompany)
	{
		this.bikename=bikename;
		this.bikecompany=bikecompany;
	}
	public String vehicleName()
	{
		return bikename;
	}
	public String vehicleCompany()
	{
		return bikecompany;
	}
}
public class OopTaskObjectModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle bike=new Bike();
		Vehicle car=new Car();
       System.out.println("Bike Name: "+bike.vehicleName()+"Bike Company : "+bike.vehicleCompany());
       System.out.println("Car Name: "+car.vehicleName()+"Car Company : "+car.vehicleCompany());
        bike=new Bike("Apache");
        car=new Car("Q5");
        System.out.println("Bike Name: "+bike.vehicleName()+"Bike Company : "+bike.vehicleCompany());
        System.out.println("Car Name: "+car.vehicleName()+"Car Company : "+car.vehicleCompany());
        bike=new Bike("Apache","TVS");
        car=new Car("Q5","Audi");
        System.out.println("Bike Name: "+bike.vehicleName()+"Bike Company : "+bike.vehicleCompany());
        System.out.println("Car Name: "+car.vehicleName()+"Car Company : "+car.vehicleCompany());
        //Collections display
        java.util.ArrayList<Vehicle> list=new java.util.ArrayList<Vehicle>();
        list.add(bike);
        list.add(car);
        for(Vehicle i:list)
        {
        	System.out.println("Vehicle Name : "+i.vehicleName());
        	System.out.println("Vehicle Name : "+i.vehicleCompany());
        }
	}

}
