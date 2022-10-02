import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
//        ArrayList <String> foods = new ArrayList<>();
//
//        foods.add("Burger");
//        foods.add("Pizza");
//        foods.add("fries");
//
//        edit elements of an  arraylist using .set(elementNumber, newElement)
//        foods.set(0,"sushi");
//
//        for(int i=0; i< foods.size();i++){
//            System.out.println(foods.get(i));
//        }

    ArrayList <ArrayList<String>> grocery = new ArrayList();

    ArrayList<String> books = new ArrayList<>();
    books.add("Lord of the rings");
    books.add("Narnia");
    books.add("Harry Potter");

    ArrayList<String> goods = new ArrayList<>();
    goods.add("Flour");
    goods.add("Rice");
    goods.add("Sugar");

    ArrayList<String> drinks = new ArrayList<>();
    drinks.add("Wine");
    drinks.add("Cola");

    grocery.add(books);
    grocery.add(goods);
    grocery.add(drinks);

    for(int i=0; i<grocery.size();i++){
        System.out.println();
        for (int j=0; j<grocery.get(i).size();j++){
            System.out.print(grocery.get(i).get(j)+" ");
            }
         }
    }
}
