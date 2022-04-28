export type EpisodeofcareStatus =
    | EpisodeofcareStatus.Planned
    | EpisodeofcareStatus.Waitlist
    | EpisodeofcareStatus.Active
    | EpisodeofcareStatus.Onhold
    | EpisodeofcareStatus.Finished
    | EpisodeofcareStatus.Cancelled;

export const EpisodeofcareStatus = {
    Planned: "planned" as EpisodeofcareStatus.Planned,
    Waitlist: "waitlist" as EpisodeofcareStatus.Waitlist,
    Active: "active" as EpisodeofcareStatus.Active,
    Onhold: "onhold" as EpisodeofcareStatus.Onhold,
    Finished: "finished" as EpisodeofcareStatus.Finished,
    Cancelled: "cancelled" as EpisodeofcareStatus.Cancelled,

    _visit: <Result>(value: EpisodeofcareStatus, visitor: EpisodeofcareStatus._Visitor<Result>): Result => {
        switch (value) {
            case EpisodeofcareStatus.Planned: return visitor.planned();
            case EpisodeofcareStatus.Waitlist: return visitor.waitlist();
            case EpisodeofcareStatus.Active: return visitor.active();
            case EpisodeofcareStatus.Onhold: return visitor.onhold();
            case EpisodeofcareStatus.Finished: return visitor.finished();
            case EpisodeofcareStatus.Cancelled: return visitor.cancelled();
            default: return visitor._unknown();
        }
    },
};

export declare namespace EpisodeofcareStatus {
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
