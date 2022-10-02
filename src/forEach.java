import java.util.ArrayList;

public class forEach {
    public static void main(String[] args) {

//        String[] animals = {"Elephant","Elk","Dog"};

        ArrayList <String> animals = new ArrayList<>();

        animals.add("Elephant");
        animals.add("Elk");
        animals.add("Dog");

        for(String i:animals){
            System.out.println(i);
        }
    }
}
