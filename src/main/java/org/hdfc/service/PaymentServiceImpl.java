package org.hdfc.service;

public class PaymentServiceImpl implements PaymentService {

    //double accountBalance = 5000;

    @Override
    public User depositeAmount(User user, double amount) {
        //deposit amount to user
        double userBalance = user.getBalance();
        userBalance = userBalance + amount;
        user.setBalance(userBalance);

        System.out.println(amount + "Rs Debited from " + user.getUsername() + " acc");
        return user;
    }

    @Override
    public double withdrawAmount(User user, double amount) {
        double userBalance = user.getBalance();
        userBalance = userBalance - amount;
        user.setBalance(userBalance);

        System.out.println(amount + "Rs Debited from " + user.getUsername() + " acc");
        return user.getBalance();
    }

    @Override
    public double transferAmount(User sender, User receiver, double amount) {
        double userBalance = sender.getBalance();
        userBalance = userBalance - amount;
        sender.setBalance(userBalance);
        if (userBalance >= amount) {
            userBalance = userBalance - amount;
            //trans to one user to another

            System.out.println("Transfer Succesfully");
        } else {
            System.out.println("Insufficient Balance");
        }

        return sender.getBalance();
    }
}
