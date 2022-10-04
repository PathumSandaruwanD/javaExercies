public class methodOverlod2 {
    public static void main(String[] args) {
        //creating new pizza object
        pizza newPizza = new pizza("thin","tomato","mozzarella","chicken");

        System.out.println(newPizza.bread);
        System.out.println(newPizza.sauce);
        System.out.println(newPizza.cheese);
        System.out.println(newPizza.topping);

    }

    public static class pizza {

        String bread;
        String sauce;
        String cheese;
        String topping;
        //constructor for the pizza class
        pizza(String bread, String sauce, String cheese, String topping) {
            this.bread = bread;
            this.sauce = sauce;
            this.cheese = cheese;
            this.topping = topping;

        }
        pizza(String bread, String sauce, String cheese) {
            this.bread = bread;
            this.sauce = sauce;
            this.cheese = cheese;
        }
        pizza(String bread, String sauce) {
            this.bread = bread;
            this.sauce = sauce;
        }
        pizza(String bread) {
            this.bread = bread;
        }
        pizza() {

        }
    }
}
