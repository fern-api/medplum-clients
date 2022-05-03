export declare type LocationStatus = LocationStatus.Active | LocationStatus.Suspended | LocationStatus.Inactive;
export declare const LocationStatus: {
    Active: LocationStatus.Active;
    Suspended: LocationStatus.Suspended;
    Inactive: LocationStatus.Inactive;
    _visit: <Result>(value: LocationStatus, visitor: LocationStatus._Visitor<Result>) => Result;
};
export declare namespace LocationStatus {
    type Active = "active" & {
        __Active: void;
    };
    type Suspended = "suspended" & {
        __Suspended: void;
    };
    type Inactive = "inactive" & {
        __Inactive: void;
    };
    interface _Visitor<Result> {
        active: () => Result;
        suspended: () => Result;
        inactive: () => Result;
        _unknown: () => Result;
    }
}
