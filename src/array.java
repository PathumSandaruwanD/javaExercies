public class array {
    public static void main(String[] args) {

//       String [] boys = {"NImal","kamal","Sunil"};
//
//       for(int i=0; i< boys.length; i++){
//        System.out.println(boys[i]);
//        }
//       System.out.println(boys[1]);

        int[][] numbers = {{10,20,30},{40,50,60},{70,80,90}};

                for(int i=0; i<numbers.length;i++){
                    System.out.println();
                    for (int j=0; j<numbers[i].length;j++){
                        System.out.print(numbers[i][j]+" ");
                    }
                }
}
}
