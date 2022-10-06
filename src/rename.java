public class rename {
    public static void main(String[] args) {
        garage Garage = new garage();
        car Car = new car("Toyota");

        Garage.Park(Car);
    }
    public static class garage{
        void Park(car Car){
            System.out.println(Car+" has been parked");
        }
    }
    public static class car{
        String name;
        car(String name){
            this.name = name;
        }

    }
}
