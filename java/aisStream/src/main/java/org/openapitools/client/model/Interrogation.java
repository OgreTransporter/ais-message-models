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
import org.openapitools.client.model.InterrogationStation1Msg1;
import org.openapitools.client.model.InterrogationStation1Msg2;
import org.openapitools.client.model.InterrogationStation2;

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
 * Interrogation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-27T20:06:28.639799-05:00[America/Toronto]")
public class Interrogation {
  public static final String SERIALIZED_NAME_MESSAGE_I_D = "MessageID";
  @SerializedName(SERIALIZED_NAME_MESSAGE_I_D)
  private Integer messageID;

  public static final String SERIALIZED_NAME_REPEAT_INDICATOR = "RepeatIndicator";
  @SerializedName(SERIALIZED_NAME_REPEAT_INDICATOR)
  private Integer repeatIndicator;

  public static final String SERIALIZED_NAME_USER_I_D = "UserID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private Integer userID;

  public static final String SERIALIZED_NAME_VALID = "Valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_SPARE = "Spare";
  @SerializedName(SERIALIZED_NAME_SPARE)
  private Integer spare;

  public static final String SERIALIZED_NAME_STATION1_MSG1 = "Station1Msg1";
  @SerializedName(SERIALIZED_NAME_STATION1_MSG1)
  private InterrogationStation1Msg1 station1Msg1;

  public static final String SERIALIZED_NAME_STATION1_MSG2 = "Station1Msg2";
  @SerializedName(SERIALIZED_NAME_STATION1_MSG2)
  private InterrogationStation1Msg2 station1Msg2;

  public static final String SERIALIZED_NAME_STATION2 = "Station2";
  @SerializedName(SERIALIZED_NAME_STATION2)
  private InterrogationStation2 station2;

  public Interrogation() { 
  }

  public Interrogation messageID(Integer messageID) {
    
    this.messageID = messageID;
    return this;
  }

   /**
   * Get messageID
   * @return messageID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMessageID() {
    return messageID;
  }


  public void setMessageID(Integer messageID) {
    this.messageID = messageID;
  }


  public Interrogation repeatIndicator(Integer repeatIndicator) {
    
    this.repeatIndicator = repeatIndicator;
    return this;
  }

   /**
   * Get repeatIndicator
   * @return repeatIndicator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getRepeatIndicator() {
    return repeatIndicator;
  }


  public void setRepeatIndicator(Integer repeatIndicator) {
    this.repeatIndicator = repeatIndicator;
  }


  public Interrogation userID(Integer userID) {
    
    this.userID = userID;
    return this;
  }

   /**
   * Get userID
   * @return userID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getUserID() {
    return userID;
  }


  public void setUserID(Integer userID) {
    this.userID = userID;
  }


  public Interrogation valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public Interrogation spare(Integer spare) {
    
    this.spare = spare;
    return this;
  }

   /**
   * Get spare
   * @return spare
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSpare() {
    return spare;
  }


  public void setSpare(Integer spare) {
    this.spare = spare;
  }


  public Interrogation station1Msg1(InterrogationStation1Msg1 station1Msg1) {
    
    this.station1Msg1 = station1Msg1;
    return this;
  }

   /**
   * Get station1Msg1
   * @return station1Msg1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InterrogationStation1Msg1 getStation1Msg1() {
    return station1Msg1;
  }


  public void setStation1Msg1(InterrogationStation1Msg1 station1Msg1) {
    this.station1Msg1 = station1Msg1;
  }


  public Interrogation station1Msg2(InterrogationStation1Msg2 station1Msg2) {
    
    this.station1Msg2 = station1Msg2;
    return this;
  }

   /**
   * Get station1Msg2
   * @return station1Msg2
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InterrogationStation1Msg2 getStation1Msg2() {
    return station1Msg2;
  }


  public void setStation1Msg2(InterrogationStation1Msg2 station1Msg2) {
    this.station1Msg2 = station1Msg2;
  }


  public Interrogation station2(InterrogationStation2 station2) {
    
    this.station2 = station2;
    return this;
  }

   /**
   * Get station2
   * @return station2
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InterrogationStation2 getStation2() {
    return station2;
  }


  public void setStation2(InterrogationStation2 station2) {
    this.station2 = station2;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Interrogation interrogation = (Interrogation) o;
    return Objects.equals(this.messageID, interrogation.messageID) &&
        Objects.equals(this.repeatIndicator, interrogation.repeatIndicator) &&
        Objects.equals(this.userID, interrogation.userID) &&
        Objects.equals(this.valid, interrogation.valid) &&
        Objects.equals(this.spare, interrogation.spare) &&
        Objects.equals(this.station1Msg1, interrogation.station1Msg1) &&
        Objects.equals(this.station1Msg2, interrogation.station1Msg2) &&
        Objects.equals(this.station2, interrogation.station2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, spare, station1Msg1, station1Msg2, station2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Interrogation {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    spare: ").append(toIndentedString(spare)).append("\n");
    sb.append("    station1Msg1: ").append(toIndentedString(station1Msg1)).append("\n");
    sb.append("    station1Msg2: ").append(toIndentedString(station1Msg2)).append("\n");
    sb.append("    station2: ").append(toIndentedString(station2)).append("\n");
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
    openapiFields.add("MessageID");
    openapiFields.add("RepeatIndicator");
    openapiFields.add("UserID");
    openapiFields.add("Valid");
    openapiFields.add("Spare");
    openapiFields.add("Station1Msg1");
    openapiFields.add("Station1Msg2");
    openapiFields.add("Station2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("Spare");
    openapiRequiredFields.add("Station1Msg1");
    openapiRequiredFields.add("Station1Msg2");
    openapiRequiredFields.add("Station2");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Interrogation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Interrogation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Interrogation is not found in the empty JSON string", Interrogation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Interrogation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Interrogation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Interrogation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `Station1Msg1`
      if (jsonObj.getAsJsonObject("Station1Msg1") != null) {
        InterrogationStation1Msg1.validateJsonObject(jsonObj.getAsJsonObject("Station1Msg1"));
      }
      // validate the optional field `Station1Msg2`
      if (jsonObj.getAsJsonObject("Station1Msg2") != null) {
        InterrogationStation1Msg2.validateJsonObject(jsonObj.getAsJsonObject("Station1Msg2"));
      }
      // validate the optional field `Station2`
      if (jsonObj.getAsJsonObject("Station2") != null) {
        InterrogationStation2.validateJsonObject(jsonObj.getAsJsonObject("Station2"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Interrogation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Interrogation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Interrogation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Interrogation.class));

       return (TypeAdapter<T>) new TypeAdapter<Interrogation>() {
           @Override
           public void write(JsonWriter out, Interrogation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Interrogation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Interrogation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Interrogation
  * @throws IOException if the JSON string is invalid with respect to Interrogation
  */
  public static Interrogation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Interrogation.class);
  }

 /**
  * Convert an instance of Interrogation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

