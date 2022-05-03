export declare type Episodeofcare_statushistoryStatus = Episodeofcare_statushistoryStatus.Planned | Episodeofcare_statushistoryStatus.Waitlist | Episodeofcare_statushistoryStatus.Active | Episodeofcare_statushistoryStatus.Onhold | Episodeofcare_statushistoryStatus.Finished | Episodeofcare_statushistoryStatus.Cancelled;
export declare const Episodeofcare_statushistoryStatus: {
    Planned: Episodeofcare_statushistoryStatus.Planned;
    Waitlist: Episodeofcare_statushistoryStatus.Waitlist;
    Active: Episodeofcare_statushistoryStatus.Active;
    Onhold: Episodeofcare_statushistoryStatus.Onhold;
    Finished: Episodeofcare_statushistoryStatus.Finished;
    Cancelled: Episodeofcare_statushistoryStatus.Cancelled;
    _visit: <Result>(value: Episodeofcare_statushistoryStatus, visitor: Episodeofcare_statushistoryStatus._Visitor<Result>) => Result;
};
export declare namespace Episodeofcare_statushistoryStatus {
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
