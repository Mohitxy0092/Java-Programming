import java.time.LocalDate;
import java.time.Period;

class Accounts{
  private String account_number;
  private String branch;
  private String phone_number;
  private LocalDate date_of_birth;
  public Accounts(String ac,String branch,String pno,LocalDate dob){
    this.account_number=ac;
    this.branch=branch;
    this.phone_number=pno;
    this.date_of_birth=dob;
  }
  public String getAccountNumber(){
    return account_number;
  }

  public String getBranch(){
    return branch;
  }

  public String getPhoneNumber(){
    return phone_number;
  }
  public int getAge(){
    return Period.between(date_of_birth, LocalDate.now()).getYears();
  }
};

class SavingAccount extends Accounts{
    private double balance;
    public SavingAccount(String ac, String branch, String pno, LocalDate dob){
      super(ac, branch, pno, dob);
        this.balance=0.0;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Amount deposited :"+ amount);
    }
    public void Withdraw(double amount){
      if(balance<amount){
        System.out.println("Insufficient balance Start Earning more...");
        return;
      }
      balance-=amount;
      System.out.println("Amount withdraw : "+ amount);
    }
    public double getBalance(){
      return balance;
    }
}
class LoanAccount extends Accounts{
  private double principal;
  private double outstandingAmount;
  private double interestRate;
  private int tenureMonths;
  private double emi;
  public LoanAccount(String ac, String branch, String pno, LocalDate dob,double principal, double interestRate, int tenureMonths){
    super(ac, branch, pno, dob);
    this.principal = principal;
    this.outstandingAmount = principal;
    this.interestRate = interestRate;
    this.tenureMonths = tenureMonths;
    this.emi = calculateEMI();
  }
  
  private double calculateEMI() {
    double monthlyRate = interestRate / 12 / 100;
    return (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
        (Math.pow(1 + monthlyRate, tenureMonths) - 1);
  }

  public void payEMI() {
    outstandingAmount -= emi;
  }

  public double getOutstandingAmount() {
    return outstandingAmount;
  }
}
public class Account {
  public static void main(String[] args) {
    LocalDate dob = LocalDate.of(2001, 5, 21);
    SavingAccount s1=new SavingAccount("12388751","HIHT","9812323", dob);
    s1.deposit(2000.0);
    System.out.println("The current Balance of your Account : "+s1.getAccountNumber()+ " is :" + s1.getBalance());
    s1.Withdraw(1000.0);
    System.out.println("The current Balance of your Account : "+s1.getAccountNumber()+ " is :" + s1.getBalance());
  
    LoanAccount l1=new LoanAccount("1212334","Delhi", "121231233", dob, 50000, 9, 10);
    l1.payEMI();
    System.out.println(l1.getOutstandingAmount());
  }
}
