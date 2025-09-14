
public class neonnumber {
    public static boolean neon_number(int n){
        int square=n*n;
        int sum=0;
        while (square > 0)
{
    int r= square%10;
    sum+=r;
    square=square/10;

    
}
if (sum==n){
    return  true;
}
else{
    return false;
}
    }
    public static void main(String []args){
        int n=8;
        if(neon_number(n)){
            System.out.println("it is a neon neumber");
        }else{
            System.out.println("it is not a neon number");
        }
    }
}
