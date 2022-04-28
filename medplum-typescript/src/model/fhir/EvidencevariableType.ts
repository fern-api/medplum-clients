export type EvidencevariableType =
    | EvidencevariableType.Dichotomous
    | EvidencevariableType.Continuous
    | EvidencevariableType.Descriptive;

export const EvidencevariableType = {
    Dichotomous: "dichotomous" as EvidencevariableType.Dichotomous,
    Continuous: "continuous" as EvidencevariableType.Continuous,
    Descriptive: "descriptive" as EvidencevariableType.Descriptive,

    _visit: <Result>(value: EvidencevariableType, visitor: EvidencevariableType._Visitor<Result>): Result => {
        switch (value) {
            case EvidencevariableType.Dichotomous: return visitor.dichotomous();
            case EvidencevariableType.Continuous: return visitor.continuous();
            case EvidencevariableType.Descriptive: return visitor.descriptive();
            default: return visitor._unknown();
        }
    },
};

export declare namespace EvidencevariableType {
    export type Dichotomous = "dichotomous" & {
        __Dichotomous: void,
    };
    export type Continuous = "continuous" & {
        __Continuous: void,
    };
    export type Descriptive = "descriptive" & {
        __Descriptive: void,
    };

    export interface _Visitor<Result> {
        dichotomous: () => Result;
        continuous: () => Result;
        descriptive: () => Result;
        _unknown: () => Result;
    }
}
