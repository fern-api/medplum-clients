export type ChargeitemdefinitionStatus =
    | ChargeitemdefinitionStatus.Draft
    | ChargeitemdefinitionStatus.Active
    | ChargeitemdefinitionStatus.Retired;

export const ChargeitemdefinitionStatus = {
    Draft: "draft" as ChargeitemdefinitionStatus.Draft,
    Active: "active" as ChargeitemdefinitionStatus.Active,
    Retired: "retired" as ChargeitemdefinitionStatus.Retired,

    _visit: <Result>(
        value: ChargeitemdefinitionStatus,
        visitor: ChargeitemdefinitionStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case ChargeitemdefinitionStatus.Draft:
                return visitor.draft();
            case ChargeitemdefinitionStatus.Active:
                return visitor.active();
            case ChargeitemdefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace ChargeitemdefinitionStatus {
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
