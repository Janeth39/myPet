public class Hamster extends myPets
{
    //Instance variables
    private boolean needToExercise ;
    private boolean needsGrooming;

    //Constructor
    public Hamster (boolean needToExercise, boolean needsGrooming, boolean isFriendly,
                    String foodType, double amtSleep, String name)
    {
        super(isFriendly, foodType, amtSleep, name);
        this.needToExercise = needToExercise;
        this.needsGrooming = needsGrooming;
    }

    //Getters

    public boolean getNeedsGrooming()
    {
        return needsGrooming;
    }

    public boolean getNeedToExercise()
    {
        return needToExercise;
    }
    //Setters


    public void setNeedsGrooming(boolean needsGrooming)
    {
        this.needsGrooming = needsGrooming;
    }

    public boolean setNeedToExercise()
    {
        return needToExercise;
    }

    //ToString
    public String toString()
    {
        String output = super.toString() +
                        "\nNeeds to be Excersised: " + needToExercise +
                        "\nNeeds to be groomed: " + needsGrooming;

        return output;
    }
}
