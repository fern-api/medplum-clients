export type EncounterStatus =
    | EncounterStatus.Planned
    | EncounterStatus.Arrived
    | EncounterStatus.Triaged
    | EncounterStatus.Onleave
    | EncounterStatus.Finished
    | EncounterStatus.Cancelled;

export const EncounterStatus = {
    Planned: "planned" as EncounterStatus.Planned,
    Arrived: "arrived" as EncounterStatus.Arrived,
    Triaged: "triaged" as EncounterStatus.Triaged,
    Onleave: "onleave" as EncounterStatus.Onleave,
    Finished: "finished" as EncounterStatus.Finished,
    Cancelled: "cancelled" as EncounterStatus.Cancelled,

    _visit: <Result>(
        value: EncounterStatus,
        visitor: EncounterStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case EncounterStatus.Planned:
                return visitor.planned();
            case EncounterStatus.Arrived:
                return visitor.arrived();
            case EncounterStatus.Triaged:
                return visitor.triaged();
            case EncounterStatus.Onleave:
                return visitor.onleave();
            case EncounterStatus.Finished:
                return visitor.finished();
            case EncounterStatus.Cancelled:
                return visitor.cancelled();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace EncounterStatus {
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
