export type StructuredefinitionStatus =
    | StructuredefinitionStatus.Draft
    | StructuredefinitionStatus.Active
    | StructuredefinitionStatus.Retired;

export const StructuredefinitionStatus = {
    Draft: "draft" as StructuredefinitionStatus.Draft,
    Active: "active" as StructuredefinitionStatus.Active,
    Retired: "retired" as StructuredefinitionStatus.Retired,

    _visit: <Result>(
        value: StructuredefinitionStatus,
        visitor: StructuredefinitionStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case StructuredefinitionStatus.Draft:
                return visitor.draft();
            case StructuredefinitionStatus.Active:
                return visitor.active();
            case StructuredefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace StructuredefinitionStatus {
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
