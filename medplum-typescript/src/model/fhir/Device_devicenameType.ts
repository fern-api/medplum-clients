export type Device_devicenameType = Device_devicenameType.Other;

export const Device_devicenameType = {
    Other: "other" as Device_devicenameType.Other,

    _visit: <Result>(
        value: Device_devicenameType,
        visitor: Device_devicenameType._Visitor<Result>
    ): Result => {
        switch (value) {
            case Device_devicenameType.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Device_devicenameType {
    export type Other = "other" & {
        __Other: void;
    };

    export interface _Visitor<Result> {
        other: () => Result;
        _unknown: () => Result;
    }
}
