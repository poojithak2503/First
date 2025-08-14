public class Student {
    public static void printDetails(String name , int roll){
        System.out.println("student name:" + name);
        System.out.println("roll number" + roll);
    }
    public static void marks(int math, int science, int english){
        System.out.println("Marks in math:" + math);
        System.out.println("Marks in science:" + science);
        System.out.println("Marks in english:" + english);
        int total= math + science + english;
        System.out.println("totalmarks" + total );
        double average = (math + science + english) / 3;
        System.out.println("average" + average );
    }
    
    
    
    
    
    public static void main(String args[]){
        printDetails("Poojitha",7);
        marks(25, 24, 23);

    }
}
