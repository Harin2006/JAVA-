interface College{
    void dept();
    void sec();

}
interface Rollno{
    void roll();

}
class student implements College,Rollno{
    String name;
    String sec;
    int roll;
    student(String name,String sec,int roll)
{
    this .name=name;
    this.sec=sec;
    this.roll=roll;
}   
@Override
public void dept(){
    
    System.out.println("name of the student is :"+name);
}
@Override
public void sec(){
   
    System.out.println("name of the section is :"+sec);
}
@Override
public void roll(){

    System.out.println("name of the section is :"+roll);
}
}
public class interface2withdata{


public static void main(String[]args){
    student s1=new student("CSE","B1",44110335);
    s1.roll();
    s1.sec();
    s1.dept();
}
}