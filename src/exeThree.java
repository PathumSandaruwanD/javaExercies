import java.util.Scanner;

public class exeThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        rectangle newRectangle = new rectangle(height,length);
        System.out.print("Area of rect" + newRectangle.area);

    }

    public static class rectangle{
        double area;
        rectangle(double length, double height){
            area = length*height;
        }
    }
}
