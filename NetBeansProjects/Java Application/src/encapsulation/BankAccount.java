
package encapsulation;

public class BankAccount {
   private String accountNumber;
   private  double balance;
 
  
   public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;        
        
    }
   BankAccount(){
        accountNumber = "Unknown";
        balance = 0.00;   
    }
   public void display(){
        System.out.printf("Account Name : %s%n ", getAccountNumber());
        System.out.printf("Account Balance : %.2f%n ", getBalance());      
    }
   public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
     
     public void setBalance(double balance) {
        this.balance = balance;
    } 
}
