<div align="left">

[![Visit Brex](./header.png)](https://brex.com)

# [Brex](https://brex.com)


The onboarding API allows you to refer your customers and personal contacts to Brex.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Brex&serviceName=Onboarding&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>brex-onboarding-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:brex-onboarding-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/brex-onboarding-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://platform.brexapis.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ReferralsApi* | [**createNewReferral**](docs/ReferralsApi.md#createNewReferral) | **POST** /v1/referrals | Creates a referral
*ReferralsApi* | [**getById**](docs/ReferralsApi.md#getById) | **GET** /v1/referrals/{id} | Gets a referral by ID
*ReferralsApi* | [**getList**](docs/ReferralsApi.md#getList) | **GET** /v1/referrals | List referrals
*ReferralsApi* | [**uploadDocument**](docs/ReferralsApi.md#uploadDocument) | **POST** /v1/referrals/{id}/document_upload | Create a new document upload


## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountInstructions](docs/AccountInstructions.md)
 - [Address](docs/Address.md)
 - [Applicant](docs/Applicant.md)
 - [Application](docs/Application.md)
 - [ApplicationStatus](docs/ApplicationStatus.md)
 - [BeneficialOwner](docs/BeneficialOwner.md)
 - [BeneficialOwnerAddress](docs/BeneficialOwnerAddress.md)
 - [BeneficialOwnerIdentityDocument](docs/BeneficialOwnerIdentityDocument.md)
 - [Business](docs/Business.md)
 - [Cash](docs/Cash.md)
 - [CompanyRelationship](docs/CompanyRelationship.md)
 - [ContactPreference](docs/ContactPreference.md)
 - [CreateDocumentRequest](docs/CreateDocumentRequest.md)
 - [CreateReferralRequest](docs/CreateReferralRequest.md)
 - [CreateReferralRequestBusiness](docs/CreateReferralRequestBusiness.md)
 - [Document](docs/Document.md)
 - [DocumentType](docs/DocumentType.md)
 - [DomesticInstruction](docs/DomesticInstruction.md)
 - [IdentityDocument](docs/IdentityDocument.md)
 - [IdentityDocumentType](docs/IdentityDocumentType.md)
 - [IncorporationType](docs/IncorporationType.md)
 - [Instruction](docs/Instruction.md)
 - [InternationalInstruction](docs/InternationalInstruction.md)
 - [Product](docs/Product.md)
 - [Prong](docs/Prong.md)
 - [Referral](docs/Referral.md)
 - [ReferralPage](docs/ReferralPage.md)
 - [ReferralStatus](docs/ReferralStatus.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
