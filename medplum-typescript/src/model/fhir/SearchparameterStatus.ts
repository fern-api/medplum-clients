export type SearchparameterStatus =
    | SearchparameterStatus.Draft
    | SearchparameterStatus.Active
    | SearchparameterStatus.Retired;

export const SearchparameterStatus = {
    Draft: "draft" as SearchparameterStatus.Draft,
    Active: "active" as SearchparameterStatus.Active,
    Retired: "retired" as SearchparameterStatus.Retired,

    _visit: <Result>(value: SearchparameterStatus, visitor: SearchparameterStatus._Visitor<Result>): Result => {
        switch (value) {
            case SearchparameterStatus.Draft: return visitor.draft();
            case SearchparameterStatus.Active: return visitor.active();
            case SearchparameterStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace SearchparameterStatus {
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
