export declare type Observationdefinition_qualifiedintervalCategory = Observationdefinition_qualifiedintervalCategory.Reference | Observationdefinition_qualifiedintervalCategory.Critical | Observationdefinition_qualifiedintervalCategory.Absolute;
export declare const Observationdefinition_qualifiedintervalCategory: {
    Reference: Observationdefinition_qualifiedintervalCategory.Reference;
    Critical: Observationdefinition_qualifiedintervalCategory.Critical;
    Absolute: Observationdefinition_qualifiedintervalCategory.Absolute;
    _visit: <Result>(value: Observationdefinition_qualifiedintervalCategory, visitor: Observationdefinition_qualifiedintervalCategory._Visitor<Result>) => Result;
};
export declare namespace Observationdefinition_qualifiedintervalCategory {
    type Reference = "reference" & {
        __Reference: void;
    };
    type Critical = "critical" & {
        __Critical: void;
    };
    type Absolute = "absolute" & {
        __Absolute: void;
    };
    interface _Visitor<Result> {
        reference: () => Result;
        critical: () => Result;
        absolute: () => Result;
        _unknown: () => Result;
    }
}
