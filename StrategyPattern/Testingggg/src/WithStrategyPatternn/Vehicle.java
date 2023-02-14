package WithStrategyPatternn;

import WithStrategyPatternn.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObject;

    /*
    * yaha mai ye nahi kr rha
    * Drivestrategy driveObject = new NormalStrategy();
    * kyuki ye bound ho jayega ek kaam ke liye
    * baar baar object banana hoga
    * esliye interface ka object banaya
    * */
    Vehicle(DriveStrategy driveObj ){

        this.driveObject=driveObj;
    }
    public void drive(){
        driveObject.drive();
    }
}
