package logic.options;

public class EmptyRandomRunway extends Option {
    private String description;
    public boolean checkRequirement(){
        return false;
    }
    public void applyConsequence(){

    }
}
