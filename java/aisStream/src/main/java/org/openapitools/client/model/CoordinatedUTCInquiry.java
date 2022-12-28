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
 * CoordinatedUTCInquiry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-27T20:06:28.639799-05:00[America/Toronto]")
public class CoordinatedUTCInquiry {
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

  public static final String SERIALIZED_NAME_SPARE1 = "Spare1";
  @SerializedName(SERIALIZED_NAME_SPARE1)
  private Integer spare1;

  public static final String SERIALIZED_NAME_DESTINATION_I_D = "DestinationID";
  @SerializedName(SERIALIZED_NAME_DESTINATION_I_D)
  private Integer destinationID;

  public static final String SERIALIZED_NAME_SPARE2 = "Spare2";
  @SerializedName(SERIALIZED_NAME_SPARE2)
  private Integer spare2;

  public CoordinatedUTCInquiry() { 
  }

  public CoordinatedUTCInquiry messageID(Integer messageID) {
    
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


  public CoordinatedUTCInquiry repeatIndicator(Integer repeatIndicator) {
    
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


  public CoordinatedUTCInquiry userID(Integer userID) {
    
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


  public CoordinatedUTCInquiry valid(Boolean valid) {
    
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


  public CoordinatedUTCInquiry spare1(Integer spare1) {
    
    this.spare1 = spare1;
    return this;
  }

   /**
   * Get spare1
   * @return spare1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSpare1() {
    return spare1;
  }


  public void setSpare1(Integer spare1) {
    this.spare1 = spare1;
  }


  public CoordinatedUTCInquiry destinationID(Integer destinationID) {
    
    this.destinationID = destinationID;
    return this;
  }

   /**
   * Get destinationID
   * @return destinationID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDestinationID() {
    return destinationID;
  }


  public void setDestinationID(Integer destinationID) {
    this.destinationID = destinationID;
  }


  public CoordinatedUTCInquiry spare2(Integer spare2) {
    
    this.spare2 = spare2;
    return this;
  }

   /**
   * Get spare2
   * @return spare2
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSpare2() {
    return spare2;
  }


  public void setSpare2(Integer spare2) {
    this.spare2 = spare2;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoordinatedUTCInquiry coordinatedUTCInquiry = (CoordinatedUTCInquiry) o;
    return Objects.equals(this.messageID, coordinatedUTCInquiry.messageID) &&
        Objects.equals(this.repeatIndicator, coordinatedUTCInquiry.repeatIndicator) &&
        Objects.equals(this.userID, coordinatedUTCInquiry.userID) &&
        Objects.equals(this.valid, coordinatedUTCInquiry.valid) &&
        Objects.equals(this.spare1, coordinatedUTCInquiry.spare1) &&
        Objects.equals(this.destinationID, coordinatedUTCInquiry.destinationID) &&
        Objects.equals(this.spare2, coordinatedUTCInquiry.spare2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, spare1, destinationID, spare2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoordinatedUTCInquiry {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    spare1: ").append(toIndentedString(spare1)).append("\n");
    sb.append("    destinationID: ").append(toIndentedString(destinationID)).append("\n");
    sb.append("    spare2: ").append(toIndentedString(spare2)).append("\n");
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
    openapiFields.add("Spare1");
    openapiFields.add("DestinationID");
    openapiFields.add("Spare2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("Spare1");
    openapiRequiredFields.add("DestinationID");
    openapiRequiredFields.add("Spare2");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CoordinatedUTCInquiry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CoordinatedUTCInquiry.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoordinatedUTCInquiry is not found in the empty JSON string", CoordinatedUTCInquiry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CoordinatedUTCInquiry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoordinatedUTCInquiry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoordinatedUTCInquiry.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoordinatedUTCInquiry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoordinatedUTCInquiry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoordinatedUTCInquiry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoordinatedUTCInquiry.class));

       return (TypeAdapter<T>) new TypeAdapter<CoordinatedUTCInquiry>() {
           @Override
           public void write(JsonWriter out, CoordinatedUTCInquiry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoordinatedUTCInquiry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoordinatedUTCInquiry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoordinatedUTCInquiry
  * @throws IOException if the JSON string is invalid with respect to CoordinatedUTCInquiry
  */
  public static CoordinatedUTCInquiry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoordinatedUTCInquiry.class);
  }

 /**
  * Convert an instance of CoordinatedUTCInquiry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

