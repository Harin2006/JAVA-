public class lcm {
    public static void main(String [] args){
        int a=3;
        int b=6;
        int result=(a>b)? a: b;

        while (true) { 
         if(result %a==0 && result %b==0){// checking whether bothe are divisible by the number to get the remainder 0 
            break;
         }   
         result++;//once the loop runs it check and increases the value of the result and checks for the specific number that should divide both a and b to get remainder 0

        }
        System.out.println("Lcm of  "+a+ "  and  "+b+ " is  "+result);

    }
    
}
