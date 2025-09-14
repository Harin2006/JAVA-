public class exceptions1{
    public static void main(String[]args){
        try{
            int n=10;
          int  res= n/0;
            System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println("cant divide with zero!");

        }
        finally{
            System.out.println("code executed");
        }
    }
}