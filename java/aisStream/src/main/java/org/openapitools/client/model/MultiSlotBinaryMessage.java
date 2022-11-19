/*
 * Ais-Stream WebsocketObjects
 * A sample API to illustrate OpenAPI concepts
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
import org.openapitools.client.model.AddressedBinaryMessageApplicationID;

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
 * MultiSlotBinaryMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-10T11:29:39.227367-07:00[America/Vancouver]")
public class MultiSlotBinaryMessage {
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

  public static final String SERIALIZED_NAME_DESTINATION_I_D_VALID = "DestinationIDValid";
  @SerializedName(SERIALIZED_NAME_DESTINATION_I_D_VALID)
  private Boolean destinationIDValid;

  public static final String SERIALIZED_NAME_APPLICATION_I_D_VALID = "ApplicationIDValid";
  @SerializedName(SERIALIZED_NAME_APPLICATION_I_D_VALID)
  private Boolean applicationIDValid;

  public static final String SERIALIZED_NAME_DESTINATION_I_D = "DestinationID";
  @SerializedName(SERIALIZED_NAME_DESTINATION_I_D)
  private Integer destinationID;

  public static final String SERIALIZED_NAME_SPARE1 = "Spare1";
  @SerializedName(SERIALIZED_NAME_SPARE1)
  private Integer spare1;

  public static final String SERIALIZED_NAME_APPLICATION_I_D = "ApplicationID";
  @SerializedName(SERIALIZED_NAME_APPLICATION_I_D)
  private AddressedBinaryMessageApplicationID applicationID;

  public static final String SERIALIZED_NAME_PAYLOAD = "Payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_SPARE2 = "Spare2";
  @SerializedName(SERIALIZED_NAME_SPARE2)
  private Integer spare2;

  public static final String SERIALIZED_NAME_COMMUNICATION_STATE_IS_ITDMA = "CommunicationStateIsItdma";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION_STATE_IS_ITDMA)
  private Boolean communicationStateIsItdma;

  public static final String SERIALIZED_NAME_COMMUNICATION_STATE = "CommunicationState";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION_STATE)
  private Integer communicationState;

  public MultiSlotBinaryMessage() { 
  }

  public MultiSlotBinaryMessage messageID(Integer messageID) {
    
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


  public MultiSlotBinaryMessage repeatIndicator(Integer repeatIndicator) {
    
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


  public MultiSlotBinaryMessage userID(Integer userID) {
    
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


  public MultiSlotBinaryMessage valid(Boolean valid) {
    
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


  public MultiSlotBinaryMessage destinationIDValid(Boolean destinationIDValid) {
    
    this.destinationIDValid = destinationIDValid;
    return this;
  }

   /**
   * Get destinationIDValid
   * @return destinationIDValid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getDestinationIDValid() {
    return destinationIDValid;
  }


  public void setDestinationIDValid(Boolean destinationIDValid) {
    this.destinationIDValid = destinationIDValid;
  }


  public MultiSlotBinaryMessage applicationIDValid(Boolean applicationIDValid) {
    
    this.applicationIDValid = applicationIDValid;
    return this;
  }

   /**
   * Get applicationIDValid
   * @return applicationIDValid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getApplicationIDValid() {
    return applicationIDValid;
  }


  public void setApplicationIDValid(Boolean applicationIDValid) {
    this.applicationIDValid = applicationIDValid;
  }


  public MultiSlotBinaryMessage destinationID(Integer destinationID) {
    
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


  public MultiSlotBinaryMessage spare1(Integer spare1) {
    
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


  public MultiSlotBinaryMessage applicationID(AddressedBinaryMessageApplicationID applicationID) {
    
    this.applicationID = applicationID;
    return this;
  }

   /**
   * Get applicationID
   * @return applicationID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AddressedBinaryMessageApplicationID getApplicationID() {
    return applicationID;
  }


  public void setApplicationID(AddressedBinaryMessageApplicationID applicationID) {
    this.applicationID = applicationID;
  }


  public MultiSlotBinaryMessage payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  public MultiSlotBinaryMessage spare2(Integer spare2) {
    
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


  public MultiSlotBinaryMessage communicationStateIsItdma(Boolean communicationStateIsItdma) {
    
    this.communicationStateIsItdma = communicationStateIsItdma;
    return this;
  }

   /**
   * Get communicationStateIsItdma
   * @return communicationStateIsItdma
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCommunicationStateIsItdma() {
    return communicationStateIsItdma;
  }


  public void setCommunicationStateIsItdma(Boolean communicationStateIsItdma) {
    this.communicationStateIsItdma = communicationStateIsItdma;
  }


  public MultiSlotBinaryMessage communicationState(Integer communicationState) {
    
    this.communicationState = communicationState;
    return this;
  }

   /**
   * Get communicationState
   * @return communicationState
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCommunicationState() {
    return communicationState;
  }


  public void setCommunicationState(Integer communicationState) {
    this.communicationState = communicationState;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiSlotBinaryMessage multiSlotBinaryMessage = (MultiSlotBinaryMessage) o;
    return Objects.equals(this.messageID, multiSlotBinaryMessage.messageID) &&
        Objects.equals(this.repeatIndicator, multiSlotBinaryMessage.repeatIndicator) &&
        Objects.equals(this.userID, multiSlotBinaryMessage.userID) &&
        Objects.equals(this.valid, multiSlotBinaryMessage.valid) &&
        Objects.equals(this.destinationIDValid, multiSlotBinaryMessage.destinationIDValid) &&
        Objects.equals(this.applicationIDValid, multiSlotBinaryMessage.applicationIDValid) &&
        Objects.equals(this.destinationID, multiSlotBinaryMessage.destinationID) &&
        Objects.equals(this.spare1, multiSlotBinaryMessage.spare1) &&
        Objects.equals(this.applicationID, multiSlotBinaryMessage.applicationID) &&
        Objects.equals(this.payload, multiSlotBinaryMessage.payload) &&
        Objects.equals(this.spare2, multiSlotBinaryMessage.spare2) &&
        Objects.equals(this.communicationStateIsItdma, multiSlotBinaryMessage.communicationStateIsItdma) &&
        Objects.equals(this.communicationState, multiSlotBinaryMessage.communicationState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, destinationIDValid, applicationIDValid, destinationID, spare1, applicationID, payload, spare2, communicationStateIsItdma, communicationState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiSlotBinaryMessage {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    destinationIDValid: ").append(toIndentedString(destinationIDValid)).append("\n");
    sb.append("    applicationIDValid: ").append(toIndentedString(applicationIDValid)).append("\n");
    sb.append("    destinationID: ").append(toIndentedString(destinationID)).append("\n");
    sb.append("    spare1: ").append(toIndentedString(spare1)).append("\n");
    sb.append("    applicationID: ").append(toIndentedString(applicationID)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    spare2: ").append(toIndentedString(spare2)).append("\n");
    sb.append("    communicationStateIsItdma: ").append(toIndentedString(communicationStateIsItdma)).append("\n");
    sb.append("    communicationState: ").append(toIndentedString(communicationState)).append("\n");
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
    openapiFields.add("DestinationIDValid");
    openapiFields.add("ApplicationIDValid");
    openapiFields.add("DestinationID");
    openapiFields.add("Spare1");
    openapiFields.add("ApplicationID");
    openapiFields.add("Payload");
    openapiFields.add("Spare2");
    openapiFields.add("CommunicationStateIsItdma");
    openapiFields.add("CommunicationState");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("DestinationIDValid");
    openapiRequiredFields.add("ApplicationIDValid");
    openapiRequiredFields.add("DestinationID");
    openapiRequiredFields.add("Spare1");
    openapiRequiredFields.add("ApplicationID");
    openapiRequiredFields.add("Payload");
    openapiRequiredFields.add("Spare2");
    openapiRequiredFields.add("CommunicationStateIsItdma");
    openapiRequiredFields.add("CommunicationState");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MultiSlotBinaryMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MultiSlotBinaryMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultiSlotBinaryMessage is not found in the empty JSON string", MultiSlotBinaryMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MultiSlotBinaryMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultiSlotBinaryMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MultiSlotBinaryMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `ApplicationID`
      if (jsonObj.getAsJsonObject("ApplicationID") != null) {
        AddressedBinaryMessageApplicationID.validateJsonObject(jsonObj.getAsJsonObject("ApplicationID"));
      }
      if (jsonObj.get("Payload") != null && !jsonObj.get("Payload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Payload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Payload").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultiSlotBinaryMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultiSlotBinaryMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultiSlotBinaryMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultiSlotBinaryMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<MultiSlotBinaryMessage>() {
           @Override
           public void write(JsonWriter out, MultiSlotBinaryMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultiSlotBinaryMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MultiSlotBinaryMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MultiSlotBinaryMessage
  * @throws IOException if the JSON string is invalid with respect to MultiSlotBinaryMessage
  */
  public static MultiSlotBinaryMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultiSlotBinaryMessage.class);
  }

 /**
  * Convert an instance of MultiSlotBinaryMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

