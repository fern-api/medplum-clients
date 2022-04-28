export type ResearchstudyStatus =
    | ResearchstudyStatus.Active
    | ResearchstudyStatus.Approved
    | ResearchstudyStatus.Completed
    | ResearchstudyStatus.Disapproved
    | ResearchstudyStatus.Withdrawn;

export const ResearchstudyStatus = {
    Active: "active" as ResearchstudyStatus.Active,
    Approved: "approved" as ResearchstudyStatus.Approved,
    Completed: "completed" as ResearchstudyStatus.Completed,
    Disapproved: "disapproved" as ResearchstudyStatus.Disapproved,
    Withdrawn: "withdrawn" as ResearchstudyStatus.Withdrawn,

    _visit: <Result>(value: ResearchstudyStatus, visitor: ResearchstudyStatus._Visitor<Result>): Result => {
        switch (value) {
            case ResearchstudyStatus.Active: return visitor.active();
            case ResearchstudyStatus.Approved: return visitor.approved();
            case ResearchstudyStatus.Completed: return visitor.completed();
            case ResearchstudyStatus.Disapproved: return visitor.disapproved();
            case ResearchstudyStatus.Withdrawn: return visitor.withdrawn();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ResearchstudyStatus {
    export type Active = "active" & {
        __Active: void,
    };
    export type Approved = "approved" & {
        __Approved: void,
    };
    export type Completed = "completed" & {
        __Completed: void,
    };
    export type Disapproved = "disapproved" & {
        __Disapproved: void,
    };
    export type Withdrawn = "withdrawn" & {
        __Withdrawn: void,
    };

    export interface _Visitor<Result> {
        active: () => Result;
        approved: () => Result;
        completed: () => Result;
        disapproved: () => Result;
        withdrawn: () => Result;
        _unknown: () => Result;
    }
}
