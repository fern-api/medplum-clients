export declare type EncounterStatus = EncounterStatus.Planned | EncounterStatus.Arrived | EncounterStatus.Triaged | EncounterStatus.Onleave | EncounterStatus.Finished | EncounterStatus.Cancelled;
export declare const EncounterStatus: {
    Planned: EncounterStatus.Planned;
    Arrived: EncounterStatus.Arrived;
    Triaged: EncounterStatus.Triaged;
    Onleave: EncounterStatus.Onleave;
    Finished: EncounterStatus.Finished;
    Cancelled: EncounterStatus.Cancelled;
    _visit: <Result>(value: EncounterStatus, visitor: EncounterStatus._Visitor<Result>) => Result;
};
export declare namespace EncounterStatus {
    type Planned = "planned" & {
        __Planned: void;
    };
    type Arrived = "arrived" & {
        __Arrived: void;
    };
    type Triaged = "triaged" & {
        __Triaged: void;
    };
    type Onleave = "onleave" & {
        __Onleave: void;
    };
    type Finished = "finished" & {
        __Finished: void;
    };
    type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    interface _Visitor<Result> {
        planned: () => Result;
        arrived: () => Result;
        triaged: () => Result;
        onleave: () => Result;
        finished: () => Result;
        cancelled: () => Result;
        _unknown: () => Result;
    }
}
