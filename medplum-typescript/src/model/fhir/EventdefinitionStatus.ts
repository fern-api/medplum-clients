export type EventdefinitionStatus =
    | EventdefinitionStatus.Draft
    | EventdefinitionStatus.Active
    | EventdefinitionStatus.Retired;

export const EventdefinitionStatus = {
    Draft: "draft" as EventdefinitionStatus.Draft,
    Active: "active" as EventdefinitionStatus.Active,
    Retired: "retired" as EventdefinitionStatus.Retired,

    _visit: <Result>(value: EventdefinitionStatus, visitor: EventdefinitionStatus._Visitor<Result>): Result => {
        switch (value) {
            case EventdefinitionStatus.Draft: return visitor.draft();
            case EventdefinitionStatus.Active: return visitor.active();
            case EventdefinitionStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace EventdefinitionStatus {
    export type Draft = "draft" & {
        __Draft: void,
    };
    export type Active = "active" & {
        __Active: void,
    };
    export type Retired = "retired" & {
        __Retired: void,
    };

    export interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
