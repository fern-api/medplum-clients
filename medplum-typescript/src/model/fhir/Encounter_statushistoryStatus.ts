export type Encounter_statushistoryStatus =
    | Encounter_statushistoryStatus.Planned
    | Encounter_statushistoryStatus.Arrived
    | Encounter_statushistoryStatus.Triaged
    | Encounter_statushistoryStatus.Onleave
    | Encounter_statushistoryStatus.Finished
    | Encounter_statushistoryStatus.Cancelled;

export const Encounter_statushistoryStatus = {
    Planned: "planned" as Encounter_statushistoryStatus.Planned,
    Arrived: "arrived" as Encounter_statushistoryStatus.Arrived,
    Triaged: "triaged" as Encounter_statushistoryStatus.Triaged,
    Onleave: "onleave" as Encounter_statushistoryStatus.Onleave,
    Finished: "finished" as Encounter_statushistoryStatus.Finished,
    Cancelled: "cancelled" as Encounter_statushistoryStatus.Cancelled,

    _visit: <Result>(
        value: Encounter_statushistoryStatus,
        visitor: Encounter_statushistoryStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case Encounter_statushistoryStatus.Planned:
                return visitor.planned();
            case Encounter_statushistoryStatus.Arrived:
                return visitor.arrived();
            case Encounter_statushistoryStatus.Triaged:
                return visitor.triaged();
            case Encounter_statushistoryStatus.Onleave:
                return visitor.onleave();
            case Encounter_statushistoryStatus.Finished:
                return visitor.finished();
            case Encounter_statushistoryStatus.Cancelled:
                return visitor.cancelled();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Encounter_statushistoryStatus {
    export type Planned = "planned" & {
        __Planned: void;
    };
    export type Arrived = "arrived" & {
        __Arrived: void;
    };
    export type Triaged = "triaged" & {
        __Triaged: void;
    };
    export type Onleave = "onleave" & {
        __Onleave: void;
    };
    export type Finished = "finished" & {
        __Finished: void;
    };
    export type Cancelled = "cancelled" & {
        __Cancelled: void;
    };

    export interface _Visitor<Result> {
        planned: () => Result;
        arrived: () => Result;
        triaged: () => Result;
        onleave: () => Result;
        finished: () => Result;
        cancelled: () => Result;
        _unknown: () => Result;
    }
}
