package org.allvehicle;
import org.twowheeler.*;
import org.threewheeler.*;
import org.fourwheeler.*;

public class Vehicle {
   private void vehicleNecessery() {
	   System.out.println("Necessery");
   }
   
   public static void main (String[]args) {
	   Vehicle V = new Vehicle();
	   V.vehicleNecessery();
	   TwoWheeler t = new TwoWheeler();
	   t. bike();
	   t.cycle();
	   ThreeWheeler r = new ThreeWheeler();
	   r.auto();
	   FourWheeler f = new FourWheeler();
	   f.car();
	   f.bus();
	   f.lorry();
	   
   }
}
