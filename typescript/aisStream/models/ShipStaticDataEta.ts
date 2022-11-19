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

export class ShipStaticDataEta {
    'month': number;
    'day': number;
    'hour': number;
    'minute': number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "month",
            "baseName": "Month",
            "type": "number",
            "format": ""
        },
        {
            "name": "day",
            "baseName": "Day",
            "type": "number",
            "format": ""
        },
        {
            "name": "hour",
            "baseName": "Hour",
            "type": "number",
            "format": ""
        },
        {
            "name": "minute",
            "baseName": "Minute",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ShipStaticDataEta.attributeTypeMap;
    }

    public constructor() {
    }
}

