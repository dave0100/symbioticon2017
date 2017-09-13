/*
 * YOMO-Service-Emulation with AHOI
 * [Data Privacy](/sandboxmanager/#/privacy)  [Terms of Service](/sandboxmanager/#/terms)  [Imprint](https://sparkassen-hub.com/impressum/)  &copy; 2017 Starfinanz - Ein Unternehmen der Finanz Informatik
 *
 * OpenAPI spec version: 2.1.0-yomo-emulator
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Account;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
@Ignore
public class AccountApiTest {

    private final AccountApi api = new AccountApi();

    
    /**
     * Get account
     *
     * Returns the account identified by **accountId**.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountTest() throws ApiException {
        Long accessId = null;
        Long accountId = null;
        Account response = api.getAccount(accessId, accountId);

        // TODO: test validations
    }
    
    /**
     * List accounts
     *
     * Retrieve all accounts for the current user under the **accessId**.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountsTest() throws ApiException {
        Long accessId = null;
        List<Account> response = api.getAccounts(accessId);

        // TODO: test validations
    }
    
}