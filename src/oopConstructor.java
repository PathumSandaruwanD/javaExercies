public class oopConstructor {
    public static void main(String[] args) {
        human oneHuman = new human("Bob",14,56.00);
        System.out.println(oneHuman.name);

    }

    public static class human{

        //creating a human constructor
        String name;
        int age;
        double weight;

        human(String name, int age, double weight){
            this.name= name;
            this.age = age;
            this.weight=weight;
        }

    }
}
