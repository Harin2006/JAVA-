import java.util.Scanner;
   class bankaccount {
    String accountnumber;
    String name;
    double balance;

    public bankaccount( String accountnumber , String name , double balance ) {
        this.accountnumber=accountnumber;
        this.name=name;
        this.balance=balance;


    }
    public void deposit(double  amount){
        if(amount>0){
           balance+=amount;
           System.out.println("amount deposited succdessfully remaining balance in your account : "+balance);
        }
        else{
            System.out.println("check the amount and try again");
        } 

    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("amount withdraw successfully remaining amount in ypour account is :"+balance);
        }else{
            System.out.println("invalid");
        }
    }
    public void display(){
        System.out.println("account holder name :  "+name);
        System.out.println("present balance  :  "+balance);
        System.out.println("account number :  "+accountnumber);
    }
public class oopsbank{
 public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        bankaccount myaccount=new bankaccount("44001335", "kaki harin", 1300897.0);
        
        int choice;

     double amount;
     do { 
         System.out.println(" enter 1 for deposit");
        System.out.println(" enter 2 for withdraw"); 
        System.out.println(" enter 3 for display details ");        
        System.out.println(" enter 4 for exit");
        System.out.print("enter your choice : ");
        choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("enter the amount for deposit :");
            amount= sc.nextDouble();
            myaccount.deposit(amount);
            break;
            case 2:
            System.out.println("enter the amount for withdraw:");
            amount= sc.nextDouble();
            myaccount.withdraw(amount);
            break;
            case 3:
            System.out.println("display the details of the accountant");
            myaccount.display();
            break;
            case 4:
            System.out.println("invalid option");
            break;
        }
     } while (choice != 4);
     sc.close();
    }
  }
}
