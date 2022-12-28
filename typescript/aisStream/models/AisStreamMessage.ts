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

import { AisMessageTypes } from './AisMessageTypes';
import { AisStreamMessageMessage } from './AisStreamMessageMessage';
import { HttpFile } from '../http/http';

export class AisStreamMessage {
    'metaData': any;
    'messageType': AisMessageTypes;
    'message': AisStreamMessageMessage;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "metaData",
            "baseName": "MetaData",
            "type": "any",
            "format": ""
        },
        {
            "name": "messageType",
            "baseName": "MessageType",
            "type": "AisMessageTypes",
            "format": ""
        },
        {
            "name": "message",
            "baseName": "Message",
            "type": "AisStreamMessageMessage",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AisStreamMessage.attributeTypeMap;
    }

    public constructor() {
    }
}

