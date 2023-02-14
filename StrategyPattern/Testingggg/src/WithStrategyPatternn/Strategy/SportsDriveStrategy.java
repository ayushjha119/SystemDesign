package WithStrategyPatternn.Strategy;

import WithStrategyPatternn.Strategy.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("Sports drive capabilities");
    }
}
