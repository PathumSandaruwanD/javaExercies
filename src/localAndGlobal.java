import java.util.Random;

public class localAndGlobal {
    public static void main(String[] args) {
        //local  =  declare inside a method (visable only to it)
        //global =  declare outside a method but with in the class visible to all the parts of the class

        diceRoller roller = new diceRoller();
    }

    public static class diceRoller {

        //initializing global variables
        int number;
        Random random;

        diceRoller() {
            //Random random = new Random();
            //int number = 0;
            // roll(random,number);

            random = new Random();
            roll();
        }

//        void roll(Random random, int number) {
//            number = random.nextInt(6) + 1;
//            System.out.print(number);
//        }

        void roll() {
            number = random.nextInt(6) + 1;
            System.out.print(number);
        }
    }
}
