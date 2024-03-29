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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Either a US SSN or US/international passport.
 */
@JsonAdapter(IdentityDocumentType.Adapter.class)public enum IdentityDocumentType {
  
  SSN("SSN"),
  
  PASSPORT("PASSPORT");

  private String value;

  IdentityDocumentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IdentityDocumentType fromValue(String value) {
    for (IdentityDocumentType b : IdentityDocumentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<IdentityDocumentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final IdentityDocumentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IdentityDocumentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IdentityDocumentType.fromValue(value);
    }
  }
}

