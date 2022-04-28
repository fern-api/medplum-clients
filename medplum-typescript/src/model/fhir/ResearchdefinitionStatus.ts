export type ResearchdefinitionStatus =
    | ResearchdefinitionStatus.Draft
    | ResearchdefinitionStatus.Active
    | ResearchdefinitionStatus.Retired;

export const ResearchdefinitionStatus = {
    Draft: "draft" as ResearchdefinitionStatus.Draft,
    Active: "active" as ResearchdefinitionStatus.Active,
    Retired: "retired" as ResearchdefinitionStatus.Retired,

    _visit: <Result>(value: ResearchdefinitionStatus, visitor: ResearchdefinitionStatus._Visitor<Result>): Result => {
        switch (value) {
            case ResearchdefinitionStatus.Draft: return visitor.draft();
            case ResearchdefinitionStatus.Active: return visitor.active();
            case ResearchdefinitionStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ResearchdefinitionStatus {
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
