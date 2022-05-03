export declare type Allergyintolerance_reactionSeverity = Allergyintolerance_reactionSeverity.Mild | Allergyintolerance_reactionSeverity.Moderate | Allergyintolerance_reactionSeverity.Severe;
export declare const Allergyintolerance_reactionSeverity: {
    Mild: Allergyintolerance_reactionSeverity.Mild;
    Moderate: Allergyintolerance_reactionSeverity.Moderate;
    Severe: Allergyintolerance_reactionSeverity.Severe;
    _visit: <Result>(value: Allergyintolerance_reactionSeverity, visitor: Allergyintolerance_reactionSeverity._Visitor<Result>) => Result;
};
export declare namespace Allergyintolerance_reactionSeverity {
    type Mild = "mild" & {
        __Mild: void;
    };
    type Moderate = "moderate" & {
        __Moderate: void;
    };
    type Severe = "severe" & {
        __Severe: void;
    };
    interface _Visitor<Result> {
        mild: () => Result;
        moderate: () => Result;
        severe: () => Result;
        _unknown: () => Result;
    }
}
