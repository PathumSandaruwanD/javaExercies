public class copyObjectsInJava {
    public static class car{
        private String name;
        private String color;
        private int year;

        car(String name,String color, int year){
            this.setColor(color);
            this.setName(name);
            this.setYear(year);
        }

        //getters
        public String getColor(){
            return color;
        }
        public String getName(){
            return name;
        }
        public int getYear(){
            return year;
        }

        //setters
        public void setName(String name){
            this.name = name;
        }
        public void setColor (String color){
            this.color = color;
        }
        public void setYear (int year){
            this.year = year;
        }

        public void copy(car x){
            this.setYear(x.getYear());
            this.setName(x.getName());
            this.setColor(x.getColor());
        }
    }

    public static void main(String[] args) {
        car CarNew = new car("Toyota","White",2022);
        car CarTwo = new car("Mazda","Red",2015);

        CarNew.copy(CarTwo);

        System.out.println(CarNew);
        System.out.println(CarTwo);

        System.out.println(CarTwo.color);
        System.out.println(CarNew.color);


    }

}
