package com.xproce;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UserTest {

    @Test
    void canAuthenticatUsers() {
        //given
        String login = "xproce";
        String password = "12345";
        User user =  new User(login, password);
        UserConnection userConnection =  new UserConnection(login, password);
        user.setConnectionUserFacade(userConnection);

        assertThat(user.authentication()).isTrue();
    }
}