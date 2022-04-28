export type Devicedefinition_devicenameType =
    | Devicedefinition_devicenameType.Other;

export const Devicedefinition_devicenameType = {
    Other: "other" as Devicedefinition_devicenameType.Other,

    _visit: <Result>(value: Devicedefinition_devicenameType, visitor: Devicedefinition_devicenameType._Visitor<Result>): Result => {
        switch (value) {
            case Devicedefinition_devicenameType.Other: return visitor.other();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Devicedefinition_devicenameType {
    export type Other = "other" & {
        __Other: void,
    };

    export interface _Visitor<Result> {
        other: () => Result;
        _unknown: () => Result;
    }
}
