export type ValuesetStatus =
    | ValuesetStatus.Draft
    | ValuesetStatus.Active
    | ValuesetStatus.Retired;

export const ValuesetStatus = {
    Draft: "draft" as ValuesetStatus.Draft,
    Active: "active" as ValuesetStatus.Active,
    Retired: "retired" as ValuesetStatus.Retired,

    _visit: <Result>(value: ValuesetStatus, visitor: ValuesetStatus._Visitor<Result>): Result => {
        switch (value) {
            case ValuesetStatus.Draft: return visitor.draft();
            case ValuesetStatus.Active: return visitor.active();
            case ValuesetStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ValuesetStatus {
    export type Draft = "draft" & {
        __Draft: void,
    };
    export type Active = "active" & {
        __Active: void,
    };
    export type Retired = "retired" & {
        __Retired: void,
    };

    export interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
