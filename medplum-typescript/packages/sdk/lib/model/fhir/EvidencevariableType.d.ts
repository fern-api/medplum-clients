export declare type EvidencevariableType = EvidencevariableType.Dichotomous | EvidencevariableType.Continuous | EvidencevariableType.Descriptive;
export declare const EvidencevariableType: {
    Dichotomous: EvidencevariableType.Dichotomous;
    Continuous: EvidencevariableType.Continuous;
    Descriptive: EvidencevariableType.Descriptive;
    _visit: <Result>(value: EvidencevariableType, visitor: EvidencevariableType._Visitor<Result>) => Result;
};
export declare namespace EvidencevariableType {
    type Dichotomous = "dichotomous" & {
        __Dichotomous: void;
    };
    type Continuous = "continuous" & {
        __Continuous: void;
    };
    type Descriptive = "descriptive" & {
        __Descriptive: void;
    };
    interface _Visitor<Result> {
        dichotomous: () => Result;
        continuous: () => Result;
        descriptive: () => Result;
        _unknown: () => Result;
    }
}
