# ReferralsApi

All URIs are relative to *https://platform.brexapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewReferral**](ReferralsApi.md#createNewReferral) | **POST** /v1/referrals | Creates a referral |
| [**getById**](ReferralsApi.md#getById) | **GET** /v1/referrals/{id} | Gets a referral by ID |
| [**getList**](ReferralsApi.md#getList) | **GET** /v1/referrals | List referrals |
| [**uploadDocument**](ReferralsApi.md#uploadDocument) | **POST** /v1/referrals/{id}/document_upload | Create a new document upload |


<a name="createNewReferral"></a>
# **createNewReferral**
> Referral createNewReferral(createReferralRequest).execute();

Creates a referral

This creates new referrals. The response will contain an identifier and a unique personalized link to an application flow. Many fields are optional and when they&#39;re provided they&#39;ll prefill the application flow for Brex.  You should handle and store these references securely as they contain sensitive information about the referral.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexOnboarding;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReferralsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    BrexOnboarding client = new BrexOnboarding(configuration);
    String referralCode = "referralCode_example"; // Referral code that attributes credit to you if the prospect signs up for a Brex account.
    Applicant applicant = new Applicant();
    CreateReferralRequestBusiness business = new CreateReferralRequestBusiness();
    ContactPreference contactPreference = new ContactPreference();
    try {
      Referral result = client
              .referrals
              .createNewReferral(referralCode, applicant)
              .business(business)
              .contactPreference(contactPreference)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getReferralSignupUrl());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getCustomerEmail());
      System.out.println(result.getStatus());
      System.out.println(result.getProducts());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#createNewReferral");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Referral> response = client
              .referrals
              .createNewReferral(referralCode, applicant)
              .business(business)
              .contactPreference(contactPreference)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#createNewReferral");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createReferralRequest** | [**CreateReferralRequest**](CreateReferralRequest.md)|  | |

### Return type

[**Referral**](Referral.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | createReferralRequest 200 response |  -  |
| **401** | Unauthorized |  -  |

<a name="getById"></a>
# **getById**
> Referral getById(id).execute();

Gets a referral by ID

Returns a referral object by ID if it exists.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexOnboarding;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReferralsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    BrexOnboarding client = new BrexOnboarding(configuration);
    String id = "id_example";
    try {
      Referral result = client
              .referrals
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getReferralSignupUrl());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getCustomerEmail());
      System.out.println(result.getStatus());
      System.out.println(result.getProducts());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Referral> response = client
              .referrals
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**Referral**](Referral.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | getReferral 200 response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Referral not found |  -  |

<a name="getList"></a>
# **getList**
> ReferralPage getList().cursor(cursor).execute();

List referrals

Returns referrals created. *Note*: This doesn&#39;t include referrals that have expired. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexOnboarding;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReferralsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    BrexOnboarding client = new BrexOnboarding(configuration);
    String cursor = "cursor_example";
    try {
      ReferralPage result = client
              .referrals
              .getList()
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextCursor());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReferralPage> response = client
              .referrals
              .getList()
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cursor** | **String**|  | [optional] |

### Return type

[**ReferralPage**](ReferralPage.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | listReferrals 200 response |  -  |
| **400** | Invalid cursor |  -  |
| **401** | Unauthorized |  -  |

<a name="uploadDocument"></a>
# **uploadDocument**
> Document uploadDocument(id, createDocumentRequest).execute();

Create a new document upload

 The &#x60;uri&#x60; will be a presigned S3 URL allowing you to upload the referral doc securely. This URL can only be used for a &#x60;PUT&#x60; operation and expires 30 minutes after its creation. Once your upload is complete, we will use this to prefill the application.  Refer to these [docs](https://docs.aws.amazon.com/AmazonS3/latest/dev/PresignedUrlUploadObject.html) on how to upload to this presigned S3 URL. We highly recommend using one of AWS SDKs if they&#39;re available for your language to upload these files. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexOnboarding;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReferralsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    BrexOnboarding client = new BrexOnboarding(configuration);
    DocumentType type = DocumentType.fromValue("ARTICLES_OF_INCORPORATION");
    String id = "id_example";
    try {
      Document result = client
              .referrals
              .uploadDocument(type, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getUri());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#uploadDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Document> response = client
              .referrals
              .uploadDocument(type, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#uploadDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **createDocumentRequest** | [**CreateDocumentRequest**](CreateDocumentRequest.md)|  | |

### Return type

[**Document**](Document.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | createDocument 200 response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Referral not found |  -  |

