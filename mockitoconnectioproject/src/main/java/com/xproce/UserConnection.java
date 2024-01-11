package com.xproce;

public class UserConnection implements ConnectionUserFacade {

    private String login;
    private String pasword;

    public UserConnection(String login, String pasword) {
        this.login = login;
        this.pasword = pasword;
    }

    @Override
    public boolean authenticate(String login, String password) {
        if(Credentials.credentials.containsKey(login)){
            if(password.equals(Credentials.credentials.get(login))){
                return true ;
            }
        }
        return false;
    }
}
