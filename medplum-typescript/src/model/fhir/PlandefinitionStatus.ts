export type PlandefinitionStatus =
    | PlandefinitionStatus.Draft
    | PlandefinitionStatus.Active
    | PlandefinitionStatus.Retired;

export const PlandefinitionStatus = {
    Draft: "draft" as PlandefinitionStatus.Draft,
    Active: "active" as PlandefinitionStatus.Active,
    Retired: "retired" as PlandefinitionStatus.Retired,

    _visit: <Result>(
        value: PlandefinitionStatus,
        visitor: PlandefinitionStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case PlandefinitionStatus.Draft:
                return visitor.draft();
            case PlandefinitionStatus.Active:
                return visitor.active();
            case PlandefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace PlandefinitionStatus {
    export type Draft = "draft" & {
        __Draft: void;
    };
    export type Active = "active" & {
        __Active: void;
    };
    export type Retired = "retired" & {
        __Retired: void;
    };

    export interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
