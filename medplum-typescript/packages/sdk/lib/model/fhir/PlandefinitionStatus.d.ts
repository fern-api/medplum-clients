export declare type PlandefinitionStatus = PlandefinitionStatus.Draft | PlandefinitionStatus.Active | PlandefinitionStatus.Retired;
export declare const PlandefinitionStatus: {
    Draft: PlandefinitionStatus.Draft;
    Active: PlandefinitionStatus.Active;
    Retired: PlandefinitionStatus.Retired;
    _visit: <Result>(value: PlandefinitionStatus, visitor: PlandefinitionStatus._Visitor<Result>) => Result;
};
export declare namespace PlandefinitionStatus {
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
