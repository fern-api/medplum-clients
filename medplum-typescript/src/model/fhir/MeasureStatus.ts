export type MeasureStatus =
    | MeasureStatus.Draft
    | MeasureStatus.Active
    | MeasureStatus.Retired;

export const MeasureStatus = {
    Draft: "draft" as MeasureStatus.Draft,
    Active: "active" as MeasureStatus.Active,
    Retired: "retired" as MeasureStatus.Retired,

    _visit: <Result>(
        value: MeasureStatus,
        visitor: MeasureStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case MeasureStatus.Draft:
                return visitor.draft();
            case MeasureStatus.Active:
                return visitor.active();
            case MeasureStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace MeasureStatus {
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
