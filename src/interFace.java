public class interFace {
    public static class Rabbit implements Prey  {

        public void flee(){
           System.out.println("Rabbit is fleeing");
       }
    }

    public static class Hawk implements Predator {
        public void hunt(){
            System.out.println("Hawk is hunting");
        }
    }

    public static class Fish implements Prey,Predator {
        public void flee(){
            System.out.println("Fish flee bigger fish");
        }
        public void hunt(){
            System.out.println("Fish hunt smaller fish");
        }

    }

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
