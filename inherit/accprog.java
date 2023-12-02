package inherit;

import java.util.Scanner;
import java.lang.Math;
public class accprog {

    public static void main(String args[]) {
        int ant, acctype, choice, months;
        double bal, amount, inter = 0.05;

        choice = 0;

        System.out.println("WELCOME TO RAUNAK BANK");
        System.out.println("Enter your account number:");
        Scanner sc = new Scanner(System.in);
        ant = sc.nextInt();
        System.out.println("Thanks for choosing RAUNAK BANK. Your account number is " + ant);
        System.out.println("Enter your initial account balance:");
        bal = sc.nextDouble(); // Use nextDouble for a double value
        System.out.println("Initial Balance " + bal);
        System.out.println("Enter your account operating months\n");
        months = sc.nextInt();
        System.out.println("Enter your account type: 1=current 2=savings\n");
        acctype = sc.nextInt();

        if (acctype != 1 && acctype != 2) {
            System.out.println("Account type not recognized");
        } else if (acctype == 1) {

            while (choice != 5) {
                System.out.println("\n 1.Withdraw \n 2.Deposit \n 3.Show Balance \n 4.Interest Calculation \n 5.Exit");
                System.out.println("\n Enter your choice: ");
                choice = sc.nextInt();
                current cr = new current(bal);
                switch (choice) {
                    case 1:
                        System.out.println("\n Enter amount to withdraw");
                        amount = sc.nextDouble(); // Use nextDouble for a double value
                        bal = cr.withdrawc(amount);
                        break;
                    case 2:
                        System.out.println("\n Enter amount to deposit");
                        amount = sc.nextDouble(); // Use nextDouble for a double value
                        bal = cr.depositc(amount);
                        break;
                    case 3:
                        System.out.println("\n Displaying your balance");
                        bal = cr.displayc();
                        break;
                    case 4:
                        System.out.println("Don't expect any interest from a current account.");
                        break;
                    default:
                        break;
                }
            }
        } else {
            saving ssr = new saving(inter, months, bal);
            while (choice != 5) {
                System.out.println("\n 1.Withdraw \n 2.Deposit \n 3.Show Balance \n 4.Interest Calculation \n 5.Exit");
                System.out.println("\n Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("\n Enter amount to withdraw");
                        amount = sc.nextDouble(); // Use nextDouble for a double value
                        ssr.withdrws(amount);
                        break;
                    case 2:
                        System.out.println("\n Enter amount to deposit");
                        amount = sc.nextDouble(); // Use nextDouble for a double value
                        ssr.deposits(amount);
                        break;
                    case 3:
                        System.out.println("\n Displaying your balance");
                        ssr.display();
                        break;
                    case 4:
                        double interest_amount = ssr.interest_calculate();
                        System.out.format("Interest Amount: %.2f", interest_amount);
                        break;
                    default:
                        break;
                }
            }
        }
        sc.close();
    }

    public static class account {
        int account_no;
        double account_balance; // Change the balance to double

        public account(double account_balance) { // Change the balance to double
            this.account_balance = account_balance;
            // this.account_no = account_no;
        }

        public double deposit(double amount) { // Change the deposit parameter to double
            account_balance = account_balance + amount;
            System.out.println("Deposited amount is " + amount);
            return account_balance;
        }

        public double withdraw(double amount) { // Change the withdraw parameter to double
            account_balance = account_balance - amount;
            System.out.println("Withdraw amount is " + amount);
            return account_balance;
        }

        public double display() { // Change the return type to double
            System.out.println("Balance of the account is: " + account_balance);
            return account_balance;
        }
    }

    public static class saving extends account {
        public double interest;
        public int months;

        public saving(double interest, int months, double account_balance) { // Change the balance to double
            super(account_balance);
            this.interest = interest;
            this.months = months;
        }

        public double interest_calculate() { // Change the return type to double
            double interest_amount;
            interest_amount = (account_balance * months * interest) / 365;
            interest_amount=Math.round(interest_amount);
            double balan = deposits(interest_amount);
            System.out.println("Updated Balance" + balan);
            return interest_amount;
        }

        public double withdrws(double amount) { // Change the parameter and return type to double
            if ((account_balance - amount) > 1000) {
                super.withdraw(amount);
            } else {
                System.out.println("Minimum account balance is reached, earn some money");
            }
            return account_balance;
        }

        public double deposits(double amount) { // Change the parameter and return type to double
            super.deposit(amount);
            return account_balance;
        }
    }

    public static class current extends account {
        public current(double account_balance) { // Change the balance to double
            super(account_balance);
        }

        public double withdrawc(double amount) { // Change the parameter and return type to double
            if (amount > 100000) {
                System.out.println("The limit of withdrawal is reached");
            } else {
                super.withdraw(amount);
            }
            return account_balance;
        }

        public double depositc(double amount) { // Change the parameter and return type to double
            super.deposit(amount);
            System.out.println("Amount deposited " + amount);
            return account_balance;
        }

        public double displayc() { // Change the return type to double
            double b;
            b = super.display();
            return b;
        }
    }
}
