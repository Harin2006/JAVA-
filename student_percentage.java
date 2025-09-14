
 class student{
        int rollno;
        float marks;
        String name;
        int total=600;

    
   public  student( String name,int rollno,float marks){
    this.rollno=rollno;
    this.marks=marks;
    this.name =name;
   }
   
   
    public void calculate( float marks){
        float percentage=(marks/total)*100;
        System.out.println("percentage of the student is :"+percentage);
    }
    public void display(){
        System.out.println("Name of the student : "+name);
        System.out.println("roll no of the student : "+rollno);
        System.out.println("marks of the student  : "+marks);
    }
} 
public class student_percentage{

    public static void main(String [] args){
        student s1=new student ("kaki harin ",335,568.0f);
        s1.display();
        s1.calculate( 568.0f);
}
}

   
