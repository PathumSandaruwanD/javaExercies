public class exe5 {
    public static void main(String[] args) {
        Students Sam = new Students("Sam", "Std001",9907689);
        Students Jon = new Students("Jhon","Std002", 9045373);

        System.out.println(Jon);
        System.out.print(Sam);
    }
    public static class Students{
        String name;
        String rollNumber;
        long phoneNumber;

        Students(String name, String rollNumber, long phoneNumber){
            this.name= name;
            this.phoneNumber =phoneNumber;
            this.rollNumber = rollNumber;
        }

        public String toString(){
            return name +" "+phoneNumber+" "+rollNumber;
        }
    }
}
