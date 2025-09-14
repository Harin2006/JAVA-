 abstract class moksha{
   abstract void sorry();
    
   void lag(){
    System.out.print("nv madhyalo ichina gap ke nidra vachesindhi kannamaaaaaaaaaa\n");

   }

}
class silent extends moksha{
    @Override
    void sorry(){
        System.out.println("night aupoyindhi kadha nv message cheyyav emo ani phone silent lo petta sorry\n");
    }
}
class inka extends moksha{
    @Override
    void sorry(){
        System.out.println("inka eppudu phone silent lo pettanu maa ");
    }

}
class kali extends moksha{
    @Override
    void sorry(){
        System.out.println("nenu kali eeh naku morning baga ekkuthundhi nv em alochinchaku malli ");
    }
}
class choddy extends moksha{
    @Override
    void sorry(){
        System.out.println("choddy maa ummmmmmaaaaaaaaa ");
    }
}
public class abstractandoverride{
    public static void main(String [] args){
        moksha silent=new silent();
        moksha inka=new inka();
        moksha kali=new kali();
        moksha choddy =new choddy();
        silent.lag();
        silent.sorry();
        inka.sorry();
        kali.sorry();
        choddy.sorry();



    }
}