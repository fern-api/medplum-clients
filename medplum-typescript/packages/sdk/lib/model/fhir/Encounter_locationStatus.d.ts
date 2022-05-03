export declare type Encounter_locationStatus = Encounter_locationStatus.Planned | Encounter_locationStatus.Active | Encounter_locationStatus.Reserved | Encounter_locationStatus.Completed;
export declare const Encounter_locationStatus: {
    Planned: Encounter_locationStatus.Planned;
    Active: Encounter_locationStatus.Active;
    Reserved: Encounter_locationStatus.Reserved;
    Completed: Encounter_locationStatus.Completed;
    _visit: <Result>(value: Encounter_locationStatus, visitor: Encounter_locationStatus._Visitor<Result>) => Result;
};
export declare namespace Encounter_locationStatus {
    type Planned = "planned" & {
        __Planned: void;
    };
    type Active = "active" & {
        __Active: void;
    };
    type Reserved = "reserved" & {
        __Reserved: void;
    };
    type Completed = "completed" & {
        __Completed: void;
    };
    interface _Visitor<Result> {
        planned: () => Result;
        active: () => Result;
        reserved: () => Result;
        completed: () => Result;
        _unknown: () => Result;
    }
}
