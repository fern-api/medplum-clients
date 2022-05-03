export declare type ResearchstudyStatus = ResearchstudyStatus.Active | ResearchstudyStatus.Approved | ResearchstudyStatus.Completed | ResearchstudyStatus.Disapproved | ResearchstudyStatus.Withdrawn;
export declare const ResearchstudyStatus: {
    Active: ResearchstudyStatus.Active;
    Approved: ResearchstudyStatus.Approved;
    Completed: ResearchstudyStatus.Completed;
    Disapproved: ResearchstudyStatus.Disapproved;
    Withdrawn: ResearchstudyStatus.Withdrawn;
    _visit: <Result>(value: ResearchstudyStatus, visitor: ResearchstudyStatus._Visitor<Result>) => Result;
};
export declare namespace ResearchstudyStatus {
    type Active = "active" & {
        __Active: void;
    };
    type Approved = "approved" & {
        __Approved: void;
    };
    type Completed = "completed" & {
        __Completed: void;
    };
    type Disapproved = "disapproved" & {
        __Disapproved: void;
    };
    type Withdrawn = "withdrawn" & {
        __Withdrawn: void;
    };
    interface _Visitor<Result> {
        active: () => Result;
        approved: () => Result;
        completed: () => Result;
        disapproved: () => Result;
        withdrawn: () => Result;
        _unknown: () => Result;
    }
}
