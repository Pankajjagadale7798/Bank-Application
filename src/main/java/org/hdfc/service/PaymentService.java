package org.hdfc.service;

import org.hdfc.model.User;

public interface PaymentService {
    //TODO- add methods
    //public String getUserAuthentication();

    //String getAvailableUserList();
    public User depositeAmount(User user, double amount);

    public double withdrawAmount(User user, double amount);

    public double transferAmount(User sender, User receiver, double amount);

}
