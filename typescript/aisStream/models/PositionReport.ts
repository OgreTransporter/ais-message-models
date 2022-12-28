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

export class PositionReport {
    'messageID': number;
    'repeatIndicator': number;
    'userID': number;
    'valid': boolean;
    'navigationalStatus': number;
    'rateOfTurn': number;
    'sog': number;
    'positionAccuracy': boolean;
    'longitude': number;
    'latitude': number;
    'cog': number;
    'trueHeading': number;
    'timestamp': number;
    'specialManoeuvreIndicator': number;
    'spare': number;
    'raim': boolean;
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
            "name": "navigationalStatus",
            "baseName": "NavigationalStatus",
            "type": "number",
            "format": ""
        },
        {
            "name": "rateOfTurn",
            "baseName": "RateOfTurn",
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
            "name": "specialManoeuvreIndicator",
            "baseName": "SpecialManoeuvreIndicator",
            "type": "number",
            "format": ""
        },
        {
            "name": "spare",
            "baseName": "Spare",
            "type": "number",
            "format": ""
        },
        {
            "name": "raim",
            "baseName": "Raim",
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
        return PositionReport.attributeTypeMap;
    }

    public constructor() {
    }
}

