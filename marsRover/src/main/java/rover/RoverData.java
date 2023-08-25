package rover;

import common.Position;
import gridPlateau.GridPlateau;
import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * An immuatable class containing the current state of the rover
 */
@Value
@AllArgsConstructor
public class RoverData {

    // The direction the rover is facing
    CompassPoint compassPoint;

    // The x,y coordinate the rover inhabits
    Position position;

    // Is the next tile thr rover moves to obstructed
    Boolean isObstructed;

    // The Grid that the rover transverses
    GridPlateau gridPlateau;
}
