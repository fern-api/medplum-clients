export declare type Device_devicenameType = Device_devicenameType.Other;
export declare const Device_devicenameType: {
    Other: Device_devicenameType.Other;
    _visit: <Result>(value: Device_devicenameType, visitor: Device_devicenameType._Visitor<Result>) => Result;
};
export declare namespace Device_devicenameType {
    type Other = "other" & {
        __Other: void;
    };
    interface _Visitor<Result> {
        other: () => Result;
        _unknown: () => Result;
    }
}
