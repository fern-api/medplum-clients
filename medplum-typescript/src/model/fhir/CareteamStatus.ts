export type CareteamStatus =
    | CareteamStatus.Proposed
    | CareteamStatus.Active
    | CareteamStatus.Suspended
    | CareteamStatus.Inactive;

export const CareteamStatus = {
    Proposed: "proposed" as CareteamStatus.Proposed,
    Active: "active" as CareteamStatus.Active,
    Suspended: "suspended" as CareteamStatus.Suspended,
    Inactive: "inactive" as CareteamStatus.Inactive,

    _visit: <Result>(
        value: CareteamStatus,
        visitor: CareteamStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case CareteamStatus.Proposed:
                return visitor.proposed();
            case CareteamStatus.Active:
                return visitor.active();
            case CareteamStatus.Suspended:
                return visitor.suspended();
            case CareteamStatus.Inactive:
                return visitor.inactive();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace CareteamStatus {
    export type Proposed = "proposed" & {
        __Proposed: void;
    };
    export type Active = "active" & {
        __Active: void;
    };
    export type Suspended = "suspended" & {
        __Suspended: void;
    };
    export type Inactive = "inactive" & {
        __Inactive: void;
    };

    export interface _Visitor<Result> {
        proposed: () => Result;
        active: () => Result;
        suspended: () => Result;
        inactive: () => Result;
        _unknown: () => Result;
    }
}
