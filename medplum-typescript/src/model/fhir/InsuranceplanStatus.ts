export type InsuranceplanStatus =
    | InsuranceplanStatus.Draft
    | InsuranceplanStatus.Active
    | InsuranceplanStatus.Retired;

export const InsuranceplanStatus = {
    Draft: "draft" as InsuranceplanStatus.Draft,
    Active: "active" as InsuranceplanStatus.Active,
    Retired: "retired" as InsuranceplanStatus.Retired,

    _visit: <Result>(
        value: InsuranceplanStatus,
        visitor: InsuranceplanStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case InsuranceplanStatus.Draft:
                return visitor.draft();
            case InsuranceplanStatus.Active:
                return visitor.active();
            case InsuranceplanStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace InsuranceplanStatus {
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
