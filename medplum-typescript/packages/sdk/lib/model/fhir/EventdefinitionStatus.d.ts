export declare type EventdefinitionStatus = EventdefinitionStatus.Draft | EventdefinitionStatus.Active | EventdefinitionStatus.Retired;
export declare const EventdefinitionStatus: {
    Draft: EventdefinitionStatus.Draft;
    Active: EventdefinitionStatus.Active;
    Retired: EventdefinitionStatus.Retired;
    _visit: <Result>(value: EventdefinitionStatus, visitor: EventdefinitionStatus._Visitor<Result>) => Result;
};
export declare namespace EventdefinitionStatus {
    type Draft = "draft" & {
        __Draft: void;
    };
    type Active = "active" & {
        __Active: void;
    };
    type Retired = "retired" & {
        __Retired: void;
    };
    interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
