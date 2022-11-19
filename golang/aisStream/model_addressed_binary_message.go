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

// AddressedBinaryMessage struct for AddressedBinaryMessage
type AddressedBinaryMessage struct {
	MessageID int32 `json:"MessageID"`
	RepeatIndicator int32 `json:"RepeatIndicator"`
	UserID int32 `json:"UserID"`
	Valid bool `json:"Valid"`
	Sequenceinteger int32 `json:"Sequenceinteger"`
	DestinationID int32 `json:"DestinationID"`
	Retransmission bool `json:"Retransmission"`
	Spare bool `json:"Spare"`
	ApplicationID AddressedBinaryMessageApplicationID `json:"ApplicationID"`
	BinaryData string `json:"BinaryData"`
}

// NewAddressedBinaryMessage instantiates a new AddressedBinaryMessage object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAddressedBinaryMessage(messageID int32, repeatIndicator int32, userID int32, valid bool, sequenceinteger int32, destinationID int32, retransmission bool, spare bool, applicationID AddressedBinaryMessageApplicationID, binaryData string) *AddressedBinaryMessage {
	this := AddressedBinaryMessage{}
	this.MessageID = messageID
	this.RepeatIndicator = repeatIndicator
	this.UserID = userID
	this.Valid = valid
	this.Sequenceinteger = sequenceinteger
	this.DestinationID = destinationID
	this.Retransmission = retransmission
	this.Spare = spare
	this.ApplicationID = applicationID
	this.BinaryData = binaryData
	return &this
}

// NewAddressedBinaryMessageWithDefaults instantiates a new AddressedBinaryMessage object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAddressedBinaryMessageWithDefaults() *AddressedBinaryMessage {
	this := AddressedBinaryMessage{}
	return &this
}

// GetMessageID returns the MessageID field value
func (o *AddressedBinaryMessage) GetMessageID() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.MessageID
}

// GetMessageIDOk returns a tuple with the MessageID field value
// and a boolean to check if the value has been set.
func (o *AddressedBinaryMessage) GetMessageIDOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MessageID, true
}

// SetMessageID sets field value
func (o *AddressedBinaryMessage) SetMessageID(v int32) {
	o.MessageID = v
}

// GetRepeatIndicator returns the RepeatIndicator field value
func (o *AddressedBinaryMessage) GetRepeatIndicator() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.RepeatIndicator
}

// GetRepeatIndicatorOk returns a tuple with the RepeatIndicator field value
// and a boolean to check if the value has been set.
func (o *AddressedBinaryMessage) GetRepeatIndicatorOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RepeatIndicator, true
}

// SetRepeatIndicator sets field value
func (o *AddressedBinaryMessage) SetRepeatIndicator(v int32) {
	o.RepeatIndicator = v
}

// GetUserID returns the UserID field value
func (o *AddressedBinaryMessage) GetUserID() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.UserID
}

// GetUserIDOk returns a tuple with the UserID field value
// and a boolean to check if the value has been set.
func (o *AddressedBinaryMessage) GetUserIDOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.UserID, true
}

// SetUserID sets field value
func (o *AddressedBinaryMessage) SetUserID(v int32) {
	o.UserID = v
}

// GetValid returns the Valid field value
func (o *AddressedBinaryMessage) GetValid() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Valid
}

// GetValidOk returns a tuple with the Valid field value
// and a boolean to check if the value has been set.
func (o *AddressedBinaryMessage) GetValidOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Valid, true
}

// SetValid sets field value
func (o *AddressedBinaryMessage) SetValid(v bool) {
	o.Valid = v
}

// GetSequenceinteger returns the Sequenceinteger field value
func (o *AddressedBinaryMessage) GetSequenceinteger() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Sequenceinteger
}

// GetSequenceintegerOk returns a tuple with the Sequenceinteger field value
// and a boolean to check if the value has been set.
func (o *AddressedBinaryMessage) GetSequenceintegerOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Sequenceinteger, true
}

// SetSequenceinteger sets field value
func (o *AddressedBinaryMessage) SetSequenceinteger(v int32) {
	o.Sequenceinteger = v
}

// GetDestinationID returns the DestinationID field value
func (o *AddressedBinaryMessage) GetDestinationID() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.DestinationID
}

// GetDestinationIDOk returns a tuple with the DestinationID field value
// and a boolean to check if the value has been set.
func (o *AddressedBinaryMessage) GetDestinationIDOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.DestinationID, true
}

// SetDestinationID sets field value
func (o *AddressedBinaryMessage) SetDestinationID(v int32) {
	o.DestinationID = v
}

// GetRetransmission returns the Retransmission field value
func (o *AddressedBinaryMessage) GetRetransmission() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Retransmission
}

// GetRetransmissionOk returns a tuple with the Retransmission field value
// and a boolean to check if the value has been set.
func (o *AddressedBinaryMessage) GetRetransmissionOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Retransmission, true
}

// SetRetransmission sets field value
func (o *AddressedBinaryMessage) SetRetransmission(v bool) {
	o.Retransmission = v
}

// GetSpare returns the Spare field value
func (o *AddressedBinaryMessage) GetSpare() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Spare
}

// GetSpareOk returns a tuple with the Spare field value
// and a boolean to check if the value has been set.
func (o *AddressedBinaryMessage) GetSpareOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Spare, true
}

// SetSpare sets field value
func (o *AddressedBinaryMessage) SetSpare(v bool) {
	o.Spare = v
}

// GetApplicationID returns the ApplicationID field value
func (o *AddressedBinaryMessage) GetApplicationID() AddressedBinaryMessageApplicationID {
	if o == nil {
		var ret AddressedBinaryMessageApplicationID
		return ret
	}

	return o.ApplicationID
}

// GetApplicationIDOk returns a tuple with the ApplicationID field value
// and a boolean to check if the value has been set.
func (o *AddressedBinaryMessage) GetApplicationIDOk() (*AddressedBinaryMessageApplicationID, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ApplicationID, true
}

// SetApplicationID sets field value
func (o *AddressedBinaryMessage) SetApplicationID(v AddressedBinaryMessageApplicationID) {
	o.ApplicationID = v
}

// GetBinaryData returns the BinaryData field value
func (o *AddressedBinaryMessage) GetBinaryData() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.BinaryData
}

// GetBinaryDataOk returns a tuple with the BinaryData field value
// and a boolean to check if the value has been set.
func (o *AddressedBinaryMessage) GetBinaryDataOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.BinaryData, true
}

// SetBinaryData sets field value
func (o *AddressedBinaryMessage) SetBinaryData(v string) {
	o.BinaryData = v
}

func (o AddressedBinaryMessage) MarshalJSON() ([]byte, error) {
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
		toSerialize["Sequenceinteger"] = o.Sequenceinteger
	}
	if true {
		toSerialize["DestinationID"] = o.DestinationID
	}
	if true {
		toSerialize["Retransmission"] = o.Retransmission
	}
	if true {
		toSerialize["Spare"] = o.Spare
	}
	if true {
		toSerialize["ApplicationID"] = o.ApplicationID
	}
	if true {
		toSerialize["BinaryData"] = o.BinaryData
	}
	return json.Marshal(toSerialize)
}

type NullableAddressedBinaryMessage struct {
	value *AddressedBinaryMessage
	isSet bool
}

func (v NullableAddressedBinaryMessage) Get() *AddressedBinaryMessage {
	return v.value
}

func (v *NullableAddressedBinaryMessage) Set(val *AddressedBinaryMessage) {
	v.value = val
	v.isSet = true
}

func (v NullableAddressedBinaryMessage) IsSet() bool {
	return v.isSet
}

func (v *NullableAddressedBinaryMessage) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAddressedBinaryMessage(val *AddressedBinaryMessage) *NullableAddressedBinaryMessage {
	return &NullableAddressedBinaryMessage{value: val, isSet: true}
}

func (v NullableAddressedBinaryMessage) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAddressedBinaryMessage) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


