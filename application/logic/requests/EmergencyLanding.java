package logic.requests;

import logic.options.Option;
import logic.planes.Plane;

public class EmergencyLanding extends Landing {
    protected EmergencyLanding(double RARITY, String TITLE, String DESCRIPTION, Option[] options, Plane plane) {
        super(RARITY, TITLE, DESCRIPTION, options, plane);
    }
}
