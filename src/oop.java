public class oop {
    public static void main(String[] args) {
        //objects = an instance of a class that may contain that may contain attributes and methods
        //ex:- phone, plane

        //make a copy of phone object as myPhone and accessing it by using attributes
      phone myPhone = new phone();

      System.out.println(myPhone.model);
      System.out.println(myPhone.price);

      myPhone.snaps();


    }

    public static class phone{
        //attributes
        String brand = "Mi";
        String model ="Mi 11";
        int year = 2021;
        String color = "blue";
        double price = 146000.00;

        //methods(actions)
        void call(){
            System.out.println("TYou can make a call");
        }
        void snaps(){
            System.out.println("You can take photos");
        }

    }
}

