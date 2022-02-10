public class AllMyPets
{
    public static void main (String [] args)
    {
        myPets testPet = new myPets(false, "food", 2, "Test Pet");
        //System.out.println(testPet.toString());

        Frog shrimp = new Frog(false, true, "worms", 6, "Shrimp");
        //System.out.println(shrimp.toString());

        Hamster jgerome = new Hamster(false, true, true,
                                            "rats", 0.5, "Jgerome");
       // System.out.println(jgerome.toString());

/*        //testing Getters and Setters
        testPet.setName("NaMe");
        System.out.println("Test Pet is now named " + testPet.getName());

        shrimp.setIsPoisonous(true);
        System.out.println("Shrimp's poisonous state: " + shrimp.getIsPoisonous());

        jgerome.setIsFriendly(false);
        System.out.println("Jgerome's current friendly state: " + jgerome.getIsFriendly());*/

        //Testing Brain Method
        jgerome.sleepInSeconds();
        System.out.println("Jgerome sleep in seconds " + jgerome.sleepInSeconds());
    }
}
