export type Episodeofcare_statushistoryStatus =
    | Episodeofcare_statushistoryStatus.Planned
    | Episodeofcare_statushistoryStatus.Waitlist
    | Episodeofcare_statushistoryStatus.Active
    | Episodeofcare_statushistoryStatus.Onhold
    | Episodeofcare_statushistoryStatus.Finished
    | Episodeofcare_statushistoryStatus.Cancelled;

export const Episodeofcare_statushistoryStatus = {
    Planned: "planned" as Episodeofcare_statushistoryStatus.Planned,
    Waitlist: "waitlist" as Episodeofcare_statushistoryStatus.Waitlist,
    Active: "active" as Episodeofcare_statushistoryStatus.Active,
    Onhold: "onhold" as Episodeofcare_statushistoryStatus.Onhold,
    Finished: "finished" as Episodeofcare_statushistoryStatus.Finished,
    Cancelled: "cancelled" as Episodeofcare_statushistoryStatus.Cancelled,

    _visit: <Result>(value: Episodeofcare_statushistoryStatus, visitor: Episodeofcare_statushistoryStatus._Visitor<Result>): Result => {
        switch (value) {
            case Episodeofcare_statushistoryStatus.Planned: return visitor.planned();
            case Episodeofcare_statushistoryStatus.Waitlist: return visitor.waitlist();
            case Episodeofcare_statushistoryStatus.Active: return visitor.active();
            case Episodeofcare_statushistoryStatus.Onhold: return visitor.onhold();
            case Episodeofcare_statushistoryStatus.Finished: return visitor.finished();
            case Episodeofcare_statushistoryStatus.Cancelled: return visitor.cancelled();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Episodeofcare_statushistoryStatus {
    export type Planned = "planned" & {
        __Planned: void,
    };
    export type Waitlist = "waitlist" & {
        __Waitlist: void,
    };
    export type Active = "active" & {
        __Active: void,
    };
    export type Onhold = "onhold" & {
        __Onhold: void,
    };
    export type Finished = "finished" & {
        __Finished: void,
    };
    export type Cancelled = "cancelled" & {
        __Cancelled: void,
    };

    export interface _Visitor<Result> {
        planned: () => Result;
        waitlist: () => Result;
        active: () => Result;
        onhold: () => Result;
        finished: () => Result;
        cancelled: () => Result;
        _unknown: () => Result;
    }
}
