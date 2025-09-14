 interface Car{
    void startengine();
    void stopengine();

}
 interface Charge{
    void battery();
}
 class tesla implements Charge,Car {
@Override
public void startengine(){
    System.out.println("enegine got started");
}
@Override
public void stopengine(){
    System.out.println("stop the engine");
}
@Override
public void battery(){
    System.out.println("this is a petrol engine car");

}
}
public class interfaceprogram{
    public static void main(String[]args){
        tesla mycar=new tesla();
        mycar.startengine();
        mycar.stopengine();
       mycar.battery();
    }
}
