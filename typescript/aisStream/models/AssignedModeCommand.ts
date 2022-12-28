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

import { AssignedModeCommandCommands } from './AssignedModeCommandCommands';
import { HttpFile } from '../http/http';

export class AssignedModeCommand {
    'messageID': number;
    'repeatIndicator': number;
    'userID': number;
    'valid': boolean;
    'spare': number;
    'commands': AssignedModeCommandCommands;

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
            "name": "spare",
            "baseName": "Spare",
            "type": "number",
            "format": ""
        },
        {
            "name": "commands",
            "baseName": "Commands",
            "type": "AssignedModeCommandCommands",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AssignedModeCommand.attributeTypeMap;
    }

    public constructor() {
    }
}

