export declare type ActivitydefinitionStatus = ActivitydefinitionStatus.Draft | ActivitydefinitionStatus.Active | ActivitydefinitionStatus.Retired;
export declare const ActivitydefinitionStatus: {
    Draft: ActivitydefinitionStatus.Draft;
    Active: ActivitydefinitionStatus.Active;
    Retired: ActivitydefinitionStatus.Retired;
    _visit: <Result>(value: ActivitydefinitionStatus, visitor: ActivitydefinitionStatus._Visitor<Result>) => Result;
};
export declare namespace ActivitydefinitionStatus {
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
