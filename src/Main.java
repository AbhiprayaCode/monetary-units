import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// Exercise 1.3
// Students need to prepare a simple code that shows the logic on how to return balance money to user. Ex. User pay 5.000 paid with 100.000.

public class Main {
    public static void main(String[] args) {

        int moneyValue, payment, change;
        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};

        System.out.println("Input money = ");
        Scanner money = new Scanner(System.in);
        moneyValue = money.nextInt();

        System.out.println("input payment = ");
        Scanner pay = new Scanner(System.in);
        payment = pay.nextInt();

        if (moneyValue < payment){
            System.out.println("Your money has not enough! Transaction Canceled.");
            return;
        }


        change = moneyValue - payment;
        System.out.println("Your change = " + change);

        for (int i = 0; i < pecahan.length; i++) {
            int count = change / pecahan[i];


            if (count != 0){
                System.out.println(pecahan[i] + " = " + count);
            }

            change -= count * pecahan[i];
        }
    }
}