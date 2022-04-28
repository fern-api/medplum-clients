export type ExplanationofbenefitStatus =
    | ExplanationofbenefitStatus.Active
    | ExplanationofbenefitStatus.Cancelled
    | ExplanationofbenefitStatus.Draft;

export const ExplanationofbenefitStatus = {
    Active: "active" as ExplanationofbenefitStatus.Active,
    Cancelled: "cancelled" as ExplanationofbenefitStatus.Cancelled,
    Draft: "draft" as ExplanationofbenefitStatus.Draft,

    _visit: <Result>(value: ExplanationofbenefitStatus, visitor: ExplanationofbenefitStatus._Visitor<Result>): Result => {
        switch (value) {
            case ExplanationofbenefitStatus.Active: return visitor.active();
            case ExplanationofbenefitStatus.Cancelled: return visitor.cancelled();
            case ExplanationofbenefitStatus.Draft: return visitor.draft();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ExplanationofbenefitStatus {
    export type Active = "active" & {
        __Active: void,
    };
    export type Cancelled = "cancelled" & {
        __Cancelled: void,
    };
    export type Draft = "draft" & {
        __Draft: void,
    };

    export interface _Visitor<Result> {
        active: () => Result;
        cancelled: () => Result;
        draft: () => Result;
        _unknown: () => Result;
    }
}
