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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Transaction;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionApi {
    private ApiClient apiClient;

    public TransactionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getTransaction
     * @param accessId The **accessId** for the transaction to retrieve (required)
     * @param accountId The **accountId** for the transaction to retrieve (required)
     * @param transactionId The **transactionId** for the pattern to retrieve (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTransactionCall(Long accessId, Long accountId, Long transactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accesses/{accessId}/accounts/{accountId}/transactions/{transactionId}"
            .replaceAll("\\{" + "accessId" + "\\}", apiClient.escapeString(accessId.toString()))
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTransactionValidateBeforeCall(Long accessId, Long accountId, Long transactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessId' is set
        if (accessId == null) {
            throw new ApiException("Missing the required parameter 'accessId' when calling getTransaction(Async)");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getTransaction(Async)");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling getTransaction(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getTransactionCall(accessId, accountId, transactionId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get transaction
     * Returns the transaction identified by **transactionId** in relationship with **accountId**.
     * @param accessId The **accessId** for the transaction to retrieve (required)
     * @param accountId The **accountId** for the transaction to retrieve (required)
     * @param transactionId The **transactionId** for the pattern to retrieve (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Transaction getTransaction(Long accessId, Long accountId, Long transactionId) throws ApiException {
        ApiResponse<Transaction> resp = getTransactionWithHttpInfo(accessId, accountId, transactionId);
        return resp.getData();
    }

    /**
     * Get transaction
     * Returns the transaction identified by **transactionId** in relationship with **accountId**.
     * @param accessId The **accessId** for the transaction to retrieve (required)
     * @param accountId The **accountId** for the transaction to retrieve (required)
     * @param transactionId The **transactionId** for the pattern to retrieve (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Transaction> getTransactionWithHttpInfo(Long accessId, Long accountId, Long transactionId) throws ApiException {
        com.squareup.okhttp.Call call = getTransactionValidateBeforeCall(accessId, accountId, transactionId, null, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get transaction (asynchronously)
     * Returns the transaction identified by **transactionId** in relationship with **accountId**.
     * @param accessId The **accessId** for the transaction to retrieve (required)
     * @param accountId The **accountId** for the transaction to retrieve (required)
     * @param transactionId The **transactionId** for the pattern to retrieve (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTransactionAsync(Long accessId, Long accountId, Long transactionId, final ApiCallback<Transaction> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTransactionValidateBeforeCall(accessId, accountId, transactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listTransactions
     * @param accessId The **accessId** for which to retrieve transactions. (required)
     * @param accountId The **accountId** for which to retrieve transactions. (required)
     * @param maxAge Optional — indicates the maximum acceptable timeframe (in seconds) since the last refresh of the given account. (optional)
     * @param limit Optional — limit the number of returned transactions (optional)
     * @param offset Optional — skip the first **offset** transactions in result (optional)
     * @param from Optional — only return transactions with booking date later than **from**; an ISO8601 Month(2014-11), Date (2014-11-17) or DateTime         (2014-11-17T12:00:00Z) (optional)
     * @param to Optional — only return transactions with booking date prior or equal to **to**; an ISO8601 Date, Month or DateTime (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listTransactionsCall(Long accessId, Long accountId, Long maxAge, Integer limit, Integer offset, String from, String to, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accesses/{accessId}/accounts/{accountId}/transactions"
            .replaceAll("\\{" + "accessId" + "\\}", apiClient.escapeString(accessId.toString()))
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (maxAge != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "max-age", maxAge));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        if (to != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listTransactionsValidateBeforeCall(Long accessId, Long accountId, Long maxAge, Integer limit, Integer offset, String from, String to, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessId' is set
        if (accessId == null) {
            throw new ApiException("Missing the required parameter 'accessId' when calling listTransactions(Async)");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listTransactions(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listTransactionsCall(accessId, accountId, maxAge, limit, offset, from, to, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List transactions for account
     * Retrieve all transactions for **accountId**.
     * @param accessId The **accessId** for which to retrieve transactions. (required)
     * @param accountId The **accountId** for which to retrieve transactions. (required)
     * @param maxAge Optional — indicates the maximum acceptable timeframe (in seconds) since the last refresh of the given account. (optional)
     * @param limit Optional — limit the number of returned transactions (optional)
     * @param offset Optional — skip the first **offset** transactions in result (optional)
     * @param from Optional — only return transactions with booking date later than **from**; an ISO8601 Month(2014-11), Date (2014-11-17) or DateTime         (2014-11-17T12:00:00Z) (optional)
     * @param to Optional — only return transactions with booking date prior or equal to **to**; an ISO8601 Date, Month or DateTime (optional)
     * @return List&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Transaction> listTransactions(Long accessId, Long accountId, Long maxAge, Integer limit, Integer offset, String from, String to) throws ApiException {
        ApiResponse<List<Transaction>> resp = listTransactionsWithHttpInfo(accessId, accountId, maxAge, limit, offset, from, to);
        return resp.getData();
    }

    /**
     * List transactions for account
     * Retrieve all transactions for **accountId**.
     * @param accessId The **accessId** for which to retrieve transactions. (required)
     * @param accountId The **accountId** for which to retrieve transactions. (required)
     * @param maxAge Optional — indicates the maximum acceptable timeframe (in seconds) since the last refresh of the given account. (optional)
     * @param limit Optional — limit the number of returned transactions (optional)
     * @param offset Optional — skip the first **offset** transactions in result (optional)
     * @param from Optional — only return transactions with booking date later than **from**; an ISO8601 Month(2014-11), Date (2014-11-17) or DateTime         (2014-11-17T12:00:00Z) (optional)
     * @param to Optional — only return transactions with booking date prior or equal to **to**; an ISO8601 Date, Month or DateTime (optional)
     * @return ApiResponse&lt;List&lt;Transaction&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Transaction>> listTransactionsWithHttpInfo(Long accessId, Long accountId, Long maxAge, Integer limit, Integer offset, String from, String to) throws ApiException {
        com.squareup.okhttp.Call call = listTransactionsValidateBeforeCall(accessId, accountId, maxAge, limit, offset, from, to, null, null);
        Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List transactions for account (asynchronously)
     * Retrieve all transactions for **accountId**.
     * @param accessId The **accessId** for which to retrieve transactions. (required)
     * @param accountId The **accountId** for which to retrieve transactions. (required)
     * @param maxAge Optional — indicates the maximum acceptable timeframe (in seconds) since the last refresh of the given account. (optional)
     * @param limit Optional — limit the number of returned transactions (optional)
     * @param offset Optional — skip the first **offset** transactions in result (optional)
     * @param from Optional — only return transactions with booking date later than **from**; an ISO8601 Month(2014-11), Date (2014-11-17) or DateTime         (2014-11-17T12:00:00Z) (optional)
     * @param to Optional — only return transactions with booking date prior or equal to **to**; an ISO8601 Date, Month or DateTime (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listTransactionsAsync(Long accessId, Long accountId, Long maxAge, Integer limit, Integer offset, String from, String to, final ApiCallback<List<Transaction>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listTransactionsValidateBeforeCall(accessId, accountId, maxAge, limit, offset, from, to, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}