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
import io.swagger.client.model.Access;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccessApi
 */
@Ignore
public class AccessApiTest {

    private final AccessApi api = new AccessApi();

    
    /**
     * Get access
     *
     * Retrieve the access with **accessId**. The retrieved object does not contain sensitive information such as the PIN.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccessTest() throws ApiException {
        Long accessId = null;
        Access response = api.getAccess(accessId);

        // TODO: test validations
    }
    
    /**
     * List accesses
     *
     * Returns all registered accesses for the authenticated user. Confidential information like the PIN will not be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccessesTest() throws ApiException {
        List<Access> response = api.getAccesses();

        // TODO: test validations
    }
    
}
