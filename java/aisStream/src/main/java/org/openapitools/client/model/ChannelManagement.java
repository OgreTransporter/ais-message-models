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
import org.openapitools.client.model.ChannelManagementArea;
import org.openapitools.client.model.ChannelManagementUnicast;

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
 * ChannelManagement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-27T20:06:28.639799-05:00[America/Toronto]")
public class ChannelManagement {
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

  public static final String SERIALIZED_NAME_CHANNEL_A = "ChannelA";
  @SerializedName(SERIALIZED_NAME_CHANNEL_A)
  private Integer channelA;

  public static final String SERIALIZED_NAME_CHANNEL_B = "ChannelB";
  @SerializedName(SERIALIZED_NAME_CHANNEL_B)
  private Integer channelB;

  public static final String SERIALIZED_NAME_TX_RX_MODE = "TxRxMode";
  @SerializedName(SERIALIZED_NAME_TX_RX_MODE)
  private Integer txRxMode;

  public static final String SERIALIZED_NAME_LOW_POWER = "LowPower";
  @SerializedName(SERIALIZED_NAME_LOW_POWER)
  private Boolean lowPower;

  public static final String SERIALIZED_NAME_AREA = "Area";
  @SerializedName(SERIALIZED_NAME_AREA)
  private ChannelManagementArea area;

  public static final String SERIALIZED_NAME_UNICAST = "Unicast";
  @SerializedName(SERIALIZED_NAME_UNICAST)
  private ChannelManagementUnicast unicast;

  public static final String SERIALIZED_NAME_IS_ADDRESSED = "IsAddressed";
  @SerializedName(SERIALIZED_NAME_IS_ADDRESSED)
  private Boolean isAddressed;

  public static final String SERIALIZED_NAME_BW_A = "BwA";
  @SerializedName(SERIALIZED_NAME_BW_A)
  private Boolean bwA;

  public static final String SERIALIZED_NAME_BW_B = "BwB";
  @SerializedName(SERIALIZED_NAME_BW_B)
  private Boolean bwB;

  public static final String SERIALIZED_NAME_TRANSITIONAL_ZONE_SIZE = "TransitionalZoneSize";
  @SerializedName(SERIALIZED_NAME_TRANSITIONAL_ZONE_SIZE)
  private Integer transitionalZoneSize;

  public static final String SERIALIZED_NAME_SPARE4 = "Spare4";
  @SerializedName(SERIALIZED_NAME_SPARE4)
  private Integer spare4;

  public ChannelManagement() { 
  }

  public ChannelManagement messageID(Integer messageID) {
    
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


  public ChannelManagement repeatIndicator(Integer repeatIndicator) {
    
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


  public ChannelManagement userID(Integer userID) {
    
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


  public ChannelManagement valid(Boolean valid) {
    
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


  public ChannelManagement spare1(Integer spare1) {
    
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


  public ChannelManagement channelA(Integer channelA) {
    
    this.channelA = channelA;
    return this;
  }

   /**
   * Get channelA
   * @return channelA
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getChannelA() {
    return channelA;
  }


  public void setChannelA(Integer channelA) {
    this.channelA = channelA;
  }


  public ChannelManagement channelB(Integer channelB) {
    
    this.channelB = channelB;
    return this;
  }

   /**
   * Get channelB
   * @return channelB
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getChannelB() {
    return channelB;
  }


  public void setChannelB(Integer channelB) {
    this.channelB = channelB;
  }


  public ChannelManagement txRxMode(Integer txRxMode) {
    
    this.txRxMode = txRxMode;
    return this;
  }

   /**
   * Get txRxMode
   * @return txRxMode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTxRxMode() {
    return txRxMode;
  }


  public void setTxRxMode(Integer txRxMode) {
    this.txRxMode = txRxMode;
  }


  public ChannelManagement lowPower(Boolean lowPower) {
    
    this.lowPower = lowPower;
    return this;
  }

   /**
   * Get lowPower
   * @return lowPower
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getLowPower() {
    return lowPower;
  }


  public void setLowPower(Boolean lowPower) {
    this.lowPower = lowPower;
  }


  public ChannelManagement area(ChannelManagementArea area) {
    
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ChannelManagementArea getArea() {
    return area;
  }


  public void setArea(ChannelManagementArea area) {
    this.area = area;
  }


  public ChannelManagement unicast(ChannelManagementUnicast unicast) {
    
    this.unicast = unicast;
    return this;
  }

   /**
   * Get unicast
   * @return unicast
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ChannelManagementUnicast getUnicast() {
    return unicast;
  }


  public void setUnicast(ChannelManagementUnicast unicast) {
    this.unicast = unicast;
  }


  public ChannelManagement isAddressed(Boolean isAddressed) {
    
    this.isAddressed = isAddressed;
    return this;
  }

   /**
   * Get isAddressed
   * @return isAddressed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsAddressed() {
    return isAddressed;
  }


  public void setIsAddressed(Boolean isAddressed) {
    this.isAddressed = isAddressed;
  }


  public ChannelManagement bwA(Boolean bwA) {
    
    this.bwA = bwA;
    return this;
  }

   /**
   * Get bwA
   * @return bwA
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getBwA() {
    return bwA;
  }


  public void setBwA(Boolean bwA) {
    this.bwA = bwA;
  }


  public ChannelManagement bwB(Boolean bwB) {
    
    this.bwB = bwB;
    return this;
  }

   /**
   * Get bwB
   * @return bwB
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getBwB() {
    return bwB;
  }


  public void setBwB(Boolean bwB) {
    this.bwB = bwB;
  }


  public ChannelManagement transitionalZoneSize(Integer transitionalZoneSize) {
    
    this.transitionalZoneSize = transitionalZoneSize;
    return this;
  }

   /**
   * Get transitionalZoneSize
   * @return transitionalZoneSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTransitionalZoneSize() {
    return transitionalZoneSize;
  }


  public void setTransitionalZoneSize(Integer transitionalZoneSize) {
    this.transitionalZoneSize = transitionalZoneSize;
  }


  public ChannelManagement spare4(Integer spare4) {
    
    this.spare4 = spare4;
    return this;
  }

   /**
   * Get spare4
   * @return spare4
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSpare4() {
    return spare4;
  }


  public void setSpare4(Integer spare4) {
    this.spare4 = spare4;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelManagement channelManagement = (ChannelManagement) o;
    return Objects.equals(this.messageID, channelManagement.messageID) &&
        Objects.equals(this.repeatIndicator, channelManagement.repeatIndicator) &&
        Objects.equals(this.userID, channelManagement.userID) &&
        Objects.equals(this.valid, channelManagement.valid) &&
        Objects.equals(this.spare1, channelManagement.spare1) &&
        Objects.equals(this.channelA, channelManagement.channelA) &&
        Objects.equals(this.channelB, channelManagement.channelB) &&
        Objects.equals(this.txRxMode, channelManagement.txRxMode) &&
        Objects.equals(this.lowPower, channelManagement.lowPower) &&
        Objects.equals(this.area, channelManagement.area) &&
        Objects.equals(this.unicast, channelManagement.unicast) &&
        Objects.equals(this.isAddressed, channelManagement.isAddressed) &&
        Objects.equals(this.bwA, channelManagement.bwA) &&
        Objects.equals(this.bwB, channelManagement.bwB) &&
        Objects.equals(this.transitionalZoneSize, channelManagement.transitionalZoneSize) &&
        Objects.equals(this.spare4, channelManagement.spare4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, spare1, channelA, channelB, txRxMode, lowPower, area, unicast, isAddressed, bwA, bwB, transitionalZoneSize, spare4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelManagement {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    spare1: ").append(toIndentedString(spare1)).append("\n");
    sb.append("    channelA: ").append(toIndentedString(channelA)).append("\n");
    sb.append("    channelB: ").append(toIndentedString(channelB)).append("\n");
    sb.append("    txRxMode: ").append(toIndentedString(txRxMode)).append("\n");
    sb.append("    lowPower: ").append(toIndentedString(lowPower)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    unicast: ").append(toIndentedString(unicast)).append("\n");
    sb.append("    isAddressed: ").append(toIndentedString(isAddressed)).append("\n");
    sb.append("    bwA: ").append(toIndentedString(bwA)).append("\n");
    sb.append("    bwB: ").append(toIndentedString(bwB)).append("\n");
    sb.append("    transitionalZoneSize: ").append(toIndentedString(transitionalZoneSize)).append("\n");
    sb.append("    spare4: ").append(toIndentedString(spare4)).append("\n");
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
    openapiFields.add("ChannelA");
    openapiFields.add("ChannelB");
    openapiFields.add("TxRxMode");
    openapiFields.add("LowPower");
    openapiFields.add("Area");
    openapiFields.add("Unicast");
    openapiFields.add("IsAddressed");
    openapiFields.add("BwA");
    openapiFields.add("BwB");
    openapiFields.add("TransitionalZoneSize");
    openapiFields.add("Spare4");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("Spare1");
    openapiRequiredFields.add("ChannelA");
    openapiRequiredFields.add("ChannelB");
    openapiRequiredFields.add("TxRxMode");
    openapiRequiredFields.add("LowPower");
    openapiRequiredFields.add("Area");
    openapiRequiredFields.add("Unicast");
    openapiRequiredFields.add("IsAddressed");
    openapiRequiredFields.add("BwA");
    openapiRequiredFields.add("BwB");
    openapiRequiredFields.add("TransitionalZoneSize");
    openapiRequiredFields.add("Spare4");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChannelManagement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ChannelManagement.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChannelManagement is not found in the empty JSON string", ChannelManagement.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChannelManagement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChannelManagement` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChannelManagement.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `Area`
      if (jsonObj.getAsJsonObject("Area") != null) {
        ChannelManagementArea.validateJsonObject(jsonObj.getAsJsonObject("Area"));
      }
      // validate the optional field `Unicast`
      if (jsonObj.getAsJsonObject("Unicast") != null) {
        ChannelManagementUnicast.validateJsonObject(jsonObj.getAsJsonObject("Unicast"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChannelManagement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChannelManagement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChannelManagement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChannelManagement.class));

       return (TypeAdapter<T>) new TypeAdapter<ChannelManagement>() {
           @Override
           public void write(JsonWriter out, ChannelManagement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChannelManagement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChannelManagement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChannelManagement
  * @throws IOException if the JSON string is invalid with respect to ChannelManagement
  */
  public static ChannelManagement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChannelManagement.class);
  }

 /**
  * Convert an instance of ChannelManagement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

