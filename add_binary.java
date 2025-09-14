// function to add two binary numbers
public class add_binary {
    static String add_binary (String x , String y){
        int num1 = Integer.parseInt(x,2);// prase int is used to convert the decimal to the binary string

        int num2 = Integer.parseInt(y,2);

        int sum = num1   +  num2; 

        String result= Integer .toBinaryString(sum);

        return result;

    }
    public static void main(String[] args){
        String x ="100";
        String y="100";
        System.out.print(add_binary(x,y));
    }
}
