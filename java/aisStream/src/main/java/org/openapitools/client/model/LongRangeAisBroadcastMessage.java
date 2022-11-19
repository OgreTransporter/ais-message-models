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
 * LongRangeAisBroadcastMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-10T11:29:39.227367-07:00[America/Vancouver]")
public class LongRangeAisBroadcastMessage {
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

  public static final String SERIALIZED_NAME_POSITION_ACCURACY = "PositionAccuracy";
  @SerializedName(SERIALIZED_NAME_POSITION_ACCURACY)
  private Boolean positionAccuracy;

  public static final String SERIALIZED_NAME_RAIM = "Raim";
  @SerializedName(SERIALIZED_NAME_RAIM)
  private Boolean raim;

  public static final String SERIALIZED_NAME_NAVIGATIONAL_STATUS = "NavigationalStatus";
  @SerializedName(SERIALIZED_NAME_NAVIGATIONAL_STATUS)
  private Integer navigationalStatus;

  public static final String SERIALIZED_NAME_LONGITUDE = "Longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;

  public static final String SERIALIZED_NAME_LATITUDE = "Latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public static final String SERIALIZED_NAME_SOG = "Sog";
  @SerializedName(SERIALIZED_NAME_SOG)
  private Double sog;

  public static final String SERIALIZED_NAME_COG = "Cog";
  @SerializedName(SERIALIZED_NAME_COG)
  private Double cog;

  public static final String SERIALIZED_NAME_POSITION_LATENCY = "PositionLatency";
  @SerializedName(SERIALIZED_NAME_POSITION_LATENCY)
  private Boolean positionLatency;

  public static final String SERIALIZED_NAME_SPARE = "Spare";
  @SerializedName(SERIALIZED_NAME_SPARE)
  private Boolean spare;

  public LongRangeAisBroadcastMessage() { 
  }

  public LongRangeAisBroadcastMessage messageID(Integer messageID) {
    
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


  public LongRangeAisBroadcastMessage repeatIndicator(Integer repeatIndicator) {
    
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


  public LongRangeAisBroadcastMessage userID(Integer userID) {
    
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


  public LongRangeAisBroadcastMessage valid(Boolean valid) {
    
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


  public LongRangeAisBroadcastMessage positionAccuracy(Boolean positionAccuracy) {
    
    this.positionAccuracy = positionAccuracy;
    return this;
  }

   /**
   * Get positionAccuracy
   * @return positionAccuracy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getPositionAccuracy() {
    return positionAccuracy;
  }


  public void setPositionAccuracy(Boolean positionAccuracy) {
    this.positionAccuracy = positionAccuracy;
  }


  public LongRangeAisBroadcastMessage raim(Boolean raim) {
    
    this.raim = raim;
    return this;
  }

   /**
   * Get raim
   * @return raim
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getRaim() {
    return raim;
  }


  public void setRaim(Boolean raim) {
    this.raim = raim;
  }


  public LongRangeAisBroadcastMessage navigationalStatus(Integer navigationalStatus) {
    
    this.navigationalStatus = navigationalStatus;
    return this;
  }

   /**
   * Get navigationalStatus
   * @return navigationalStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getNavigationalStatus() {
    return navigationalStatus;
  }


  public void setNavigationalStatus(Integer navigationalStatus) {
    this.navigationalStatus = navigationalStatus;
  }


  public LongRangeAisBroadcastMessage longitude(Double longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getLongitude() {
    return longitude;
  }


  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public LongRangeAisBroadcastMessage latitude(Double latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getLatitude() {
    return latitude;
  }


  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public LongRangeAisBroadcastMessage sog(Double sog) {
    
    this.sog = sog;
    return this;
  }

   /**
   * Get sog
   * @return sog
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getSog() {
    return sog;
  }


  public void setSog(Double sog) {
    this.sog = sog;
  }


  public LongRangeAisBroadcastMessage cog(Double cog) {
    
    this.cog = cog;
    return this;
  }

   /**
   * Get cog
   * @return cog
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getCog() {
    return cog;
  }


  public void setCog(Double cog) {
    this.cog = cog;
  }


  public LongRangeAisBroadcastMessage positionLatency(Boolean positionLatency) {
    
    this.positionLatency = positionLatency;
    return this;
  }

   /**
   * Get positionLatency
   * @return positionLatency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getPositionLatency() {
    return positionLatency;
  }


  public void setPositionLatency(Boolean positionLatency) {
    this.positionLatency = positionLatency;
  }


  public LongRangeAisBroadcastMessage spare(Boolean spare) {
    
    this.spare = spare;
    return this;
  }

   /**
   * Get spare
   * @return spare
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getSpare() {
    return spare;
  }


  public void setSpare(Boolean spare) {
    this.spare = spare;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongRangeAisBroadcastMessage longRangeAisBroadcastMessage = (LongRangeAisBroadcastMessage) o;
    return Objects.equals(this.messageID, longRangeAisBroadcastMessage.messageID) &&
        Objects.equals(this.repeatIndicator, longRangeAisBroadcastMessage.repeatIndicator) &&
        Objects.equals(this.userID, longRangeAisBroadcastMessage.userID) &&
        Objects.equals(this.valid, longRangeAisBroadcastMessage.valid) &&
        Objects.equals(this.positionAccuracy, longRangeAisBroadcastMessage.positionAccuracy) &&
        Objects.equals(this.raim, longRangeAisBroadcastMessage.raim) &&
        Objects.equals(this.navigationalStatus, longRangeAisBroadcastMessage.navigationalStatus) &&
        Objects.equals(this.longitude, longRangeAisBroadcastMessage.longitude) &&
        Objects.equals(this.latitude, longRangeAisBroadcastMessage.latitude) &&
        Objects.equals(this.sog, longRangeAisBroadcastMessage.sog) &&
        Objects.equals(this.cog, longRangeAisBroadcastMessage.cog) &&
        Objects.equals(this.positionLatency, longRangeAisBroadcastMessage.positionLatency) &&
        Objects.equals(this.spare, longRangeAisBroadcastMessage.spare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, positionAccuracy, raim, navigationalStatus, longitude, latitude, sog, cog, positionLatency, spare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongRangeAisBroadcastMessage {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    positionAccuracy: ").append(toIndentedString(positionAccuracy)).append("\n");
    sb.append("    raim: ").append(toIndentedString(raim)).append("\n");
    sb.append("    navigationalStatus: ").append(toIndentedString(navigationalStatus)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    sog: ").append(toIndentedString(sog)).append("\n");
    sb.append("    cog: ").append(toIndentedString(cog)).append("\n");
    sb.append("    positionLatency: ").append(toIndentedString(positionLatency)).append("\n");
    sb.append("    spare: ").append(toIndentedString(spare)).append("\n");
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
    openapiFields.add("PositionAccuracy");
    openapiFields.add("Raim");
    openapiFields.add("NavigationalStatus");
    openapiFields.add("Longitude");
    openapiFields.add("Latitude");
    openapiFields.add("Sog");
    openapiFields.add("Cog");
    openapiFields.add("PositionLatency");
    openapiFields.add("Spare");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("PositionAccuracy");
    openapiRequiredFields.add("Raim");
    openapiRequiredFields.add("NavigationalStatus");
    openapiRequiredFields.add("Longitude");
    openapiRequiredFields.add("Latitude");
    openapiRequiredFields.add("Sog");
    openapiRequiredFields.add("Cog");
    openapiRequiredFields.add("PositionLatency");
    openapiRequiredFields.add("Spare");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LongRangeAisBroadcastMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LongRangeAisBroadcastMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LongRangeAisBroadcastMessage is not found in the empty JSON string", LongRangeAisBroadcastMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LongRangeAisBroadcastMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LongRangeAisBroadcastMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LongRangeAisBroadcastMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LongRangeAisBroadcastMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LongRangeAisBroadcastMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LongRangeAisBroadcastMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LongRangeAisBroadcastMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<LongRangeAisBroadcastMessage>() {
           @Override
           public void write(JsonWriter out, LongRangeAisBroadcastMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LongRangeAisBroadcastMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LongRangeAisBroadcastMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LongRangeAisBroadcastMessage
  * @throws IOException if the JSON string is invalid with respect to LongRangeAisBroadcastMessage
  */
  public static LongRangeAisBroadcastMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LongRangeAisBroadcastMessage.class);
  }

 /**
  * Convert an instance of LongRangeAisBroadcastMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

