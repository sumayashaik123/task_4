import java.util.Scanner;

public class User {
    private String userId;
    private String pin;
    private double balance;

    public User(String userId, String pin, double balance) {
        this.userId = userId;
        this.pin = pin;
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public boolean login(String enteredUserId, String enteredPin) {
        return userId.equals(enteredUserId) && pin.equals(enteredPin);
    }

    public void updateProfile(String newUserId, String newPin) {
        userId = newUserId;
        pin = newPin;
    }

    public void updatePassword(String newPassword) {
        pin = newPassword;
    }

    public void logout() {
        System.out.println("Logout successful");
    }

    
}
