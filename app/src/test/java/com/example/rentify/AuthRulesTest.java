package com.example.rentify;

import static org.junit.Assert.*;
import org.junit.Test;

public class AuthRulesTest {

    @Test public void admin_correctCredentials_isAdmin() {
        assertTrue(AuthRules.isAdmin(AuthRules.ADMIN_USERNAME, AuthRules.ADMIN_PASSWORD));
    }
    @Test public void admin_wrongPassword_isNotAdmin() {
        assertFalse(AuthRules.isAdmin("admin", "wrong"));
    }
    @Test public void admin_wrongUsername_isNotAdmin() {
        assertFalse(AuthRules.isAdmin("user", AuthRules.ADMIN_PASSWORD));
    }
    @Test public void admin_isCaseSensitive() {
        assertFalse(AuthRules.isAdmin("Admin", AuthRules.ADMIN_PASSWORD));
    }
    @Test public void admin_nulls_isNotAdmin() {
        assertFalse(AuthRules.isAdmin(null, null));
    }
    @Test public void credentials_present_areValid() {
        assertTrue(AuthRules.hasCredentials("marieva", "pw123"));
    }
    @Test public void credentials_emptyPassword_areInvalid() {
        assertFalse(AuthRules.hasCredentials("marieva", ""));
    }
}
