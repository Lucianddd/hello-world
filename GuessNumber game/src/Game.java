import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class Game{
    int guesscount=10;
    Scanner imput=new Scanner(System.in);
    int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    void guessing(){
        System.out.println("You have " + guesscount + "guess(es) left");
        int nr=imput.nextInt();
        guesscount--;

        if(nr<randomNum)
            System.out.println("The number is bigger");
        else
            System.out.println("The number is smaller");



        if (nr==randomNum) {
            System.out.println("You found the corect number "+ nr);
            System.exit(0);
        }


    }


}



