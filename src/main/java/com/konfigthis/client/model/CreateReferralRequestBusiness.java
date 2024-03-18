/*
 * Onboarding API
 *  The onboarding API allows you to refer your customers and personal contacts to Brex. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: developer-access@brex.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.BeneficialOwner;
import com.konfigthis.client.model.BeneficialOwnerAddress;
import com.konfigthis.client.model.IncorporationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * CreateReferralRequestBusiness
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateReferralRequestBusiness {
  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_INCORPORATION_TYPE = "incorporation_type";
  @SerializedName(SERIALIZED_NAME_INCORPORATION_TYPE)
  private IncorporationType incorporationType;

  public static final String SERIALIZED_NAME_EMPLOYER_IDENTIFICATION_NUMBER = "employer_identification_number";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_IDENTIFICATION_NUMBER)
  private String employerIdentificationNumber;

  public static final String SERIALIZED_NAME_WEBSITE_URL = "website_url";
  @SerializedName(SERIALIZED_NAME_WEBSITE_URL)
  private String websiteUrl;

  public static final String SERIALIZED_NAME_ACTIVITY_DESCRIPTION = "activity_description";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_DESCRIPTION)
  private String activityDescription;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private BeneficialOwnerAddress address;

  public static final String SERIALIZED_NAME_BENEFICIAL_OWNERS = "beneficial_owners";
  @SerializedName(SERIALIZED_NAME_BENEFICIAL_OWNERS)
  private List<BeneficialOwner> beneficialOwners = null;

  public static final String SERIALIZED_NAME_ALTERNATE_ADDRESS = "alternate_address";
  @SerializedName(SERIALIZED_NAME_ALTERNATE_ADDRESS)
  private BeneficialOwnerAddress alternateAddress;

  public CreateReferralRequestBusiness() {
  }

  public CreateReferralRequestBusiness legalName(String legalName) {
    
    
    
    
    this.legalName = legalName;
    return this;
  }

   /**
   * Company legal name.
   * @return legalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Company legal name.")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    
    
    
    this.legalName = legalName;
  }


  public CreateReferralRequestBusiness incorporationType(IncorporationType incorporationType) {
    
    
    
    
    this.incorporationType = incorporationType;
    return this;
  }

   /**
   * Get incorporationType
   * @return incorporationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncorporationType getIncorporationType() {
    return incorporationType;
  }


  public void setIncorporationType(IncorporationType incorporationType) {
    
    
    
    this.incorporationType = incorporationType;
  }


  public CreateReferralRequestBusiness employerIdentificationNumber(String employerIdentificationNumber) {
    
    
    if (employerIdentificationNumber != null && employerIdentificationNumber.length() < 9) {
      throw new IllegalArgumentException("Invalid value for employerIdentificationNumber. Length must be greater than or equal to 9.");
    }
    
    this.employerIdentificationNumber = employerIdentificationNumber;
    return this;
  }

   /**
   * Company Employer Identification Number(EIN).
   * @return employerIdentificationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Company Employer Identification Number(EIN).")

  public String getEmployerIdentificationNumber() {
    return employerIdentificationNumber;
  }


  public void setEmployerIdentificationNumber(String employerIdentificationNumber) {
    
    
    if (employerIdentificationNumber != null && employerIdentificationNumber.length() < 9) {
      throw new IllegalArgumentException("Invalid value for employerIdentificationNumber. Length must be greater than or equal to 9.");
    }
    this.employerIdentificationNumber = employerIdentificationNumber;
  }


  public CreateReferralRequestBusiness websiteUrl(String websiteUrl) {
    
    
    
    
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * Business website (or link to ecommerce store for sellers).
   * @return websiteUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Business website (or link to ecommerce store for sellers).")

  public String getWebsiteUrl() {
    return websiteUrl;
  }


  public void setWebsiteUrl(String websiteUrl) {
    
    
    
    this.websiteUrl = websiteUrl;
  }


  public CreateReferralRequestBusiness activityDescription(String activityDescription) {
    
    
    
    
    this.activityDescription = activityDescription;
    return this;
  }

   /**
   * Brief description of the business activity.
   * @return activityDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Brief description of the business activity.")

  public String getActivityDescription() {
    return activityDescription;
  }


  public void setActivityDescription(String activityDescription) {
    
    
    
    this.activityDescription = activityDescription;
  }


  public CreateReferralRequestBusiness address(BeneficialOwnerAddress address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BeneficialOwnerAddress getAddress() {
    return address;
  }


  public void setAddress(BeneficialOwnerAddress address) {
    
    
    
    this.address = address;
  }


  public CreateReferralRequestBusiness beneficialOwners(List<BeneficialOwner> beneficialOwners) {
    
    
    
    
    this.beneficialOwners = beneficialOwners;
    return this;
  }

  public CreateReferralRequestBusiness addBeneficialOwnersItem(BeneficialOwner beneficialOwnersItem) {
    if (this.beneficialOwners == null) {
      this.beneficialOwners = new ArrayList<>();
    }
    this.beneficialOwners.add(beneficialOwnersItem);
    return this;
  }

   /**
   * List of beneficial owners of the company
   * @return beneficialOwners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of beneficial owners of the company")

  public List<BeneficialOwner> getBeneficialOwners() {
    return beneficialOwners;
  }


  public void setBeneficialOwners(List<BeneficialOwner> beneficialOwners) {
    
    
    
    this.beneficialOwners = beneficialOwners;
  }


  public CreateReferralRequestBusiness alternateAddress(BeneficialOwnerAddress alternateAddress) {
    
    
    
    
    this.alternateAddress = alternateAddress;
    return this;
  }

   /**
   * Get alternateAddress
   * @return alternateAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BeneficialOwnerAddress getAlternateAddress() {
    return alternateAddress;
  }


  public void setAlternateAddress(BeneficialOwnerAddress alternateAddress) {
    
    
    
    this.alternateAddress = alternateAddress;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CreateReferralRequestBusiness instance itself
   */
  public CreateReferralRequestBusiness putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReferralRequestBusiness createReferralRequestBusiness = (CreateReferralRequestBusiness) o;
    return Objects.equals(this.legalName, createReferralRequestBusiness.legalName) &&
        Objects.equals(this.incorporationType, createReferralRequestBusiness.incorporationType) &&
        Objects.equals(this.employerIdentificationNumber, createReferralRequestBusiness.employerIdentificationNumber) &&
        Objects.equals(this.websiteUrl, createReferralRequestBusiness.websiteUrl) &&
        Objects.equals(this.activityDescription, createReferralRequestBusiness.activityDescription) &&
        Objects.equals(this.address, createReferralRequestBusiness.address) &&
        Objects.equals(this.beneficialOwners, createReferralRequestBusiness.beneficialOwners) &&
        Objects.equals(this.alternateAddress, createReferralRequestBusiness.alternateAddress)&&
        Objects.equals(this.additionalProperties, createReferralRequestBusiness.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalName, incorporationType, employerIdentificationNumber, websiteUrl, activityDescription, address, beneficialOwners, alternateAddress, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReferralRequestBusiness {\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    incorporationType: ").append(toIndentedString(incorporationType)).append("\n");
    sb.append("    employerIdentificationNumber: ").append(toIndentedString(employerIdentificationNumber)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    activityDescription: ").append(toIndentedString(activityDescription)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    beneficialOwners: ").append(toIndentedString(beneficialOwners)).append("\n");
    sb.append("    alternateAddress: ").append(toIndentedString(alternateAddress)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("legal_name");
    openapiFields.add("incorporation_type");
    openapiFields.add("employer_identification_number");
    openapiFields.add("website_url");
    openapiFields.add("activity_description");
    openapiFields.add("address");
    openapiFields.add("beneficial_owners");
    openapiFields.add("alternate_address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateReferralRequestBusiness
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateReferralRequestBusiness.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateReferralRequestBusiness is not found in the empty JSON string", CreateReferralRequestBusiness.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("legal_name").isJsonNull() && (jsonObj.get("legal_name") != null && !jsonObj.get("legal_name").isJsonNull()) && !jsonObj.get("legal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_name").toString()));
      }
      // validate the optional field `incorporation_type`
      if (jsonObj.get("incorporation_type") != null && !jsonObj.get("incorporation_type").isJsonNull()) {
        IncorporationType.validateJsonObject(jsonObj.getAsJsonObject("incorporation_type"));
      }
      if (!jsonObj.get("employer_identification_number").isJsonNull() && (jsonObj.get("employer_identification_number") != null && !jsonObj.get("employer_identification_number").isJsonNull()) && !jsonObj.get("employer_identification_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_identification_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_identification_number").toString()));
      }
      if (!jsonObj.get("website_url").isJsonNull() && (jsonObj.get("website_url") != null && !jsonObj.get("website_url").isJsonNull()) && !jsonObj.get("website_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website_url").toString()));
      }
      if (!jsonObj.get("activity_description").isJsonNull() && (jsonObj.get("activity_description") != null && !jsonObj.get("activity_description").isJsonNull()) && !jsonObj.get("activity_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_description").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        BeneficialOwnerAddress.validateJsonObject(jsonObj.getAsJsonObject("address"));
      }
      if (jsonObj.get("beneficial_owners") != null && !jsonObj.get("beneficial_owners").isJsonNull()) {
        JsonArray jsonArraybeneficialOwners = jsonObj.getAsJsonArray("beneficial_owners");
        if (jsonArraybeneficialOwners != null) {
          // ensure the json data is an array
          if (!jsonObj.get("beneficial_owners").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `beneficial_owners` to be an array in the JSON string but got `%s`", jsonObj.get("beneficial_owners").toString()));
          }

          // validate the optional field `beneficial_owners` (array)
          for (int i = 0; i < jsonArraybeneficialOwners.size(); i++) {
            BeneficialOwner.validateJsonObject(jsonArraybeneficialOwners.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `alternate_address`
      if (jsonObj.get("alternate_address") != null && !jsonObj.get("alternate_address").isJsonNull()) {
        BeneficialOwnerAddress.validateJsonObject(jsonObj.getAsJsonObject("alternate_address"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateReferralRequestBusiness.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateReferralRequestBusiness' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateReferralRequestBusiness> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateReferralRequestBusiness.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateReferralRequestBusiness>() {
           @Override
           public void write(JsonWriter out, CreateReferralRequestBusiness value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateReferralRequestBusiness read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateReferralRequestBusiness instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateReferralRequestBusiness given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateReferralRequestBusiness
  * @throws IOException if the JSON string is invalid with respect to CreateReferralRequestBusiness
  */
  public static CreateReferralRequestBusiness fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateReferralRequestBusiness.class);
  }

 /**
  * Convert an instance of CreateReferralRequestBusiness to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

