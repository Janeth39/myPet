public class Hamster extends myPets
{
    //Instance variables
    private boolean needToExcersise;
    private boolean needsGrooming;

    //Constructor
    public Hamster (boolean needToExcersise, boolean needsGrooming, boolean isFriendly,
                    String foodType, double amtSleep, String name)
    {
        super(isFriendly, foodType, amtSleep, name);
        this.needToExcersise = needToExcersise;
        this.needsGrooming = needsGrooming;
    }

    //ToString
    public String toString()
    {
        String output = super.toString() +
                        "\nNeeds to be Excersised: " + needToExcersise +
                        "\nNeeds to be groomed: " + needsGrooming;

        return output;
    }
}
