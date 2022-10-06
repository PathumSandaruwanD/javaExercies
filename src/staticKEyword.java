public class staticKEyword {

    public static class friends{
        String name;
        static int numbersOfFriends;

        friends(String name){
            this.name=name;
            numbersOfFriends++;
        }
        static int getNumbersOfFriends(){
            return numbersOfFriends;
        }

    }

    public static void main(String[] args) {

        friends friend1 = new friends("Sam");
        friends friend2 = new friends("Kamal");
        friends friend3 = new friends("Kamal");
        friends friend4  = new friends("Kamal");


        //System.out.println(friends.numbersOfFriends);

        System.out.println(friends.getNumbersOfFriends());

    }
}
