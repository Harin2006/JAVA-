// to print the all prime numbers upto n
public class prime {
    static void prime_n(int h){
        int x,y;
         int flg;
        System.out.println("all the prime numbers from 1 "+h+ "are :");
        for(x=1;x<=h;x++){
            if (x==0||x==1){
                continue;
            }
            flg = 1;
            for(y=2;y<=x/2;++y){
                if (x%y==0){
                    flg=0;
                    break;
                }
            }
            if (flg ==1){
            System.out.print(x+ "  ");
        }
        
        }

    }
    public static void main(String [] args){
        int h=45;
        prime_n(h);
    }
}
