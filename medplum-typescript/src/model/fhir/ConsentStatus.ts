export type ConsentStatus =
    | ConsentStatus.Draft
    | ConsentStatus.Proposed
    | ConsentStatus.Active
    | ConsentStatus.Rejected
    | ConsentStatus.Inactive;

export const ConsentStatus = {
    Draft: "draft" as ConsentStatus.Draft,
    Proposed: "proposed" as ConsentStatus.Proposed,
    Active: "active" as ConsentStatus.Active,
    Rejected: "rejected" as ConsentStatus.Rejected,
    Inactive: "inactive" as ConsentStatus.Inactive,

    _visit: <Result>(
        value: ConsentStatus,
        visitor: ConsentStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case ConsentStatus.Draft:
                return visitor.draft();
            case ConsentStatus.Proposed:
                return visitor.proposed();
            case ConsentStatus.Active:
                return visitor.active();
            case ConsentStatus.Rejected:
                return visitor.rejected();
            case ConsentStatus.Inactive:
                return visitor.inactive();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace ConsentStatus {
    export type Draft = "draft" & {
        __Draft: void;
    };
    export type Proposed = "proposed" & {
        __Proposed: void;
    };
    export type Active = "active" & {
        __Active: void;
    };
    export type Rejected = "rejected" & {
        __Rejected: void;
    };
    export type Inactive = "inactive" & {
        __Inactive: void;
    };

    export interface _Visitor<Result> {
        draft: () => Result;
        proposed: () => Result;
        active: () => Result;
        rejected: () => Result;
        inactive: () => Result;
        _unknown: () => Result;
    }
}
