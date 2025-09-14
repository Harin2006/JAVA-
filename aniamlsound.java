//basic exmaple on abstrat class 
abstract class animal{
    abstract void sound();

    void eat(){
        System.out.println("animal is eating right now");
    } 
}
class dog extends animal{
    @Override
    void sound(){
        System.out.print("dog barks\n");
    }
}
class cat extends animal{
    @Override
    void sound(){
        System.out.println("meoww");
    }
}
public class aniamlsound{
    public static void main(String[]args){
        animal mydog=new dog();
        animal mycat=new cat();
        mydog.sound();
        mycat.sound();
         mydog.eat();
        mycat.eat();
    }
}
