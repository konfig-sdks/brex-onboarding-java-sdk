

# Business

Information about the business the application is for.  You can optionally set the `alternate_address`, if the business has an additional address which is different from the  registration address. For instance, for international companies where their operational address may be different  than where the company was incorporated. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**legalName** | **String** | Company legal name. |  [optional] |
|**incorporationType** | [**IncorporationType**](IncorporationType.md) |  |  [optional] |
|**employerIdentificationNumber** | **String** | Company Employer Identification Number(EIN). |  [optional] |
|**websiteUrl** | **String** | Business website (or link to ecommerce store for sellers). |  [optional] |
|**activityDescription** | **String** | Brief description of the business activity. |  [optional] |
|**address** | [**BeneficialOwnerAddress**](BeneficialOwnerAddress.md) |  |  [optional] |
|**beneficialOwners** | [**List&lt;BeneficialOwner&gt;**](BeneficialOwner.md) | List of beneficial owners of the company |  [optional] |
|**alternateAddress** | [**BeneficialOwnerAddress**](BeneficialOwnerAddress.md) |  |  [optional] |



