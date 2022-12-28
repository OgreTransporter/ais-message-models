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
import org.openapitools.client.model.ShipStaticDataDimension;

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
 * StaticDataReportReportB
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-27T20:06:28.639799-05:00[America/Toronto]")
public class StaticDataReportReportB {
  public static final String SERIALIZED_NAME_VALID = "Valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_SHIP_TYPE = "ShipType";
  @SerializedName(SERIALIZED_NAME_SHIP_TYPE)
  private Integer shipType;

  public static final String SERIALIZED_NAME_VENDOR_I_D_NAME = "VendorIDName";
  @SerializedName(SERIALIZED_NAME_VENDOR_I_D_NAME)
  private String vendorIDName;

  public static final String SERIALIZED_NAME_VENDER_I_D_MODEL = "VenderIDModel";
  @SerializedName(SERIALIZED_NAME_VENDER_I_D_MODEL)
  private Integer venderIDModel;

  public static final String SERIALIZED_NAME_VENDER_I_D_SERIAL = "VenderIDSerial";
  @SerializedName(SERIALIZED_NAME_VENDER_I_D_SERIAL)
  private Integer venderIDSerial;

  public static final String SERIALIZED_NAME_CALL_SIGN = "CallSign";
  @SerializedName(SERIALIZED_NAME_CALL_SIGN)
  private String callSign;

  public static final String SERIALIZED_NAME_DIMENSION = "Dimension";
  @SerializedName(SERIALIZED_NAME_DIMENSION)
  private ShipStaticDataDimension dimension;

  public static final String SERIALIZED_NAME_FIX_TYPE = "FixType";
  @SerializedName(SERIALIZED_NAME_FIX_TYPE)
  private Integer fixType;

  public static final String SERIALIZED_NAME_SPARE = "Spare";
  @SerializedName(SERIALIZED_NAME_SPARE)
  private Integer spare;

  public StaticDataReportReportB() { 
  }

  public StaticDataReportReportB valid(Boolean valid) {
    
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


  public StaticDataReportReportB shipType(Integer shipType) {
    
    this.shipType = shipType;
    return this;
  }

   /**
   * Get shipType
   * @return shipType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getShipType() {
    return shipType;
  }


  public void setShipType(Integer shipType) {
    this.shipType = shipType;
  }


  public StaticDataReportReportB vendorIDName(String vendorIDName) {
    
    this.vendorIDName = vendorIDName;
    return this;
  }

   /**
   * Get vendorIDName
   * @return vendorIDName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVendorIDName() {
    return vendorIDName;
  }


  public void setVendorIDName(String vendorIDName) {
    this.vendorIDName = vendorIDName;
  }


  public StaticDataReportReportB venderIDModel(Integer venderIDModel) {
    
    this.venderIDModel = venderIDModel;
    return this;
  }

   /**
   * Get venderIDModel
   * @return venderIDModel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getVenderIDModel() {
    return venderIDModel;
  }


  public void setVenderIDModel(Integer venderIDModel) {
    this.venderIDModel = venderIDModel;
  }


  public StaticDataReportReportB venderIDSerial(Integer venderIDSerial) {
    
    this.venderIDSerial = venderIDSerial;
    return this;
  }

   /**
   * Get venderIDSerial
   * @return venderIDSerial
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getVenderIDSerial() {
    return venderIDSerial;
  }


  public void setVenderIDSerial(Integer venderIDSerial) {
    this.venderIDSerial = venderIDSerial;
  }


  public StaticDataReportReportB callSign(String callSign) {
    
    this.callSign = callSign;
    return this;
  }

   /**
   * Get callSign
   * @return callSign
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCallSign() {
    return callSign;
  }


  public void setCallSign(String callSign) {
    this.callSign = callSign;
  }


  public StaticDataReportReportB dimension(ShipStaticDataDimension dimension) {
    
    this.dimension = dimension;
    return this;
  }

   /**
   * Get dimension
   * @return dimension
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ShipStaticDataDimension getDimension() {
    return dimension;
  }


  public void setDimension(ShipStaticDataDimension dimension) {
    this.dimension = dimension;
  }


  public StaticDataReportReportB fixType(Integer fixType) {
    
    this.fixType = fixType;
    return this;
  }

   /**
   * Get fixType
   * @return fixType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getFixType() {
    return fixType;
  }


  public void setFixType(Integer fixType) {
    this.fixType = fixType;
  }


  public StaticDataReportReportB spare(Integer spare) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticDataReportReportB staticDataReportReportB = (StaticDataReportReportB) o;
    return Objects.equals(this.valid, staticDataReportReportB.valid) &&
        Objects.equals(this.shipType, staticDataReportReportB.shipType) &&
        Objects.equals(this.vendorIDName, staticDataReportReportB.vendorIDName) &&
        Objects.equals(this.venderIDModel, staticDataReportReportB.venderIDModel) &&
        Objects.equals(this.venderIDSerial, staticDataReportReportB.venderIDSerial) &&
        Objects.equals(this.callSign, staticDataReportReportB.callSign) &&
        Objects.equals(this.dimension, staticDataReportReportB.dimension) &&
        Objects.equals(this.fixType, staticDataReportReportB.fixType) &&
        Objects.equals(this.spare, staticDataReportReportB.spare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, shipType, vendorIDName, venderIDModel, venderIDSerial, callSign, dimension, fixType, spare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticDataReportReportB {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    shipType: ").append(toIndentedString(shipType)).append("\n");
    sb.append("    vendorIDName: ").append(toIndentedString(vendorIDName)).append("\n");
    sb.append("    venderIDModel: ").append(toIndentedString(venderIDModel)).append("\n");
    sb.append("    venderIDSerial: ").append(toIndentedString(venderIDSerial)).append("\n");
    sb.append("    callSign: ").append(toIndentedString(callSign)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    fixType: ").append(toIndentedString(fixType)).append("\n");
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
    openapiFields.add("Valid");
    openapiFields.add("ShipType");
    openapiFields.add("VendorIDName");
    openapiFields.add("VenderIDModel");
    openapiFields.add("VenderIDSerial");
    openapiFields.add("CallSign");
    openapiFields.add("Dimension");
    openapiFields.add("FixType");
    openapiFields.add("Spare");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("ShipType");
    openapiRequiredFields.add("VendorIDName");
    openapiRequiredFields.add("VenderIDModel");
    openapiRequiredFields.add("VenderIDSerial");
    openapiRequiredFields.add("CallSign");
    openapiRequiredFields.add("Dimension");
    openapiRequiredFields.add("FixType");
    openapiRequiredFields.add("Spare");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StaticDataReportReportB
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StaticDataReportReportB.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StaticDataReportReportB is not found in the empty JSON string", StaticDataReportReportB.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StaticDataReportReportB.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StaticDataReportReportB` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StaticDataReportReportB.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("VendorIDName") != null && !jsonObj.get("VendorIDName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VendorIDName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VendorIDName").toString()));
      }
      if (jsonObj.get("CallSign") != null && !jsonObj.get("CallSign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CallSign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CallSign").toString()));
      }
      // validate the optional field `Dimension`
      if (jsonObj.getAsJsonObject("Dimension") != null) {
        ShipStaticDataDimension.validateJsonObject(jsonObj.getAsJsonObject("Dimension"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StaticDataReportReportB.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StaticDataReportReportB' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StaticDataReportReportB> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StaticDataReportReportB.class));

       return (TypeAdapter<T>) new TypeAdapter<StaticDataReportReportB>() {
           @Override
           public void write(JsonWriter out, StaticDataReportReportB value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StaticDataReportReportB read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StaticDataReportReportB given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StaticDataReportReportB
  * @throws IOException if the JSON string is invalid with respect to StaticDataReportReportB
  */
  public static StaticDataReportReportB fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StaticDataReportReportB.class);
  }

 /**
  * Convert an instance of StaticDataReportReportB to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

