public class toStringMethod {
    public static void main(String[] args) {
        Car carOne = new Car();

        System.out.print(carOne.toString());
    }

    public static class Car{
        String name= "Alion";
        String brand= "Toyota";
        int year = 2015;
        String color = "Red";

        public String toString(){
            String myString = name + "\n"+ brand +"\n"+year+ "\n"+color;
            return myString;
        }
    }

}
