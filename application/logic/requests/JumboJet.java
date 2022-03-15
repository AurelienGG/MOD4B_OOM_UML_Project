package logic.requests;

import logic.options.Option;
import logic.planes.Plane;

public class JumboJet extends Landing {
    protected JumboJet(double RARITY, String TITLE, String DESCRIPTION, Option[] options, Plane plane) {
        super(RARITY, TITLE, DESCRIPTION, options, plane);
    }
}
