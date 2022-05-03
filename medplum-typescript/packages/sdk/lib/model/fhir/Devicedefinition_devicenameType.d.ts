export declare type Devicedefinition_devicenameType = Devicedefinition_devicenameType.Other;
export declare const Devicedefinition_devicenameType: {
    Other: Devicedefinition_devicenameType.Other;
    _visit: <Result>(value: Devicedefinition_devicenameType, visitor: Devicedefinition_devicenameType._Visitor<Result>) => Result;
};
export declare namespace Devicedefinition_devicenameType {
    type Other = "other" & {
        __Other: void;
    };
    interface _Visitor<Result> {
        other: () => Result;
        _unknown: () => Result;
    }
}
