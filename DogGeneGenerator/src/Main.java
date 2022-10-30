import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] dogBreed = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug",
                "Common Cur", "King Doberman"};

        System.out.println("What is your dog's name? ");
        Scanner input = new Scanner(System.in);
        String dogsName=input.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogsName+"'s"+
                "  prestigious background right here.");
        System.out.println( dogsName+" is:");
        Random rand = new Random();

        int breed1 = rand.nextInt(0,100);
        int breed2 = rand.nextInt(0,(100 - breed1));
        int breed3 = rand.nextInt(0,(100 - breed1 -breed2));
        int breed4 = rand.nextInt(0,(100 - breed1-breed2-breed3));
        int breed5 = rand.nextInt(0,(100 - breed1-breed2-breed3-breed4));
        while(breed5!=(100 - breed1-breed2-breed3-breed4)){
            breed5 = rand.nextInt(0,(100 - breed1-breed2-breed3-breed4));
            if (breed5 == (100 - breed1-breed2-breed3-breed4));
            {
                breed5 = 100 - breed1-breed2-breed3-breed4;
                break;
            }
        }

        int[] percentOfBreed ={breed1,breed2,breed3,breed4,breed5};

        for (int i=0; i <5; i++) {
            System.out.println("         " + percentOfBreed[i] + "%  " + dogBreed[i]);
        }
    }
}