

import java.util.Scanner;
 class Vehi
{

	protected String make;
	protected String vehicleno;
	protected String fueltype;
	protected int fuelcapacity;
	protected int cc;




public String getMake()
{
	return make;
}
public void setMake(String Make)
{
	this.make=make;
}
	


public String getVehicleno()
{
	return vehicleno;
}

public void setVehicleno(String Vehicleno)
{
	this.vehicleno=vehicleno;
}

public String getFueltype()
{
	return fueltype;
}
public void setFueltype(String Fueltype)
{
	this.fueltype=fueltype;
}

public int getFuelcapacity()
{
	return fuelcapacity;
}
public void setFuelcapacity(int Fuelcapacity)
{
	this.fuelcapacity=fuelcapacity;
}

public int getCc()
{
	return cc;
}
public void setCc(int Cc)
{
	this.cc=cc;
}

public Vehi(String make,String vehicleno,String fueltype,int fuelcapacity,int cc)
{
this.make=make;
this.vehicleno=vehicleno;
this.fueltype=fueltype;
this.fuelcapacity=fuelcapacity;
this.cc=cc;
}
void displayMake()
{
	System.out.println("Make:"+(this.make));
}
void displayBasicinfo()
{
	System.out.println("****"+(this.getMake())+"****");
	System.out.println("----Basic Information ----");
	System.out.println("Vehicle Number:"+(this.vehicleno));
	System.out.println("Fuel Capacity:"+(this.fuelcapacity));
	System.out.println("Fuel Type:"+(this.fueltype));
	System.out.println("CC:"+(this.cc));
}
void displayDetailInfo()
{
	
}
}
class TwoWheeler extends Vehi
{
	private boolean kickStartAvailable;
	
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}



	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}



	public TwoWheeler(String make,String vehicleno,String fueltype,int fuelcapacity,int cc,boolean kickStartAvailable) {
		super(make, vehicleno, fueltype, fuelcapacity, cc);

		this.kickStartAvailable=kickStartAvailable;
	}

void displayDetailinfo()
	{
		if(kickStartAvailable)
		{
			System.out.println("Kick Start Available:YES");
		}
		else
		{
			System.out.println("Kick Start Not Available:NO");
		}
	}
}
 class FourWheeler extends Vehi {
	private String audioSystem;
	private int numberofDoors;
	public FourWheeler(String make, String fueltype, String vehicleno, int fuelcapacity, int cc, String audioSystem,
			int numberofDoors) {
		super(make, fueltype, vehicleno, fuelcapacity, cc);
		this.audioSystem = audioSystem;
		this.numberofDoors = numberofDoors;
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberofDoors() {
		return numberofDoors;
	}
	public void setNumberofDoors(int numberofDoors) {
		this.numberofDoors = numberofDoors;
	}
	public void displayInfo() {
		System.out.println("AudioSyystem:"+audioSystem);
		System.out.println("Number of Doors:"+numberofDoors);
		
	}

}
class VehiMain {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter Vehicle Type"); 
		System.out.println("1.Two Wheeler");
		System.out.println("2.Four Wheeler");
		int ch=sc.nextInt();
		if(ch==1) {
                        System.out.println("VehicleMake");
			String make=sc.next();
			System.out.println("VehicleNumber");
			String VehicleNumber=sc.next();
			System.out.println("Fuel Type");
			System.out.println("1.Petrol");
			System.out.println("2.Diesel");
			String option=sc.next();
			System.out.println("Fuel Capacity");
			int FuelCapacity=sc.nextInt();
			System.out.println("Engine cc");
			int cc=sc.nextInt();
			System.out.println("Kick Start available: ");
			boolean Kick=sc.nextBoolean();
			TwoWheeler obj=new TwoWheeler(make,option,VehicleNumber,FuelCapacity,cc, Kick);
			obj.displayBasicinfo();
			obj.displayDetailInfo();
                        
		}
		else {
                        System.out.println("VehicleMake");
			String make=sc.next();
			System.out.println("VehicleNumber");
			String VehicleNumber=sc.next();
			System.out.println("Fuel Type");
			System.out.println("1.Petrol");
			System.out.println("2.Diesel");
			String option=sc.next();
			System.out.println("Fuel Capacity");
			int FuelCapacity=sc.nextInt();
			System.out.println("Engine cc");
			int cc=sc.nextInt();
			System.out.println("audio System");
			String audioSystem=sc.next();
			System.out.println("numberofDoors");
			int numberofDoors=sc.nextInt();
			FourWheeler obj=new FourWheeler(make,option,VehicleNumber,FuelCapacity,cc,audioSystem,numberofDoors);
			obj.displayBasicinfo();
			obj.displayDetailInfo();
                       



			
		}
		sc.close();
	}

}