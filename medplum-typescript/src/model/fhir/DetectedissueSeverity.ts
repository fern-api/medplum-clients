export type DetectedissueSeverity =
    | DetectedissueSeverity.High
    | DetectedissueSeverity.Moderate
    | DetectedissueSeverity.Low;

export const DetectedissueSeverity = {
    High: "high" as DetectedissueSeverity.High,
    Moderate: "moderate" as DetectedissueSeverity.Moderate,
    Low: "low" as DetectedissueSeverity.Low,

    _visit: <Result>(value: DetectedissueSeverity, visitor: DetectedissueSeverity._Visitor<Result>): Result => {
        switch (value) {
            case DetectedissueSeverity.High: return visitor.high();
            case DetectedissueSeverity.Moderate: return visitor.moderate();
            case DetectedissueSeverity.Low: return visitor.low();
            default: return visitor._unknown();
        }
    },
};

export declare namespace DetectedissueSeverity {
    export type High = "high" & {
        __High: void,
    };
    export type Moderate = "moderate" & {
        __Moderate: void,
    };
    export type Low = "low" & {
        __Low: void,
    };

    export interface _Visitor<Result> {
        high: () => Result;
        moderate: () => Result;
        low: () => Result;
        _unknown: () => Result;
    }
}
