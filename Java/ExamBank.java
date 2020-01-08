package exam;

import java.util.Scanner;

/**
*
* @author 84122
*/
public class ExamBank {

    private double balance;
    private double rate;

    public ExamBank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
}

    public ExamBank() {

}

    public double getBalance() {
    return balance;
}

    public void setBalance(double balance) {
    this.balance = balance;
}

public double getRate() {
    return rate;
}

    public void setRate(double rate) {
    this.rate = rate;
}

public double calculateInterest() {
    double interest;
    return interest = balance * (rate / 1200);
 }

public static void main(String[] args) {
    double balance, rate;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter balance:");
    balance = input.nextDouble();
    System.out.println("Enter rate:");
    rate = input.nextDouble();
    ExamBank obj = new ExamBank(balance, rate);
    obj.calculateInterest();
    System.out.println("Interest is: " + obj.calculateInterest());
    }
}