public class superKeyword {
    public static class animals{
        String name;
        int age;
        animals(String name,int age){
            this.name=name;
            this.age=age;
        }
        public String toString(){
            return name+"\n"+age;
        }
    }
    public static class dog extends animals{
        int numbersOfLegs;

        dog( String name,int age, int numbersOfLegs){
            super(name, age);
            this.numbersOfLegs=numbersOfLegs;
        }

    }

    public static void main(String[] args) {
        dog germanSherped = new dog("Boby",4,4);
        System.out.println(germanSherped.toString());
    }
}
