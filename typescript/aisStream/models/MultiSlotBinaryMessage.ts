/**
 * Ais-Stream WebsocketObjects
 * OpenAPI 3.0 definitions for the data models used by aisstream.io.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { AddressedBinaryMessageApplicationID } from './AddressedBinaryMessageApplicationID';
import { HttpFile } from '../http/http';

export class MultiSlotBinaryMessage {
    'messageID': number;
    'repeatIndicator': number;
    'userID': number;
    'valid': boolean;
    'destinationIDValid': boolean;
    'applicationIDValid': boolean;
    'destinationID': number;
    'spare1': number;
    'applicationID': AddressedBinaryMessageApplicationID;
    'payload': string;
    'spare2': number;
    'communicationStateIsItdma': boolean;
    'communicationState': number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "messageID",
            "baseName": "MessageID",
            "type": "number",
            "format": ""
        },
        {
            "name": "repeatIndicator",
            "baseName": "RepeatIndicator",
            "type": "number",
            "format": ""
        },
        {
            "name": "userID",
            "baseName": "UserID",
            "type": "number",
            "format": ""
        },
        {
            "name": "valid",
            "baseName": "Valid",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "destinationIDValid",
            "baseName": "DestinationIDValid",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "applicationIDValid",
            "baseName": "ApplicationIDValid",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "destinationID",
            "baseName": "DestinationID",
            "type": "number",
            "format": ""
        },
        {
            "name": "spare1",
            "baseName": "Spare1",
            "type": "number",
            "format": ""
        },
        {
            "name": "applicationID",
            "baseName": "ApplicationID",
            "type": "AddressedBinaryMessageApplicationID",
            "format": ""
        },
        {
            "name": "payload",
            "baseName": "Payload",
            "type": "string",
            "format": ""
        },
        {
            "name": "spare2",
            "baseName": "Spare2",
            "type": "number",
            "format": ""
        },
        {
            "name": "communicationStateIsItdma",
            "baseName": "CommunicationStateIsItdma",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "communicationState",
            "baseName": "CommunicationState",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return MultiSlotBinaryMessage.attributeTypeMap;
    }

    public constructor() {
    }
}

