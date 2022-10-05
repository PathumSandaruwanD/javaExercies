public class exe6 {
    public static void main(String[] args) {
    rectangle recOne = new rectangle(10, 20);
    rectangle recTwo = new rectangle(23,54);

    System.out.print(recOne.Area());
    System.out.println(recTwo.Area());
    }
    public static class rectangle{
        double length;
        double height;

        rectangle(double length, double height){
            this.height=height;
            this.length=length;
        }
        public double Area(){
            return  length*height;
        }
    }

}
