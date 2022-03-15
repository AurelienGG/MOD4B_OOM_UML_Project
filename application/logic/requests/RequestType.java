package logic.requests;

public enum RequestType {

    PLANE_LANDING(0.40),
    EMERGENCY_LANDING(0.05),
    FUNDING_EVENT(0.10),
    JUMBO_JET(0.15),
    BAD_WEATHER(0.10),
    SNAKES_ON_THE_PLANE(0.10),
    PROTESTS(0.05),
    JOHN_MCCLAIN(0.05);

    public final double RARITY;

    private RequestType(double RARITY) {
        this.RARITY = RARITY;
    }

}
