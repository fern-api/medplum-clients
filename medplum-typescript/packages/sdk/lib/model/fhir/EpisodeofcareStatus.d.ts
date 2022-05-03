export declare type EpisodeofcareStatus = EpisodeofcareStatus.Planned | EpisodeofcareStatus.Waitlist | EpisodeofcareStatus.Active | EpisodeofcareStatus.Onhold | EpisodeofcareStatus.Finished | EpisodeofcareStatus.Cancelled;
export declare const EpisodeofcareStatus: {
    Planned: EpisodeofcareStatus.Planned;
    Waitlist: EpisodeofcareStatus.Waitlist;
    Active: EpisodeofcareStatus.Active;
    Onhold: EpisodeofcareStatus.Onhold;
    Finished: EpisodeofcareStatus.Finished;
    Cancelled: EpisodeofcareStatus.Cancelled;
    _visit: <Result>(value: EpisodeofcareStatus, visitor: EpisodeofcareStatus._Visitor<Result>) => Result;
};
export declare namespace EpisodeofcareStatus {
    type Planned = "planned" & {
        __Planned: void;
    };
    type Waitlist = "waitlist" & {
        __Waitlist: void;
    };
    type Active = "active" & {
        __Active: void;
    };
    type Onhold = "onhold" & {
        __Onhold: void;
    };
    type Finished = "finished" & {
        __Finished: void;
    };
    type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    interface _Visitor<Result> {
        planned: () => Result;
        waitlist: () => Result;
        active: () => Result;
        onhold: () => Result;
        finished: () => Result;
        cancelled: () => Result;
        _unknown: () => Result;
    }
}
