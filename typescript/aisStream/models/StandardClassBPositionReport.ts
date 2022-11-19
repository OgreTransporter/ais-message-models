/**
 * Ais-Stream WebsocketObjects
 * A sample API to illustrate OpenAPI concepts
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class StandardClassBPositionReport {
    'messageID': number;
    'repeatIndicator': number;
    'userID': number;
    'valid': boolean;
    'spare1': number;
    'sog': number;
    'positionAccuracy': boolean;
    'longitude': number;
    'latitude': number;
    'cog': number;
    'trueHeading': number;
    'timestamp': number;
    'spare2': number;
    'classBUnit': boolean;
    'classBDisplay': boolean;
    'classBDsc': boolean;
    'classBBand': boolean;
    'classBMsg22': boolean;
    'assignedMode': boolean;
    'raim': boolean;
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
            "name": "spare1",
            "baseName": "Spare1",
            "type": "number",
            "format": ""
        },
        {
            "name": "sog",
            "baseName": "Sog",
            "type": "number",
            "format": "double"
        },
        {
            "name": "positionAccuracy",
            "baseName": "PositionAccuracy",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "longitude",
            "baseName": "Longitude",
            "type": "number",
            "format": "double"
        },
        {
            "name": "latitude",
            "baseName": "Latitude",
            "type": "number",
            "format": "double"
        },
        {
            "name": "cog",
            "baseName": "Cog",
            "type": "number",
            "format": "double"
        },
        {
            "name": "trueHeading",
            "baseName": "TrueHeading",
            "type": "number",
            "format": ""
        },
        {
            "name": "timestamp",
            "baseName": "Timestamp",
            "type": "number",
            "format": ""
        },
        {
            "name": "spare2",
            "baseName": "Spare2",
            "type": "number",
            "format": ""
        },
        {
            "name": "classBUnit",
            "baseName": "ClassBUnit",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "classBDisplay",
            "baseName": "ClassBDisplay",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "classBDsc",
            "baseName": "ClassBDsc",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "classBBand",
            "baseName": "ClassBBand",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "classBMsg22",
            "baseName": "ClassBMsg22",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "assignedMode",
            "baseName": "AssignedMode",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "raim",
            "baseName": "Raim",
            "type": "boolean",
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
        return StandardClassBPositionReport.attributeTypeMap;
    }

    public constructor() {
    }
}

