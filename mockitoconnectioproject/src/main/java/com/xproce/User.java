package com.xproce;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String login;
    private String pasword;

    private ConnectionUserFacade connectionUserFacade;

    public User(String login, String pasword) {
        this.login = login;
        this.pasword = pasword;
    }

    public boolean authentication() {
        boolean authenticated = connectionUserFacade.authenticate(this.login, this.pasword);
        if (authenticated) {
            System.out.println("the user" + login + "is authenticated successfully");
            return true;
        } else {
            System.out.println("we cannot log in the user" + login + ", the credentials are false.");
            return false;
        }
    }

}
