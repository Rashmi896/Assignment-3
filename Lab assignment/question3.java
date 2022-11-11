import java.util.Scanner;

class Marks{
    static int rollNo = 0;
    String name;
    static float total_marks;
    static float class_total;
    Marks(String name){
       this.name = name;
       Marks.rollNo +=1;
    }
    static void total_marks(){
        class_total += total_marks;
        System.out.println("Total Marks scored are  : " + total_marks);
        total_marks = 0;
    }
    static float average_total_marks(){
        return class_total;
    }

}
class Physics extends Marks{
    float marks;
    Physics(String name,float marks){
        super(name);
        this.marks = marks;
        total_marks += marks;
    }
    void display_marks(){
        System.out.println("Marks in Physics : " + marks);
    }
}

class Mathematics extends Marks{
    float marks;
    Mathematics(String name,float marks){
        super(name);
        this.marks = marks;
        super.total_marks += marks;
    }
    void display_marks(){
        System.out.println("Marks in Mathematics : " + marks);
    }
}

class Chemistry extends Marks{
    float marks;
    Chemistry(String name, float marks){
        super(name);
        this.marks = marks;
        super.total_marks += marks;
    }
    void display_marks(){
        System.out.println("Marks in Chemistry : " + marks);
    }

}

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        for(int i=1;i<=n;i++){
            System.out.println(" Name of student");
           
            String name = sc.next();
            System.out.println("Enter the marks of a new student " + n);
            System.out.println("Marks scored in physics : ");
            float phy = sc.nextFloat();
            System.out.println("Marks scored in mathematics : ");
            float math = sc.nextFloat();
            System.out.println("Marks scored in chemistry : ");
            float chem = sc.nextFloat();
            new Physics(name,phy);
            new Mathematics(name,math);
            new Chemistry(name,chem);
            
         
            Marks.total_marks();
            
        }
        float marks = Marks.average_total_marks();
        System.out.println("Average marks of the class are : "+ (marks/n));
    }
}