import java.util.Scanner;

public class exTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the triangle: ");
        long length =scanner.nextLong();
        System.out.print("Enter height of the triangle: ");
        long height =scanner.nextLong();

        triangle newTriangle = new triangle(length,height);

        System.out.print("Area of triangle: "+newTriangle.area);



    }
    public static class triangle{
        long area;
        triangle(long height, long length){
            area =(height*length)/2;
        }
    }
}
