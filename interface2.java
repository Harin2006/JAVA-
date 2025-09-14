interface College{
    void dept();
    void sec();

}
interface Rollno{
    void roll();

}
class student implements College,Rollno{
   
@Override
public void dept(){
    
    System.out.println("name of the student is :");
}
@Override
public void sec(){
   
    System.out.println("name of the section is :");
}
@Override
public void roll(){

    System.out.println("name of the section is :");
}
}
public class interface2{


public static void main(String[]args){
    student s1=new student();
    s1.roll();
    s1.sec();
    s1.dept();
}
}