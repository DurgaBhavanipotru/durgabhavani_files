package org.tnsif.capgemini.c2tc.oops;

public class Absraction {
	public static void main(String[] args) {
		DurgaDemo obj=new BhanuDemo();
		obj.calling();
		obj.AIIntegration();
		obj.SatelliteComm();
		obj.HealthMontoring();
	}

}
abstract class DurgaDemo
{ 
	
	public void calling() //concrete method
	{
		System.out.println("calling");
	}
	
	public abstract void AIIntegration(); //abstract method
	public abstract void SatelliteComm();
	public abstract void HealthMontoring();
	
}

abstract class BhavaniDemo extends DurgaDemo 
{
	public void AIIntegration()
	{
		System.out.println("Phone is integrated with AIIntegration");
	}
	
}

class BhanuDemo extends BhavaniDemo                 
{
	@Override
	public void SatelliteComm() {
		System.out.println("Phone is integrated with SatelliteComm ");
	}

	@Override
	public void HealthMontoring() {
		System.out.println("Phone is integrated with HealthMontoring");		
	}

	
}

