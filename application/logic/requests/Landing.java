package logic.requests;

import logic.options.Option;
import logic.planes.Plane;

public abstract class Landing extends Request {

    private Plane plane;

    //TODO
    protected Landing(double RARITY, String TITLE, String DESCRIPTION, Option[] options, Plane plane) {
        super(RARITY, TITLE, DESCRIPTION, options);
        this.plane = plane;
    }
}
