public class inheritanceCode {

    public static class vehicle {
        static double speed;

        void moving() {
            System.out.println("Vehicle is moving");
        }

        void stop() {
            System.out.println("Vehicle is stopping");
        }
    }

    public static class bike extends vehicle {
        static int paddles =2;
    }

    public static class car extends vehicle {
        int wheels =4;
        int doors = 4;

    }

    //main method
    public static void main(String[] args) {
        car Car = new car();
        Car.moving();

        bike Bike = new bike();
        Bike.moving();
        System.out.println(bike.speed);
        System.out.println(bike.paddles);
    }
}
