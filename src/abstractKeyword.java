public class abstractKeyword {

    public abstract class vehicle{
        abstract void move();
    }
    public class car extends vehicle{
        @Override
        void move() {
            System.out.println("Car moves");
        }
    }

    public void main(String[] args) {
        car Car = new car();
        Car.move();

    }
}
