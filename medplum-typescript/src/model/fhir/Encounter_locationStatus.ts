export type Encounter_locationStatus =
    | Encounter_locationStatus.Planned
    | Encounter_locationStatus.Active
    | Encounter_locationStatus.Reserved
    | Encounter_locationStatus.Completed;

export const Encounter_locationStatus = {
    Planned: "planned" as Encounter_locationStatus.Planned,
    Active: "active" as Encounter_locationStatus.Active,
    Reserved: "reserved" as Encounter_locationStatus.Reserved,
    Completed: "completed" as Encounter_locationStatus.Completed,

    _visit: <Result>(value: Encounter_locationStatus, visitor: Encounter_locationStatus._Visitor<Result>): Result => {
        switch (value) {
            case Encounter_locationStatus.Planned: return visitor.planned();
            case Encounter_locationStatus.Active: return visitor.active();
            case Encounter_locationStatus.Reserved: return visitor.reserved();
            case Encounter_locationStatus.Completed: return visitor.completed();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Encounter_locationStatus {
    export type Planned = "planned" & {
        __Planned: void,
    };
    export type Active = "active" & {
        __Active: void,
    };
    export type Reserved = "reserved" & {
        __Reserved: void,
    };
    export type Completed = "completed" & {
        __Completed: void,
    };

    export interface _Visitor<Result> {
        planned: () => Result;
        active: () => Result;
        reserved: () => Result;
        completed: () => Result;
        _unknown: () => Result;
    }
}
