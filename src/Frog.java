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

    //ToString
    public String toString()
    {
        String output = super.toString() +
                        "\n Is Poisonous: " + isPoisonous;
        return output;
    }
}