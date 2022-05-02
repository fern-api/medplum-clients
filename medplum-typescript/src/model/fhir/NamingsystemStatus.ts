export type NamingsystemStatus =
    | NamingsystemStatus.Draft
    | NamingsystemStatus.Active
    | NamingsystemStatus.Retired;

export const NamingsystemStatus = {
    Draft: "draft" as NamingsystemStatus.Draft,
    Active: "active" as NamingsystemStatus.Active,
    Retired: "retired" as NamingsystemStatus.Retired,

    _visit: <Result>(
        value: NamingsystemStatus,
        visitor: NamingsystemStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case NamingsystemStatus.Draft:
                return visitor.draft();
            case NamingsystemStatus.Active:
                return visitor.active();
            case NamingsystemStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace NamingsystemStatus {
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
