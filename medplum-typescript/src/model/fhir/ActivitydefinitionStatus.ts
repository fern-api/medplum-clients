export type ActivitydefinitionStatus =
    | ActivitydefinitionStatus.Draft
    | ActivitydefinitionStatus.Active
    | ActivitydefinitionStatus.Retired;

export const ActivitydefinitionStatus = {
    Draft: "draft" as ActivitydefinitionStatus.Draft,
    Active: "active" as ActivitydefinitionStatus.Active,
    Retired: "retired" as ActivitydefinitionStatus.Retired,

    _visit: <Result>(value: ActivitydefinitionStatus, visitor: ActivitydefinitionStatus._Visitor<Result>): Result => {
        switch (value) {
            case ActivitydefinitionStatus.Draft: return visitor.draft();
            case ActivitydefinitionStatus.Active: return visitor.active();
            case ActivitydefinitionStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ActivitydefinitionStatus {
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
