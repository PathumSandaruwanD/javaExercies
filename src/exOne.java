import java.util.Arrays;
import java.util.Scanner;

public class exOne {
    public static void main(String[] args) {

        int[] array = new int[5];

        for (int i=0;i<array.length;i++){
          System.out.print("Enter a value: ");
          Scanner scanner = new Scanner(System.in);
          array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        for(int j=0;j<array.length;j++){
           System.out.print(array[j]+" ");
       }


    }
}
