export declare type CareteamStatus = CareteamStatus.Proposed | CareteamStatus.Active | CareteamStatus.Suspended | CareteamStatus.Inactive;
export declare const CareteamStatus: {
    Proposed: CareteamStatus.Proposed;
    Active: CareteamStatus.Active;
    Suspended: CareteamStatus.Suspended;
    Inactive: CareteamStatus.Inactive;
    _visit: <Result>(value: CareteamStatus, visitor: CareteamStatus._Visitor<Result>) => Result;
};
export declare namespace CareteamStatus {
    type Proposed = "proposed" & {
        __Proposed: void;
    };
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
        proposed: () => Result;
        active: () => Result;
        suspended: () => Result;
        inactive: () => Result;
        _unknown: () => Result;
    }
}
