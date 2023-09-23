package org.hdfc;

import org.hdfc.service.PaymentService;
import org.hdfc.service.PaymentServiceImpl;
import org.hdfc.model.User;

import java.util.*;

public class PaymentApplicationMain {
    public static void main(String[] args) {
//        Account aa = new Account();
//        aa.deposite(500);
//        aa.withdraw(200);
//        System.out.println(aa.getBalance());
        Scanner scanner = new Scanner(System.in);
        User user = new User(1, "pankaj", "pankaj23", 500);
        User user1 = new User(2, "Akshay", "akshay23", 500);


        //custom obj
        ArrayList<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);

        for (User u1 : userList) {

            System.out.println(u1);
        }

        System.out.println("Welcome to Payment Application");
        System.out.println("Please select user id from below.");
        System.out.println("1:pankaj23 \n2:akshay23");
        int username = scanner.nextInt();

        System.out.println("Enter your  Password");
        String password = scanner.next();

        Boolean status = false;
        User list = null;

        //String pwd = user.getPassword();
        for (int i = 0; i < userList.size(); i++) {
            User tmpUser = userList.get(i);
            User id = userList.get(i);

            if (username == tmpUser.getId() && password.equals(tmpUser.getPassword())) {

                status = true;
                list = tmpUser;

                break;
            }

        }
        if (status == true) {

            System.out.println("login Succesfully");
            System.out.println("Select choice");
            System.out.println("1:Deposite Acmoun \n2:Withdraw Amount \n3:Transfer Amount");
            int choice = scanner.nextInt();
            PaymentService paymentService = new PaymentServiceImpl();

            if (choice == 1) {
                System.out.println("Enter amount");
                double amount = scanner.nextDouble();
                paymentService.depositeAmount(list, amount);
                System.out.println(list.getUsername());
                System.out.println("After Balance" + list.getBalance());

                System.out.println();
            }
            if (choice == 2) {
                System.out.println("Enter amount");
                double amount = scanner.nextDouble();
                paymentService.withdrawAmount(list, amount);
                System.out.println(list.getUsername());
                System.out.println("After Balance" + list.getBalance());

            }


        } else {
            System.out.println("Invalid password ");
        }


    }

}