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

// ChannelManagement struct for ChannelManagement
type ChannelManagement struct {
	MessageID int32 `json:"MessageID"`
	RepeatIndicator int32 `json:"RepeatIndicator"`
	UserID int32 `json:"UserID"`
	Valid bool `json:"Valid"`
	Spare1 int32 `json:"Spare1"`
	ChannelA int32 `json:"ChannelA"`
	ChannelB int32 `json:"ChannelB"`
	TxRxMode int32 `json:"TxRxMode"`
	LowPower bool `json:"LowPower"`
	Area ChannelManagementArea `json:"Area"`
	Unicast ChannelManagementUnicast `json:"Unicast"`
	IsAddressed bool `json:"IsAddressed"`
	BwA bool `json:"BwA"`
	BwB bool `json:"BwB"`
	TransitionalZoneSize int32 `json:"TransitionalZoneSize"`
	Spare4 int32 `json:"Spare4"`
}

// NewChannelManagement instantiates a new ChannelManagement object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewChannelManagement(messageID int32, repeatIndicator int32, userID int32, valid bool, spare1 int32, channelA int32, channelB int32, txRxMode int32, lowPower bool, area ChannelManagementArea, unicast ChannelManagementUnicast, isAddressed bool, bwA bool, bwB bool, transitionalZoneSize int32, spare4 int32) *ChannelManagement {
	this := ChannelManagement{}
	this.MessageID = messageID
	this.RepeatIndicator = repeatIndicator
	this.UserID = userID
	this.Valid = valid
	this.Spare1 = spare1
	this.ChannelA = channelA
	this.ChannelB = channelB
	this.TxRxMode = txRxMode
	this.LowPower = lowPower
	this.Area = area
	this.Unicast = unicast
	this.IsAddressed = isAddressed
	this.BwA = bwA
	this.BwB = bwB
	this.TransitionalZoneSize = transitionalZoneSize
	this.Spare4 = spare4
	return &this
}

// NewChannelManagementWithDefaults instantiates a new ChannelManagement object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewChannelManagementWithDefaults() *ChannelManagement {
	this := ChannelManagement{}
	return &this
}

// GetMessageID returns the MessageID field value
func (o *ChannelManagement) GetMessageID() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.MessageID
}

// GetMessageIDOk returns a tuple with the MessageID field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetMessageIDOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MessageID, true
}

// SetMessageID sets field value
func (o *ChannelManagement) SetMessageID(v int32) {
	o.MessageID = v
}

// GetRepeatIndicator returns the RepeatIndicator field value
func (o *ChannelManagement) GetRepeatIndicator() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.RepeatIndicator
}

// GetRepeatIndicatorOk returns a tuple with the RepeatIndicator field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetRepeatIndicatorOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RepeatIndicator, true
}

// SetRepeatIndicator sets field value
func (o *ChannelManagement) SetRepeatIndicator(v int32) {
	o.RepeatIndicator = v
}

// GetUserID returns the UserID field value
func (o *ChannelManagement) GetUserID() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.UserID
}

// GetUserIDOk returns a tuple with the UserID field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetUserIDOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.UserID, true
}

// SetUserID sets field value
func (o *ChannelManagement) SetUserID(v int32) {
	o.UserID = v
}

// GetValid returns the Valid field value
func (o *ChannelManagement) GetValid() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Valid
}

// GetValidOk returns a tuple with the Valid field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetValidOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Valid, true
}

// SetValid sets field value
func (o *ChannelManagement) SetValid(v bool) {
	o.Valid = v
}

// GetSpare1 returns the Spare1 field value
func (o *ChannelManagement) GetSpare1() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Spare1
}

// GetSpare1Ok returns a tuple with the Spare1 field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetSpare1Ok() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Spare1, true
}

// SetSpare1 sets field value
func (o *ChannelManagement) SetSpare1(v int32) {
	o.Spare1 = v
}

// GetChannelA returns the ChannelA field value
func (o *ChannelManagement) GetChannelA() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.ChannelA
}

// GetChannelAOk returns a tuple with the ChannelA field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetChannelAOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ChannelA, true
}

// SetChannelA sets field value
func (o *ChannelManagement) SetChannelA(v int32) {
	o.ChannelA = v
}

// GetChannelB returns the ChannelB field value
func (o *ChannelManagement) GetChannelB() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.ChannelB
}

// GetChannelBOk returns a tuple with the ChannelB field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetChannelBOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ChannelB, true
}

// SetChannelB sets field value
func (o *ChannelManagement) SetChannelB(v int32) {
	o.ChannelB = v
}

// GetTxRxMode returns the TxRxMode field value
func (o *ChannelManagement) GetTxRxMode() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.TxRxMode
}

// GetTxRxModeOk returns a tuple with the TxRxMode field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetTxRxModeOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TxRxMode, true
}

// SetTxRxMode sets field value
func (o *ChannelManagement) SetTxRxMode(v int32) {
	o.TxRxMode = v
}

// GetLowPower returns the LowPower field value
func (o *ChannelManagement) GetLowPower() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.LowPower
}

// GetLowPowerOk returns a tuple with the LowPower field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetLowPowerOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.LowPower, true
}

// SetLowPower sets field value
func (o *ChannelManagement) SetLowPower(v bool) {
	o.LowPower = v
}

// GetArea returns the Area field value
func (o *ChannelManagement) GetArea() ChannelManagementArea {
	if o == nil {
		var ret ChannelManagementArea
		return ret
	}

	return o.Area
}

// GetAreaOk returns a tuple with the Area field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetAreaOk() (*ChannelManagementArea, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Area, true
}

// SetArea sets field value
func (o *ChannelManagement) SetArea(v ChannelManagementArea) {
	o.Area = v
}

// GetUnicast returns the Unicast field value
func (o *ChannelManagement) GetUnicast() ChannelManagementUnicast {
	if o == nil {
		var ret ChannelManagementUnicast
		return ret
	}

	return o.Unicast
}

// GetUnicastOk returns a tuple with the Unicast field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetUnicastOk() (*ChannelManagementUnicast, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Unicast, true
}

// SetUnicast sets field value
func (o *ChannelManagement) SetUnicast(v ChannelManagementUnicast) {
	o.Unicast = v
}

// GetIsAddressed returns the IsAddressed field value
func (o *ChannelManagement) GetIsAddressed() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.IsAddressed
}

// GetIsAddressedOk returns a tuple with the IsAddressed field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetIsAddressedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.IsAddressed, true
}

// SetIsAddressed sets field value
func (o *ChannelManagement) SetIsAddressed(v bool) {
	o.IsAddressed = v
}

// GetBwA returns the BwA field value
func (o *ChannelManagement) GetBwA() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.BwA
}

// GetBwAOk returns a tuple with the BwA field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetBwAOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.BwA, true
}

// SetBwA sets field value
func (o *ChannelManagement) SetBwA(v bool) {
	o.BwA = v
}

// GetBwB returns the BwB field value
func (o *ChannelManagement) GetBwB() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.BwB
}

// GetBwBOk returns a tuple with the BwB field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetBwBOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.BwB, true
}

// SetBwB sets field value
func (o *ChannelManagement) SetBwB(v bool) {
	o.BwB = v
}

// GetTransitionalZoneSize returns the TransitionalZoneSize field value
func (o *ChannelManagement) GetTransitionalZoneSize() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.TransitionalZoneSize
}

// GetTransitionalZoneSizeOk returns a tuple with the TransitionalZoneSize field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetTransitionalZoneSizeOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TransitionalZoneSize, true
}

// SetTransitionalZoneSize sets field value
func (o *ChannelManagement) SetTransitionalZoneSize(v int32) {
	o.TransitionalZoneSize = v
}

// GetSpare4 returns the Spare4 field value
func (o *ChannelManagement) GetSpare4() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Spare4
}

// GetSpare4Ok returns a tuple with the Spare4 field value
// and a boolean to check if the value has been set.
func (o *ChannelManagement) GetSpare4Ok() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Spare4, true
}

// SetSpare4 sets field value
func (o *ChannelManagement) SetSpare4(v int32) {
	o.Spare4 = v
}

func (o ChannelManagement) MarshalJSON() ([]byte, error) {
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
		toSerialize["ChannelA"] = o.ChannelA
	}
	if true {
		toSerialize["ChannelB"] = o.ChannelB
	}
	if true {
		toSerialize["TxRxMode"] = o.TxRxMode
	}
	if true {
		toSerialize["LowPower"] = o.LowPower
	}
	if true {
		toSerialize["Area"] = o.Area
	}
	if true {
		toSerialize["Unicast"] = o.Unicast
	}
	if true {
		toSerialize["IsAddressed"] = o.IsAddressed
	}
	if true {
		toSerialize["BwA"] = o.BwA
	}
	if true {
		toSerialize["BwB"] = o.BwB
	}
	if true {
		toSerialize["TransitionalZoneSize"] = o.TransitionalZoneSize
	}
	if true {
		toSerialize["Spare4"] = o.Spare4
	}
	return json.Marshal(toSerialize)
}

type NullableChannelManagement struct {
	value *ChannelManagement
	isSet bool
}

func (v NullableChannelManagement) Get() *ChannelManagement {
	return v.value
}

func (v *NullableChannelManagement) Set(val *ChannelManagement) {
	v.value = val
	v.isSet = true
}

func (v NullableChannelManagement) IsSet() bool {
	return v.isSet
}

func (v *NullableChannelManagement) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChannelManagement(val *ChannelManagement) *NullableChannelManagement {
	return &NullableChannelManagement{value: val, isSet: true}
}

func (v NullableChannelManagement) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChannelManagement) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


