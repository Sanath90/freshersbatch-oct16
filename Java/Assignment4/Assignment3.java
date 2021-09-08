package Assignment;

class IllegalBankTransactionException extends RuntimeException{

    public IllegalBankTransactionException(){
        super();
    }
    public IllegalBankTransactionException(String message){
        super(message);
    }

}
class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(){
        super();
    }
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
class savingAccount{
    long id;
    private double balance;
    double withdraw(double amount){
        if (amount>balance||balance==0){
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        else if (amount<0)
            throw new IllegalBankTransactionException("Illegal Bank Transaction..!");
        else{
            this.balance-=amount;

        return  this.balance;}
    }
    double deposit(double amount){
        System.out.println("depositing amount");
        balance+=amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}
public class Assignment3{
    public static void main(String[] args) {

        savingAccount Acc = new savingAccount();
        Acc.deposit(1000);

        try {
            Acc.withdraw(200);
            System.out.println("withdraw successfull! new balance is : "+Acc.getBalance());
            Acc.withdraw(-2000);
            System.out.println("withdraw successfull! new balance is : "+Acc.getBalance());

        } catch (IllegalBankTransactionException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        finally {
            try {
                Acc.withdraw(10000);
                System.out.println("withdraw successfull! new balance is : "+Acc.getBalance());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //e.printStackTrace();
            }

        }
    }

}