

public class Main {

    public static void main(String [] args){
        System.out.println("I have randomly chosen a number between [1,100]");
        System.out.println("Try to guess it");

        Game gameon=new Game();
        int numb=gameon.guesscount;
        for(int i=numb;i>0;i--)
            gameon.guessing();
        System.out.println("You lost");
    }
}
