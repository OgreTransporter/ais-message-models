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

// AssignedModeCommandCommands struct for AssignedModeCommandCommands
type AssignedModeCommandCommands struct {
	Var0 AssignedModeCommandCommands0 `json:"0"`
	Var1 AssignedModeCommandCommands0 `json:"1"`
}

// NewAssignedModeCommandCommands instantiates a new AssignedModeCommandCommands object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAssignedModeCommandCommands(var0 AssignedModeCommandCommands0, var1 AssignedModeCommandCommands0) *AssignedModeCommandCommands {
	this := AssignedModeCommandCommands{}
	this.Var0 = var0
	this.Var1 = var1
	return &this
}

// NewAssignedModeCommandCommandsWithDefaults instantiates a new AssignedModeCommandCommands object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAssignedModeCommandCommandsWithDefaults() *AssignedModeCommandCommands {
	this := AssignedModeCommandCommands{}
	return &this
}

// GetVar0 returns the Var0 field value
func (o *AssignedModeCommandCommands) GetVar0() AssignedModeCommandCommands0 {
	if o == nil {
		var ret AssignedModeCommandCommands0
		return ret
	}

	return o.Var0
}

// GetVar0Ok returns a tuple with the Var0 field value
// and a boolean to check if the value has been set.
func (o *AssignedModeCommandCommands) GetVar0Ok() (*AssignedModeCommandCommands0, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Var0, true
}

// SetVar0 sets field value
func (o *AssignedModeCommandCommands) SetVar0(v AssignedModeCommandCommands0) {
	o.Var0 = v
}

// GetVar1 returns the Var1 field value
func (o *AssignedModeCommandCommands) GetVar1() AssignedModeCommandCommands0 {
	if o == nil {
		var ret AssignedModeCommandCommands0
		return ret
	}

	return o.Var1
}

// GetVar1Ok returns a tuple with the Var1 field value
// and a boolean to check if the value has been set.
func (o *AssignedModeCommandCommands) GetVar1Ok() (*AssignedModeCommandCommands0, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Var1, true
}

// SetVar1 sets field value
func (o *AssignedModeCommandCommands) SetVar1(v AssignedModeCommandCommands0) {
	o.Var1 = v
}

func (o AssignedModeCommandCommands) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["0"] = o.Var0
	}
	if true {
		toSerialize["1"] = o.Var1
	}
	return json.Marshal(toSerialize)
}

type NullableAssignedModeCommandCommands struct {
	value *AssignedModeCommandCommands
	isSet bool
}

func (v NullableAssignedModeCommandCommands) Get() *AssignedModeCommandCommands {
	return v.value
}

func (v *NullableAssignedModeCommandCommands) Set(val *AssignedModeCommandCommands) {
	v.value = val
	v.isSet = true
}

func (v NullableAssignedModeCommandCommands) IsSet() bool {
	return v.isSet
}

func (v *NullableAssignedModeCommandCommands) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAssignedModeCommandCommands(val *AssignedModeCommandCommands) *NullableAssignedModeCommandCommands {
	return &NullableAssignedModeCommandCommands{value: val, isSet: true}
}

func (v NullableAssignedModeCommandCommands) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAssignedModeCommandCommands) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


