package logic.requests;

import logic.options.Option;
import logic.planes.Plane;

public class PlaneLanding extends Landing {

    //TODO
    private final double RARITY = 0.40;
    private final String TITLE = "Plane Landing";
    private final String DESCRIPTION = "Plane requests to land. It has [3-5] hours of fuel left to " +
            "wait. It needs [1-4] hours of runway time. It has [100-500] " +
            "passengers";
    private Plane plane; //make final

    //TODO fix
    public PlaneLanding(Plane plane) {
        super(0.40,
                "Plane Landing",
                "Plane requests to land. It has [3-5] hours of fuel left to " +
                "wait. It needs [1-4] hours of runway time. It has [100-500] " +
                "passengers",
                plane);
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        //TODO
        return null;
    }
}
