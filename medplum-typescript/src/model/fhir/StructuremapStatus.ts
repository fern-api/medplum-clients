export type StructuremapStatus =
    | StructuremapStatus.Draft
    | StructuremapStatus.Active
    | StructuremapStatus.Retired;

export const StructuremapStatus = {
    Draft: "draft" as StructuremapStatus.Draft,
    Active: "active" as StructuremapStatus.Active,
    Retired: "retired" as StructuremapStatus.Retired,

    _visit: <Result>(
        value: StructuremapStatus,
        visitor: StructuremapStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case StructuremapStatus.Draft:
                return visitor.draft();
            case StructuremapStatus.Active:
                return visitor.active();
            case StructuremapStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace StructuremapStatus {
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
