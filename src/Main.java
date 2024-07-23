import java.util.Random;
public class Main {
    public static void main(String[] args){
    //Create a random number generator called "generator"
    Random generator = new Random();

    //Declare Variables
        int dollars;

        //Assign a random amount of dollars
        dollars = generator.nextInt(500000);
        System.out.println("You find the secret cache and you earn " + dollars + " dollars!");
    }
}
