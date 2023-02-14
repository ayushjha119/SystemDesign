package WithStrategyPatternn;

import WithStrategyPatternn.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends  Vehicle{
    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
