export type Allergyintolerance_reactionSeverity =
    | Allergyintolerance_reactionSeverity.Mild
    | Allergyintolerance_reactionSeverity.Moderate
    | Allergyintolerance_reactionSeverity.Severe;

export const Allergyintolerance_reactionSeverity = {
    Mild: "mild" as Allergyintolerance_reactionSeverity.Mild,
    Moderate: "moderate" as Allergyintolerance_reactionSeverity.Moderate,
    Severe: "severe" as Allergyintolerance_reactionSeverity.Severe,

    _visit: <Result>(
        value: Allergyintolerance_reactionSeverity,
        visitor: Allergyintolerance_reactionSeverity._Visitor<Result>
    ): Result => {
        switch (value) {
            case Allergyintolerance_reactionSeverity.Mild:
                return visitor.mild();
            case Allergyintolerance_reactionSeverity.Moderate:
                return visitor.moderate();
            case Allergyintolerance_reactionSeverity.Severe:
                return visitor.severe();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Allergyintolerance_reactionSeverity {
    export type Mild = "mild" & {
        __Mild: void;
    };
    export type Moderate = "moderate" & {
        __Moderate: void;
    };
    export type Severe = "severe" & {
        __Severe: void;
    };

    export interface _Visitor<Result> {
        mild: () => Result;
        moderate: () => Result;
        severe: () => Result;
        _unknown: () => Result;
    }
}
