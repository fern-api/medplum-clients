export declare type DetectedissueSeverity = DetectedissueSeverity.High | DetectedissueSeverity.Moderate | DetectedissueSeverity.Low;
export declare const DetectedissueSeverity: {
    High: DetectedissueSeverity.High;
    Moderate: DetectedissueSeverity.Moderate;
    Low: DetectedissueSeverity.Low;
    _visit: <Result>(value: DetectedissueSeverity, visitor: DetectedissueSeverity._Visitor<Result>) => Result;
};
export declare namespace DetectedissueSeverity {
    type High = "high" & {
        __High: void;
    };
    type Moderate = "moderate" & {
        __Moderate: void;
    };
    type Low = "low" & {
        __Low: void;
    };
    interface _Visitor<Result> {
        high: () => Result;
        moderate: () => Result;
        low: () => Result;
        _unknown: () => Result;
    }
}
