public class exe4 {
    public static void main(String[] args) {
        students newStudent = new students("Kasun",24);

        newStudent.studentMethod();
    }
    public static class students{
        //creating a student constructor
        String name;
        int age;

        students(String name,int age){
            this.name= name;
            this.age= age;
        }

        void studentMethod(){
            System.out.println("Hello "+this.name);
            System.out.print("you are "+ this.age);
        }
    }
}


//class HelloWorld {
//    public static void main(String[] args) {
//        student newStudent = new student("Kasun",20);
//
//        //calling for method
//        studentMethod(newStudent);
//
//    }
//    public static class sutdent{
//
//        String name;
//        int age;
//
//        //creating a student constructor
//        student(String name, int age){
//            this.name=name;
//            this.age=age;
//        }
//        static void studentMethod(){
//            System.out.print("Hello "+this.name+" . You are "+this.age+" old");
//        }
//    }
//}