public class methodOverrinding {
    public static class animal{
        void speak(){
            System.out.println("the animals speak");
        }
    }
    public static class dog extends animal{
        @Override
        void speak(){
            System.out.println("Bark ");
        }
    }

    public static void main(String[] args) {
        dog Dog = new dog();
        Dog.speak();

        animal newAnimal = new animal();
        newAnimal.speak();

    }
}
