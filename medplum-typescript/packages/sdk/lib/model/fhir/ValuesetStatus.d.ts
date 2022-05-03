export declare type ValuesetStatus = ValuesetStatus.Draft | ValuesetStatus.Active | ValuesetStatus.Retired;
export declare const ValuesetStatus: {
    Draft: ValuesetStatus.Draft;
    Active: ValuesetStatus.Active;
    Retired: ValuesetStatus.Retired;
    _visit: <Result>(value: ValuesetStatus, visitor: ValuesetStatus._Visitor<Result>) => Result;
};
export declare namespace ValuesetStatus {
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
