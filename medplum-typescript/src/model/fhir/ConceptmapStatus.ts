export type ConceptmapStatus =
    | ConceptmapStatus.Draft
    | ConceptmapStatus.Active
    | ConceptmapStatus.Retired;

export const ConceptmapStatus = {
    Draft: "draft" as ConceptmapStatus.Draft,
    Active: "active" as ConceptmapStatus.Active,
    Retired: "retired" as ConceptmapStatus.Retired,

    _visit: <Result>(value: ConceptmapStatus, visitor: ConceptmapStatus._Visitor<Result>): Result => {
        switch (value) {
            case ConceptmapStatus.Draft: return visitor.draft();
            case ConceptmapStatus.Active: return visitor.active();
            case ConceptmapStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ConceptmapStatus {
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
