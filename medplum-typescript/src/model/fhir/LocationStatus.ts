export type LocationStatus =
    | LocationStatus.Active
    | LocationStatus.Suspended
    | LocationStatus.Inactive;

export const LocationStatus = {
    Active: "active" as LocationStatus.Active,
    Suspended: "suspended" as LocationStatus.Suspended,
    Inactive: "inactive" as LocationStatus.Inactive,

    _visit: <Result>(
        value: LocationStatus,
        visitor: LocationStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case LocationStatus.Active:
                return visitor.active();
            case LocationStatus.Suspended:
                return visitor.suspended();
            case LocationStatus.Inactive:
                return visitor.inactive();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace LocationStatus {
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
        active: () => Result;
        suspended: () => Result;
        inactive: () => Result;
        _unknown: () => Result;
    }
}
