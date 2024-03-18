

# Referral


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the referral. |  |
|**referralSignupUrl** | **String** | Signup URL to redirect prospects to complete their onboarding flow.  *Note*: Necessary disclosures must be shown when the prospect clicks on this link.  |  |
|**expiresAt** | **OffsetDateTime** | The time at which this referral link expires. |  |
|**customerEmail** | **String** | Customer&#39;s email address registered for the Brex application. This field is available only if there&#39;s a signup completed.  |  [optional] |
|**status** | **ReferralStatus** |  |  |
|**products** | [**List&lt;Product&gt;**](Product.md) |  |  |



