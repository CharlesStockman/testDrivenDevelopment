package rover.CommandPatterns.userCommands;

import common.Position;
import rover.CompassPoint;

import java.util.HashMap;
import java.util.Map;

/**
 * A command to change the direction the rover is facing.
 */
public class ChangeDirectionCommand implements CommandInterface<CompassPoint> {


    private static Map<String, CompassPoint> getNewCompassPoint;

    static {
        getNewCompassPoint = new HashMap<>();
        getNewCompassPoint.put("L" + CompassPoint.N.name(), CompassPoint.W);
        getNewCompassPoint.put("L" + CompassPoint.W.name(), CompassPoint.S);
        getNewCompassPoint.put("L" + CompassPoint.S.name(), CompassPoint.E);
        getNewCompassPoint.put("L" + CompassPoint.E.name(), CompassPoint.N);
        getNewCompassPoint.put("R" + CompassPoint.N.name(), CompassPoint.E);
        getNewCompassPoint.put("R" + CompassPoint.E.name(), CompassPoint.S);
        getNewCompassPoint.put("R" + CompassPoint.S.name(), CompassPoint.W);
        getNewCompassPoint.put("R" + CompassPoint.W.name(), CompassPoint.N);
    }

    @Override
    public CompassPoint execute(Character command, CompassPoint compassPoint, Position position ) {
        CompassPoint newCompassPoint = getNewCompassPoint.get(command + compassPoint.name());
        addEventHistory('L', newCompassPoint, position, "");
        return newCompassPoint;
    }
}