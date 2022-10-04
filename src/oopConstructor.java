public class oopConstructor {
    public static void main(String[] args) {
        human oneHuman = new human("Bob",14,56.00);
        System.out.println(oneHuman.name);

        //using the eat method to the oneHuman object
        oneHuman.eat();

    }

    public static class human{

        //creating a human constructor
        String name;
        int age;
        double weight;

        //constructor for human class
        human(String name, int age, double weight){
            this.name= name;
            this.age = age;
            this.weight=weight;
        }

        //methods for human class
        void eat(){
            System.out.print(this.name+" is eating");
        }

    }
}
