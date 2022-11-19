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
 * StandardClassBPositionReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-10T11:29:39.227367-07:00[America/Vancouver]")
public class StandardClassBPositionReport {
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

  public static final String SERIALIZED_NAME_SOG = "Sog";
  @SerializedName(SERIALIZED_NAME_SOG)
  private Double sog;

  public static final String SERIALIZED_NAME_POSITION_ACCURACY = "PositionAccuracy";
  @SerializedName(SERIALIZED_NAME_POSITION_ACCURACY)
  private Boolean positionAccuracy;

  public static final String SERIALIZED_NAME_LONGITUDE = "Longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;

  public static final String SERIALIZED_NAME_LATITUDE = "Latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public static final String SERIALIZED_NAME_COG = "Cog";
  @SerializedName(SERIALIZED_NAME_COG)
  private Double cog;

  public static final String SERIALIZED_NAME_TRUE_HEADING = "TrueHeading";
  @SerializedName(SERIALIZED_NAME_TRUE_HEADING)
  private Integer trueHeading;

  public static final String SERIALIZED_NAME_TIMESTAMP = "Timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_SPARE2 = "Spare2";
  @SerializedName(SERIALIZED_NAME_SPARE2)
  private Integer spare2;

  public static final String SERIALIZED_NAME_CLASS_B_UNIT = "ClassBUnit";
  @SerializedName(SERIALIZED_NAME_CLASS_B_UNIT)
  private Boolean classBUnit;

  public static final String SERIALIZED_NAME_CLASS_B_DISPLAY = "ClassBDisplay";
  @SerializedName(SERIALIZED_NAME_CLASS_B_DISPLAY)
  private Boolean classBDisplay;

  public static final String SERIALIZED_NAME_CLASS_B_DSC = "ClassBDsc";
  @SerializedName(SERIALIZED_NAME_CLASS_B_DSC)
  private Boolean classBDsc;

  public static final String SERIALIZED_NAME_CLASS_B_BAND = "ClassBBand";
  @SerializedName(SERIALIZED_NAME_CLASS_B_BAND)
  private Boolean classBBand;

  public static final String SERIALIZED_NAME_CLASS_B_MSG22 = "ClassBMsg22";
  @SerializedName(SERIALIZED_NAME_CLASS_B_MSG22)
  private Boolean classBMsg22;

  public static final String SERIALIZED_NAME_ASSIGNED_MODE = "AssignedMode";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_MODE)
  private Boolean assignedMode;

  public static final String SERIALIZED_NAME_RAIM = "Raim";
  @SerializedName(SERIALIZED_NAME_RAIM)
  private Boolean raim;

  public static final String SERIALIZED_NAME_COMMUNICATION_STATE_IS_ITDMA = "CommunicationStateIsItdma";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION_STATE_IS_ITDMA)
  private Boolean communicationStateIsItdma;

  public static final String SERIALIZED_NAME_COMMUNICATION_STATE = "CommunicationState";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION_STATE)
  private Integer communicationState;

  public StandardClassBPositionReport() { 
  }

  public StandardClassBPositionReport messageID(Integer messageID) {
    
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


  public StandardClassBPositionReport repeatIndicator(Integer repeatIndicator) {
    
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


  public StandardClassBPositionReport userID(Integer userID) {
    
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


  public StandardClassBPositionReport valid(Boolean valid) {
    
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


  public StandardClassBPositionReport spare1(Integer spare1) {
    
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


  public StandardClassBPositionReport sog(Double sog) {
    
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


  public StandardClassBPositionReport positionAccuracy(Boolean positionAccuracy) {
    
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


  public StandardClassBPositionReport longitude(Double longitude) {
    
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


  public StandardClassBPositionReport latitude(Double latitude) {
    
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


  public StandardClassBPositionReport cog(Double cog) {
    
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


  public StandardClassBPositionReport trueHeading(Integer trueHeading) {
    
    this.trueHeading = trueHeading;
    return this;
  }

   /**
   * Get trueHeading
   * @return trueHeading
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTrueHeading() {
    return trueHeading;
  }


  public void setTrueHeading(Integer trueHeading) {
    this.trueHeading = trueHeading;
  }


  public StandardClassBPositionReport timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public StandardClassBPositionReport spare2(Integer spare2) {
    
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


  public StandardClassBPositionReport classBUnit(Boolean classBUnit) {
    
    this.classBUnit = classBUnit;
    return this;
  }

   /**
   * Get classBUnit
   * @return classBUnit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getClassBUnit() {
    return classBUnit;
  }


  public void setClassBUnit(Boolean classBUnit) {
    this.classBUnit = classBUnit;
  }


  public StandardClassBPositionReport classBDisplay(Boolean classBDisplay) {
    
    this.classBDisplay = classBDisplay;
    return this;
  }

   /**
   * Get classBDisplay
   * @return classBDisplay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getClassBDisplay() {
    return classBDisplay;
  }


  public void setClassBDisplay(Boolean classBDisplay) {
    this.classBDisplay = classBDisplay;
  }


  public StandardClassBPositionReport classBDsc(Boolean classBDsc) {
    
    this.classBDsc = classBDsc;
    return this;
  }

   /**
   * Get classBDsc
   * @return classBDsc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getClassBDsc() {
    return classBDsc;
  }


  public void setClassBDsc(Boolean classBDsc) {
    this.classBDsc = classBDsc;
  }


  public StandardClassBPositionReport classBBand(Boolean classBBand) {
    
    this.classBBand = classBBand;
    return this;
  }

   /**
   * Get classBBand
   * @return classBBand
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getClassBBand() {
    return classBBand;
  }


  public void setClassBBand(Boolean classBBand) {
    this.classBBand = classBBand;
  }


  public StandardClassBPositionReport classBMsg22(Boolean classBMsg22) {
    
    this.classBMsg22 = classBMsg22;
    return this;
  }

   /**
   * Get classBMsg22
   * @return classBMsg22
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getClassBMsg22() {
    return classBMsg22;
  }


  public void setClassBMsg22(Boolean classBMsg22) {
    this.classBMsg22 = classBMsg22;
  }


  public StandardClassBPositionReport assignedMode(Boolean assignedMode) {
    
    this.assignedMode = assignedMode;
    return this;
  }

   /**
   * Get assignedMode
   * @return assignedMode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getAssignedMode() {
    return assignedMode;
  }


  public void setAssignedMode(Boolean assignedMode) {
    this.assignedMode = assignedMode;
  }


  public StandardClassBPositionReport raim(Boolean raim) {
    
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


  public StandardClassBPositionReport communicationStateIsItdma(Boolean communicationStateIsItdma) {
    
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


  public StandardClassBPositionReport communicationState(Integer communicationState) {
    
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
    StandardClassBPositionReport standardClassBPositionReport = (StandardClassBPositionReport) o;
    return Objects.equals(this.messageID, standardClassBPositionReport.messageID) &&
        Objects.equals(this.repeatIndicator, standardClassBPositionReport.repeatIndicator) &&
        Objects.equals(this.userID, standardClassBPositionReport.userID) &&
        Objects.equals(this.valid, standardClassBPositionReport.valid) &&
        Objects.equals(this.spare1, standardClassBPositionReport.spare1) &&
        Objects.equals(this.sog, standardClassBPositionReport.sog) &&
        Objects.equals(this.positionAccuracy, standardClassBPositionReport.positionAccuracy) &&
        Objects.equals(this.longitude, standardClassBPositionReport.longitude) &&
        Objects.equals(this.latitude, standardClassBPositionReport.latitude) &&
        Objects.equals(this.cog, standardClassBPositionReport.cog) &&
        Objects.equals(this.trueHeading, standardClassBPositionReport.trueHeading) &&
        Objects.equals(this.timestamp, standardClassBPositionReport.timestamp) &&
        Objects.equals(this.spare2, standardClassBPositionReport.spare2) &&
        Objects.equals(this.classBUnit, standardClassBPositionReport.classBUnit) &&
        Objects.equals(this.classBDisplay, standardClassBPositionReport.classBDisplay) &&
        Objects.equals(this.classBDsc, standardClassBPositionReport.classBDsc) &&
        Objects.equals(this.classBBand, standardClassBPositionReport.classBBand) &&
        Objects.equals(this.classBMsg22, standardClassBPositionReport.classBMsg22) &&
        Objects.equals(this.assignedMode, standardClassBPositionReport.assignedMode) &&
        Objects.equals(this.raim, standardClassBPositionReport.raim) &&
        Objects.equals(this.communicationStateIsItdma, standardClassBPositionReport.communicationStateIsItdma) &&
        Objects.equals(this.communicationState, standardClassBPositionReport.communicationState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageID, repeatIndicator, userID, valid, spare1, sog, positionAccuracy, longitude, latitude, cog, trueHeading, timestamp, spare2, classBUnit, classBDisplay, classBDsc, classBBand, classBMsg22, assignedMode, raim, communicationStateIsItdma, communicationState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardClassBPositionReport {\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    repeatIndicator: ").append(toIndentedString(repeatIndicator)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    spare1: ").append(toIndentedString(spare1)).append("\n");
    sb.append("    sog: ").append(toIndentedString(sog)).append("\n");
    sb.append("    positionAccuracy: ").append(toIndentedString(positionAccuracy)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    cog: ").append(toIndentedString(cog)).append("\n");
    sb.append("    trueHeading: ").append(toIndentedString(trueHeading)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    spare2: ").append(toIndentedString(spare2)).append("\n");
    sb.append("    classBUnit: ").append(toIndentedString(classBUnit)).append("\n");
    sb.append("    classBDisplay: ").append(toIndentedString(classBDisplay)).append("\n");
    sb.append("    classBDsc: ").append(toIndentedString(classBDsc)).append("\n");
    sb.append("    classBBand: ").append(toIndentedString(classBBand)).append("\n");
    sb.append("    classBMsg22: ").append(toIndentedString(classBMsg22)).append("\n");
    sb.append("    assignedMode: ").append(toIndentedString(assignedMode)).append("\n");
    sb.append("    raim: ").append(toIndentedString(raim)).append("\n");
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
    openapiFields.add("Spare1");
    openapiFields.add("Sog");
    openapiFields.add("PositionAccuracy");
    openapiFields.add("Longitude");
    openapiFields.add("Latitude");
    openapiFields.add("Cog");
    openapiFields.add("TrueHeading");
    openapiFields.add("Timestamp");
    openapiFields.add("Spare2");
    openapiFields.add("ClassBUnit");
    openapiFields.add("ClassBDisplay");
    openapiFields.add("ClassBDsc");
    openapiFields.add("ClassBBand");
    openapiFields.add("ClassBMsg22");
    openapiFields.add("AssignedMode");
    openapiFields.add("Raim");
    openapiFields.add("CommunicationStateIsItdma");
    openapiFields.add("CommunicationState");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MessageID");
    openapiRequiredFields.add("RepeatIndicator");
    openapiRequiredFields.add("UserID");
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("Spare1");
    openapiRequiredFields.add("Sog");
    openapiRequiredFields.add("PositionAccuracy");
    openapiRequiredFields.add("Longitude");
    openapiRequiredFields.add("Latitude");
    openapiRequiredFields.add("Cog");
    openapiRequiredFields.add("TrueHeading");
    openapiRequiredFields.add("Timestamp");
    openapiRequiredFields.add("Spare2");
    openapiRequiredFields.add("ClassBUnit");
    openapiRequiredFields.add("ClassBDisplay");
    openapiRequiredFields.add("ClassBDsc");
    openapiRequiredFields.add("ClassBBand");
    openapiRequiredFields.add("ClassBMsg22");
    openapiRequiredFields.add("AssignedMode");
    openapiRequiredFields.add("Raim");
    openapiRequiredFields.add("CommunicationStateIsItdma");
    openapiRequiredFields.add("CommunicationState");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StandardClassBPositionReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StandardClassBPositionReport.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StandardClassBPositionReport is not found in the empty JSON string", StandardClassBPositionReport.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StandardClassBPositionReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StandardClassBPositionReport` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StandardClassBPositionReport.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StandardClassBPositionReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StandardClassBPositionReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StandardClassBPositionReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StandardClassBPositionReport.class));

       return (TypeAdapter<T>) new TypeAdapter<StandardClassBPositionReport>() {
           @Override
           public void write(JsonWriter out, StandardClassBPositionReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StandardClassBPositionReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StandardClassBPositionReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StandardClassBPositionReport
  * @throws IOException if the JSON string is invalid with respect to StandardClassBPositionReport
  */
  public static StandardClassBPositionReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StandardClassBPositionReport.class);
  }

 /**
  * Convert an instance of StandardClassBPositionReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

