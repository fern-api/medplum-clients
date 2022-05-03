export declare type ExplanationofbenefitStatus = ExplanationofbenefitStatus.Active | ExplanationofbenefitStatus.Cancelled | ExplanationofbenefitStatus.Draft;
export declare const ExplanationofbenefitStatus: {
    Active: ExplanationofbenefitStatus.Active;
    Cancelled: ExplanationofbenefitStatus.Cancelled;
    Draft: ExplanationofbenefitStatus.Draft;
    _visit: <Result>(value: ExplanationofbenefitStatus, visitor: ExplanationofbenefitStatus._Visitor<Result>) => Result;
};
export declare namespace ExplanationofbenefitStatus {
    type Active = "active" & {
        __Active: void;
    };
    type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    type Draft = "draft" & {
        __Draft: void;
    };
    interface _Visitor<Result> {
        active: () => Result;
        cancelled: () => Result;
        draft: () => Result;
        _unknown: () => Result;
    }
}
