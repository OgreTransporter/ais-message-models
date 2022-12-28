/*
 * Ais-Stream WebsocketObjects
 * OpenAPI 3.0 definitions for the data models used by aisstream.io.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.BinaryAcknowledgeDestinations0;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * BinaryAcknowledgeDestinations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-27T20:06:28.639799-05:00[America/Toronto]")
public class BinaryAcknowledgeDestinations {
  public static final String SERIALIZED_NAME_0 = "0";
  @SerializedName(SERIALIZED_NAME_0)
  private BinaryAcknowledgeDestinations0 _0;

  public static final String SERIALIZED_NAME_1 = "1";
  @SerializedName(SERIALIZED_NAME_1)
  private BinaryAcknowledgeDestinations0 _1;

  public static final String SERIALIZED_NAME_2 = "2";
  @SerializedName(SERIALIZED_NAME_2)
  private BinaryAcknowledgeDestinations0 _2;

  public static final String SERIALIZED_NAME_3 = "3";
  @SerializedName(SERIALIZED_NAME_3)
  private BinaryAcknowledgeDestinations0 _3;

  public BinaryAcknowledgeDestinations() { 
  }

  public BinaryAcknowledgeDestinations _0(BinaryAcknowledgeDestinations0 _0) {
    
    this._0 = _0;
    return this;
  }

   /**
   * Get _0
   * @return _0
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BinaryAcknowledgeDestinations0 get0() {
    return _0;
  }


  public void set0(BinaryAcknowledgeDestinations0 _0) {
    this._0 = _0;
  }


  public BinaryAcknowledgeDestinations _1(BinaryAcknowledgeDestinations0 _1) {
    
    this._1 = _1;
    return this;
  }

   /**
   * Get _1
   * @return _1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BinaryAcknowledgeDestinations0 get1() {
    return _1;
  }


  public void set1(BinaryAcknowledgeDestinations0 _1) {
    this._1 = _1;
  }


  public BinaryAcknowledgeDestinations _2(BinaryAcknowledgeDestinations0 _2) {
    
    this._2 = _2;
    return this;
  }

   /**
   * Get _2
   * @return _2
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BinaryAcknowledgeDestinations0 get2() {
    return _2;
  }


  public void set2(BinaryAcknowledgeDestinations0 _2) {
    this._2 = _2;
  }


  public BinaryAcknowledgeDestinations _3(BinaryAcknowledgeDestinations0 _3) {
    
    this._3 = _3;
    return this;
  }

   /**
   * Get _3
   * @return _3
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BinaryAcknowledgeDestinations0 get3() {
    return _3;
  }


  public void set3(BinaryAcknowledgeDestinations0 _3) {
    this._3 = _3;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinaryAcknowledgeDestinations binaryAcknowledgeDestinations = (BinaryAcknowledgeDestinations) o;
    return Objects.equals(this._0, binaryAcknowledgeDestinations._0) &&
        Objects.equals(this._1, binaryAcknowledgeDestinations._1) &&
        Objects.equals(this._2, binaryAcknowledgeDestinations._2) &&
        Objects.equals(this._3, binaryAcknowledgeDestinations._3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_0, _1, _2, _3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinaryAcknowledgeDestinations {\n");
    sb.append("    _0: ").append(toIndentedString(_0)).append("\n");
    sb.append("    _1: ").append(toIndentedString(_1)).append("\n");
    sb.append("    _2: ").append(toIndentedString(_2)).append("\n");
    sb.append("    _3: ").append(toIndentedString(_3)).append("\n");
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
    openapiFields.add("0");
    openapiFields.add("1");
    openapiFields.add("2");
    openapiFields.add("3");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("0");
    openapiRequiredFields.add("1");
    openapiRequiredFields.add("2");
    openapiRequiredFields.add("3");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BinaryAcknowledgeDestinations
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BinaryAcknowledgeDestinations.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BinaryAcknowledgeDestinations is not found in the empty JSON string", BinaryAcknowledgeDestinations.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BinaryAcknowledgeDestinations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BinaryAcknowledgeDestinations` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BinaryAcknowledgeDestinations.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `0`
      if (jsonObj.getAsJsonObject("0") != null) {
        BinaryAcknowledgeDestinations0.validateJsonObject(jsonObj.getAsJsonObject("0"));
      }
      // validate the optional field `1`
      if (jsonObj.getAsJsonObject("1") != null) {
        BinaryAcknowledgeDestinations0.validateJsonObject(jsonObj.getAsJsonObject("1"));
      }
      // validate the optional field `2`
      if (jsonObj.getAsJsonObject("2") != null) {
        BinaryAcknowledgeDestinations0.validateJsonObject(jsonObj.getAsJsonObject("2"));
      }
      // validate the optional field `3`
      if (jsonObj.getAsJsonObject("3") != null) {
        BinaryAcknowledgeDestinations0.validateJsonObject(jsonObj.getAsJsonObject("3"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BinaryAcknowledgeDestinations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BinaryAcknowledgeDestinations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BinaryAcknowledgeDestinations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BinaryAcknowledgeDestinations.class));

       return (TypeAdapter<T>) new TypeAdapter<BinaryAcknowledgeDestinations>() {
           @Override
           public void write(JsonWriter out, BinaryAcknowledgeDestinations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BinaryAcknowledgeDestinations read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BinaryAcknowledgeDestinations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BinaryAcknowledgeDestinations
  * @throws IOException if the JSON string is invalid with respect to BinaryAcknowledgeDestinations
  */
  public static BinaryAcknowledgeDestinations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BinaryAcknowledgeDestinations.class);
  }

 /**
  * Convert an instance of BinaryAcknowledgeDestinations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

