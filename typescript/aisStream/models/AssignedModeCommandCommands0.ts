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

import { HttpFile } from '../http/http';

export class AssignedModeCommandCommands0 {
    'valid': boolean;
    'destinationID': number;
    'offset': number;
    'increment': number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "valid",
            "baseName": "Valid",
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
            "name": "offset",
            "baseName": "Offset",
            "type": "number",
            "format": ""
        },
        {
            "name": "increment",
            "baseName": "Increment",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AssignedModeCommandCommands0.attributeTypeMap;
    }

    public constructor() {
    }
}

