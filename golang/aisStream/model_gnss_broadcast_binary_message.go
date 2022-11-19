/*
Ais-Stream WebsocketObjects

A sample API to illustrate OpenAPI concepts

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package aisStream

import (
	"encoding/json"
)

// GnssBroadcastBinaryMessage struct for GnssBroadcastBinaryMessage
type GnssBroadcastBinaryMessage struct {
	MessageID int32 `json:"MessageID"`
	RepeatIndicator int32 `json:"RepeatIndicator"`
	UserID int32 `json:"UserID"`
	Valid bool `json:"Valid"`
	Spare1 int32 `json:"Spare1"`
	Longitude float64 `json:"Longitude"`
	Latitude float64 `json:"Latitude"`
	Spare2 int32 `json:"Spare2"`
	Data string `json:"Data"`
}

// NewGnssBroadcastBinaryMessage instantiates a new GnssBroadcastBinaryMessage object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGnssBroadcastBinaryMessage(messageID int32, repeatIndicator int32, userID int32, valid bool, spare1 int32, longitude float64, latitude float64, spare2 int32, data string) *GnssBroadcastBinaryMessage {
	this := GnssBroadcastBinaryMessage{}
	this.MessageID = messageID
	this.RepeatIndicator = repeatIndicator
	this.UserID = userID
	this.Valid = valid
	this.Spare1 = spare1
	this.Longitude = longitude
	this.Latitude = latitude
	this.Spare2 = spare2
	this.Data = data
	return &this
}

// NewGnssBroadcastBinaryMessageWithDefaults instantiates a new GnssBroadcastBinaryMessage object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGnssBroadcastBinaryMessageWithDefaults() *GnssBroadcastBinaryMessage {
	this := GnssBroadcastBinaryMessage{}
	return &this
}

// GetMessageID returns the MessageID field value
func (o *GnssBroadcastBinaryMessage) GetMessageID() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.MessageID
}

// GetMessageIDOk returns a tuple with the MessageID field value
// and a boolean to check if the value has been set.
func (o *GnssBroadcastBinaryMessage) GetMessageIDOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MessageID, true
}

// SetMessageID sets field value
func (o *GnssBroadcastBinaryMessage) SetMessageID(v int32) {
	o.MessageID = v
}

// GetRepeatIndicator returns the RepeatIndicator field value
func (o *GnssBroadcastBinaryMessage) GetRepeatIndicator() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.RepeatIndicator
}

// GetRepeatIndicatorOk returns a tuple with the RepeatIndicator field value
// and a boolean to check if the value has been set.
func (o *GnssBroadcastBinaryMessage) GetRepeatIndicatorOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RepeatIndicator, true
}

// SetRepeatIndicator sets field value
func (o *GnssBroadcastBinaryMessage) SetRepeatIndicator(v int32) {
	o.RepeatIndicator = v
}

// GetUserID returns the UserID field value
func (o *GnssBroadcastBinaryMessage) GetUserID() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.UserID
}

// GetUserIDOk returns a tuple with the UserID field value
// and a boolean to check if the value has been set.
func (o *GnssBroadcastBinaryMessage) GetUserIDOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.UserID, true
}

// SetUserID sets field value
func (o *GnssBroadcastBinaryMessage) SetUserID(v int32) {
	o.UserID = v
}

// GetValid returns the Valid field value
func (o *GnssBroadcastBinaryMessage) GetValid() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Valid
}

// GetValidOk returns a tuple with the Valid field value
// and a boolean to check if the value has been set.
func (o *GnssBroadcastBinaryMessage) GetValidOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Valid, true
}

// SetValid sets field value
func (o *GnssBroadcastBinaryMessage) SetValid(v bool) {
	o.Valid = v
}

// GetSpare1 returns the Spare1 field value
func (o *GnssBroadcastBinaryMessage) GetSpare1() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Spare1
}

// GetSpare1Ok returns a tuple with the Spare1 field value
// and a boolean to check if the value has been set.
func (o *GnssBroadcastBinaryMessage) GetSpare1Ok() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Spare1, true
}

// SetSpare1 sets field value
func (o *GnssBroadcastBinaryMessage) SetSpare1(v int32) {
	o.Spare1 = v
}

// GetLongitude returns the Longitude field value
func (o *GnssBroadcastBinaryMessage) GetLongitude() float64 {
	if o == nil {
		var ret float64
		return ret
	}

	return o.Longitude
}

// GetLongitudeOk returns a tuple with the Longitude field value
// and a boolean to check if the value has been set.
func (o *GnssBroadcastBinaryMessage) GetLongitudeOk() (*float64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Longitude, true
}

// SetLongitude sets field value
func (o *GnssBroadcastBinaryMessage) SetLongitude(v float64) {
	o.Longitude = v
}

// GetLatitude returns the Latitude field value
func (o *GnssBroadcastBinaryMessage) GetLatitude() float64 {
	if o == nil {
		var ret float64
		return ret
	}

	return o.Latitude
}

// GetLatitudeOk returns a tuple with the Latitude field value
// and a boolean to check if the value has been set.
func (o *GnssBroadcastBinaryMessage) GetLatitudeOk() (*float64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Latitude, true
}

// SetLatitude sets field value
func (o *GnssBroadcastBinaryMessage) SetLatitude(v float64) {
	o.Latitude = v
}

// GetSpare2 returns the Spare2 field value
func (o *GnssBroadcastBinaryMessage) GetSpare2() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Spare2
}

// GetSpare2Ok returns a tuple with the Spare2 field value
// and a boolean to check if the value has been set.
func (o *GnssBroadcastBinaryMessage) GetSpare2Ok() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Spare2, true
}

// SetSpare2 sets field value
func (o *GnssBroadcastBinaryMessage) SetSpare2(v int32) {
	o.Spare2 = v
}

// GetData returns the Data field value
func (o *GnssBroadcastBinaryMessage) GetData() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Data
}

// GetDataOk returns a tuple with the Data field value
// and a boolean to check if the value has been set.
func (o *GnssBroadcastBinaryMessage) GetDataOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Data, true
}

// SetData sets field value
func (o *GnssBroadcastBinaryMessage) SetData(v string) {
	o.Data = v
}

func (o GnssBroadcastBinaryMessage) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["MessageID"] = o.MessageID
	}
	if true {
		toSerialize["RepeatIndicator"] = o.RepeatIndicator
	}
	if true {
		toSerialize["UserID"] = o.UserID
	}
	if true {
		toSerialize["Valid"] = o.Valid
	}
	if true {
		toSerialize["Spare1"] = o.Spare1
	}
	if true {
		toSerialize["Longitude"] = o.Longitude
	}
	if true {
		toSerialize["Latitude"] = o.Latitude
	}
	if true {
		toSerialize["Spare2"] = o.Spare2
	}
	if true {
		toSerialize["Data"] = o.Data
	}
	return json.Marshal(toSerialize)
}

type NullableGnssBroadcastBinaryMessage struct {
	value *GnssBroadcastBinaryMessage
	isSet bool
}

func (v NullableGnssBroadcastBinaryMessage) Get() *GnssBroadcastBinaryMessage {
	return v.value
}

func (v *NullableGnssBroadcastBinaryMessage) Set(val *GnssBroadcastBinaryMessage) {
	v.value = val
	v.isSet = true
}

func (v NullableGnssBroadcastBinaryMessage) IsSet() bool {
	return v.isSet
}

func (v *NullableGnssBroadcastBinaryMessage) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGnssBroadcastBinaryMessage(val *GnssBroadcastBinaryMessage) *NullableGnssBroadcastBinaryMessage {
	return &NullableGnssBroadcastBinaryMessage{value: val, isSet: true}
}

func (v NullableGnssBroadcastBinaryMessage) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGnssBroadcastBinaryMessage) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


