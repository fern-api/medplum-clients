export type ResearchelementdefinitionStatus =
    | ResearchelementdefinitionStatus.Draft
    | ResearchelementdefinitionStatus.Active
    | ResearchelementdefinitionStatus.Retired;

export const ResearchelementdefinitionStatus = {
    Draft: "draft" as ResearchelementdefinitionStatus.Draft,
    Active: "active" as ResearchelementdefinitionStatus.Active,
    Retired: "retired" as ResearchelementdefinitionStatus.Retired,

    _visit: <Result>(value: ResearchelementdefinitionStatus, visitor: ResearchelementdefinitionStatus._Visitor<Result>): Result => {
        switch (value) {
            case ResearchelementdefinitionStatus.Draft: return visitor.draft();
            case ResearchelementdefinitionStatus.Active: return visitor.active();
            case ResearchelementdefinitionStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ResearchelementdefinitionStatus {
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
