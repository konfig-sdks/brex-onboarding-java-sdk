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
import com.konfigthis.client.model.BeneficialOwnerAddress;
import com.konfigthis.client.model.BeneficialOwnerIdentityDocument;
import com.konfigthis.client.model.CompanyRelationship;
import com.konfigthis.client.model.Prong;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * Federal law requires us to collect information for anyone who owns 25% or more of the company.
 */
@ApiModel(description = "Federal law requires us to collect information for anyone who owns 25% or more of the company.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BeneficialOwner {
  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_COMPANY_RELATIONSHIP = "company_relationship";
  @SerializedName(SERIALIZED_NAME_COMPANY_RELATIONSHIP)
  private CompanyRelationship companyRelationship;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_IDENTITY_DOCUMENT = "identity_document";
  @SerializedName(SERIALIZED_NAME_IDENTITY_DOCUMENT)
  private BeneficialOwnerIdentityDocument identityDocument;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private BeneficialOwnerAddress address;

  public static final String SERIALIZED_NAME_PRONG = "prong";
  @SerializedName(SERIALIZED_NAME_PRONG)
  private Prong prong;

  public BeneficialOwner() {
  }

  public BeneficialOwner legalName(String legalName) {
    
    
    
    
    this.legalName = legalName;
    return this;
  }

   /**
   * Legal full name.
   * @return legalName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Legal full name.")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    
    
    
    this.legalName = legalName;
  }


  public BeneficialOwner companyRelationship(CompanyRelationship companyRelationship) {
    
    
    
    
    this.companyRelationship = companyRelationship;
    return this;
  }

   /**
   * Get companyRelationship
   * @return companyRelationship
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompanyRelationship getCompanyRelationship() {
    return companyRelationship;
  }


  public void setCompanyRelationship(CompanyRelationship companyRelationship) {
    
    
    
    this.companyRelationship = companyRelationship;
  }


  public BeneficialOwner dateOfBirth(LocalDate dateOfBirth) {
    
    
    
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Date of birth.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of birth.")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    
    
    
    this.dateOfBirth = dateOfBirth;
  }


  public BeneficialOwner identityDocument(BeneficialOwnerIdentityDocument identityDocument) {
    
    
    
    
    this.identityDocument = identityDocument;
    return this;
  }

   /**
   * Get identityDocument
   * @return identityDocument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BeneficialOwnerIdentityDocument getIdentityDocument() {
    return identityDocument;
  }


  public void setIdentityDocument(BeneficialOwnerIdentityDocument identityDocument) {
    
    
    
    this.identityDocument = identityDocument;
  }


  public BeneficialOwner address(BeneficialOwnerAddress address) {
    
    
    
    
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


  public BeneficialOwner prong(Prong prong) {
    
    
    
    
    this.prong = prong;
    return this;
  }

   /**
   * Get prong
   * @return prong
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Prong getProng() {
    return prong;
  }


  public void setProng(Prong prong) {
    
    
    
    this.prong = prong;
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
   * @return the BeneficialOwner instance itself
   */
  public BeneficialOwner putAdditionalProperty(String key, Object value) {
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
    BeneficialOwner beneficialOwner = (BeneficialOwner) o;
    return Objects.equals(this.legalName, beneficialOwner.legalName) &&
        Objects.equals(this.companyRelationship, beneficialOwner.companyRelationship) &&
        Objects.equals(this.dateOfBirth, beneficialOwner.dateOfBirth) &&
        Objects.equals(this.identityDocument, beneficialOwner.identityDocument) &&
        Objects.equals(this.address, beneficialOwner.address) &&
        Objects.equals(this.prong, beneficialOwner.prong)&&
        Objects.equals(this.additionalProperties, beneficialOwner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalName, companyRelationship, dateOfBirth, identityDocument, address, prong, additionalProperties);
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
    sb.append("class BeneficialOwner {\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    companyRelationship: ").append(toIndentedString(companyRelationship)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    identityDocument: ").append(toIndentedString(identityDocument)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    prong: ").append(toIndentedString(prong)).append("\n");
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
    openapiFields.add("company_relationship");
    openapiFields.add("date_of_birth");
    openapiFields.add("identity_document");
    openapiFields.add("address");
    openapiFields.add("prong");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("legal_name");
    openapiRequiredFields.add("prong");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BeneficialOwner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BeneficialOwner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BeneficialOwner is not found in the empty JSON string", BeneficialOwner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BeneficialOwner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("legal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_name").toString()));
      }
      // validate the optional field `company_relationship`
      if (jsonObj.get("company_relationship") != null && !jsonObj.get("company_relationship").isJsonNull()) {
        CompanyRelationship.validateJsonObject(jsonObj.getAsJsonObject("company_relationship"));
      }
      // validate the optional field `identity_document`
      if (jsonObj.get("identity_document") != null && !jsonObj.get("identity_document").isJsonNull()) {
        BeneficialOwnerIdentityDocument.validateJsonObject(jsonObj.getAsJsonObject("identity_document"));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        BeneficialOwnerAddress.validateJsonObject(jsonObj.getAsJsonObject("address"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BeneficialOwner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BeneficialOwner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BeneficialOwner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BeneficialOwner.class));

       return (TypeAdapter<T>) new TypeAdapter<BeneficialOwner>() {
           @Override
           public void write(JsonWriter out, BeneficialOwner value) throws IOException {
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
           public BeneficialOwner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BeneficialOwner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BeneficialOwner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BeneficialOwner
  * @throws IOException if the JSON string is invalid with respect to BeneficialOwner
  */
  public static BeneficialOwner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BeneficialOwner.class);
  }

 /**
  * Convert an instance of BeneficialOwner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

