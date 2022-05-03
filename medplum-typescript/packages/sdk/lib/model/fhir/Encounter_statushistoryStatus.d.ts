export declare type Encounter_statushistoryStatus = Encounter_statushistoryStatus.Planned | Encounter_statushistoryStatus.Arrived | Encounter_statushistoryStatus.Triaged | Encounter_statushistoryStatus.Onleave | Encounter_statushistoryStatus.Finished | Encounter_statushistoryStatus.Cancelled;
export declare const Encounter_statushistoryStatus: {
    Planned: Encounter_statushistoryStatus.Planned;
    Arrived: Encounter_statushistoryStatus.Arrived;
    Triaged: Encounter_statushistoryStatus.Triaged;
    Onleave: Encounter_statushistoryStatus.Onleave;
    Finished: Encounter_statushistoryStatus.Finished;
    Cancelled: Encounter_statushistoryStatus.Cancelled;
    _visit: <Result>(value: Encounter_statushistoryStatus, visitor: Encounter_statushistoryStatus._Visitor<Result>) => Result;
};
export declare namespace Encounter_statushistoryStatus {
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
