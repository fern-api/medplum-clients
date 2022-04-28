export type CodesystemStatus =
    | CodesystemStatus.Draft
    | CodesystemStatus.Active
    | CodesystemStatus.Retired;

export const CodesystemStatus = {
    Draft: "draft" as CodesystemStatus.Draft,
    Active: "active" as CodesystemStatus.Active,
    Retired: "retired" as CodesystemStatus.Retired,

    _visit: <Result>(value: CodesystemStatus, visitor: CodesystemStatus._Visitor<Result>): Result => {
        switch (value) {
            case CodesystemStatus.Draft: return visitor.draft();
            case CodesystemStatus.Active: return visitor.active();
            case CodesystemStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace CodesystemStatus {
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
