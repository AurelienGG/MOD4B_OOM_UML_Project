package logic.planes;

import java.util.EnumMap;
import java.util.Stack;

public class PlaneManager {
    private static PlaneManager planeManager_instance = null;

    private EnumMap<PlaneType, Stack<Plane>> planesDictionary; //voir pour le stack<Plane>

    private PlaneManager(){
        EnumMap<PlaneType, Stack<Plane>> planesDictionary =  new EnumMap<>(PlaneType.class);
    }

    public PlaneManager getInstance() {
        if (planeManager_instance == null)
            planeManager_instance = new PlaneManager();
        return planeManager_instance;
    }
}
