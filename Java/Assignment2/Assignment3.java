class bankAccount{                          //parent class
    int accNo;
    String holderName;
    String AccType;
    private double balance;

     public void bankAccount(){                             //default constructor
        accNo=0;
        holderName="user";
        AccType="nil";
        balance=0;
    }
    public bankAccount(int accNo,String holderName,double balance){         //argumented constructor
         this.accNo=accNo;
         this.holderName=holderName;
         this.AccType="AccType";
         this.balance=balance;
    }

    public double getBalance() {                    //method to return balance of the account
        return balance;
    }
}

class SavingsAcc extends bankAccount{                   //child class1

    double fixedDeposit;

    public SavingsAcc(int accNo, String holderName, double balance) {
        super(accNo, holderName, balance);
        this.AccType="Savings";
        fixedDeposit=20000;
    }

    @Override
    public double getBalance() {                        //method overriding to get total balance
        return (super.getBalance()+fixedDeposit);
    }
}
class CurrentAcc extends bankAccount{                       //child class 2
    double cashCredit;

    public CurrentAcc(int accNo, String holderName, double balance) {
        super(accNo, holderName, balance);
        this.AccType="Current";
        if (balance>10000)
            cashCredit=(.10*balance);
        else
            cashCredit=(.5*balance);
    }

    @Override
    public double getBalance() {
        return (super.getBalance()+cashCredit);
    }
}

public class Assignment3{                                   //mainApp class
    public static void main(String[] args) {

        bankAccount s1= new SavingsAcc(1001,"Rahul",10000);
        bankAccount c1= new CurrentAcc(1002,"Remya",25000);
        System.out.println("balance of s1 = : " + s1.getBalance());
        System.out.println("balance of c1 = : " + c1.getBalance());
        System.out.println("total cash in the bank = : " +(s1.getBalance()+c1.getBalance()));

    }
}
