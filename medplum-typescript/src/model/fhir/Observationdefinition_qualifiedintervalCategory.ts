export type Observationdefinition_qualifiedintervalCategory =
    | Observationdefinition_qualifiedintervalCategory.Reference
    | Observationdefinition_qualifiedintervalCategory.Critical
    | Observationdefinition_qualifiedintervalCategory.Absolute;

export const Observationdefinition_qualifiedintervalCategory = {
    Reference:
        "reference" as Observationdefinition_qualifiedintervalCategory.Reference,
    Critical:
        "critical" as Observationdefinition_qualifiedintervalCategory.Critical,
    Absolute:
        "absolute" as Observationdefinition_qualifiedintervalCategory.Absolute,

    _visit: <Result>(
        value: Observationdefinition_qualifiedintervalCategory,
        visitor: Observationdefinition_qualifiedintervalCategory._Visitor<Result>
    ): Result => {
        switch (value) {
            case Observationdefinition_qualifiedintervalCategory.Reference:
                return visitor.reference();
            case Observationdefinition_qualifiedintervalCategory.Critical:
                return visitor.critical();
            case Observationdefinition_qualifiedintervalCategory.Absolute:
                return visitor.absolute();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Observationdefinition_qualifiedintervalCategory {
    export type Reference = "reference" & {
        __Reference: void;
    };
    export type Critical = "critical" & {
        __Critical: void;
    };
    export type Absolute = "absolute" & {
        __Absolute: void;
    };

    export interface _Visitor<Result> {
        reference: () => Result;
        critical: () => Result;
        absolute: () => Result;
        _unknown: () => Result;
    }
}
