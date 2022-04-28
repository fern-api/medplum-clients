export type CapabilitystatementStatus =
    | CapabilitystatementStatus.Draft
    | CapabilitystatementStatus.Active
    | CapabilitystatementStatus.Retired;

export const CapabilitystatementStatus = {
    Draft: "draft" as CapabilitystatementStatus.Draft,
    Active: "active" as CapabilitystatementStatus.Active,
    Retired: "retired" as CapabilitystatementStatus.Retired,

    _visit: <Result>(value: CapabilitystatementStatus, visitor: CapabilitystatementStatus._Visitor<Result>): Result => {
        switch (value) {
            case CapabilitystatementStatus.Draft: return visitor.draft();
            case CapabilitystatementStatus.Active: return visitor.active();
            case CapabilitystatementStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace CapabilitystatementStatus {
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
