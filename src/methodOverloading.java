public class methodOverloading {
    public static void main(String[] args) {
        //methods that have same name but have different parameters
        // method name+ parameters = methodSignature
        int num1= 10;
        int num2= 15;
        int num3= 20;
        System.out.print(addition(num1,num2,num3));
    }

    static int addition(int a,int b){
        return a+b;
    }
    static int addition (int a,int b,int c){
        System.out.println("method overloaded #2");
        return a+b+c;
    }
    static int addition (int a,int b, int c,int d){
        return a+b+c+d;
    }
}
