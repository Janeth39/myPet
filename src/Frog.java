public class Frog extends myPets
{
    //Instance
    private boolean isPoisonous;

    //Constructors
    public Frog (boolean isPoisonous, boolean isFriendly, String foodType, double amtSleep, String name)
    {
        super(isFriendly, foodType, amtSleep, name);
        this.isPoisonous = isPoisonous;
    }

    //Getters
    public boolean getIsPoisonous()
    {
        return isPoisonous;
    }


    //Setters
    public void setIsPoisonous(boolean isPoisonous)
    {
        this.isPoisonous = isPoisonous;
    }

    //ToString
    public String toString()
    {
        String output = super.toString() +
                        "\nIs Poisonous: " + isPoisonous;
        return output;
    }
}
