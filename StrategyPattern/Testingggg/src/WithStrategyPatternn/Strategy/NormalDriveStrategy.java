package WithStrategyPatternn.Strategy;

import WithStrategyPatternn.Strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive(){
        System.out.println("Normal drive capabilities");
    }
}
