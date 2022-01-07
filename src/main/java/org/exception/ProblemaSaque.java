package org.exception;

import org.entities.exception.AccountException;
import org.model.exceptions.BusinessException;
import org.model.exceptions.DomainException;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class ProblemaSaque {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double limit = sc.nextDouble();

            AccountException account = new AccountException(number, name, balance, limit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println(account);

        }
        catch(BusinessException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }



        sc.close();
    }
}
