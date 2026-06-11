package com.musaib;

public class BankMgmtSystem {

    public static void main(String args[]) {

        User u1 = new User();
        u1.login();
        u1.check("abcd", "sit@123");
        u1.logout();

    }
}

class Login {
    String userName = "abc";
    String pass = "sit@123";

    void check(String u, String p) {
        if (u == userName && p == pass) {
            System.out.println("Logic Successfully..");
        } else {
            System.out.println("Invalid login credentials.");
        }
    }
}

class User extends Login {
    String user = "John";

    public void login() {
        System.out.println("User login successfully..");
    }

    public void logout() {
        System.out.println("User Logout");
    }
}

