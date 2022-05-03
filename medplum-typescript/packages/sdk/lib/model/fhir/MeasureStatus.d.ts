export declare type MeasureStatus = MeasureStatus.Draft | MeasureStatus.Active | MeasureStatus.Retired;
export declare const MeasureStatus: {
    Draft: MeasureStatus.Draft;
    Active: MeasureStatus.Active;
    Retired: MeasureStatus.Retired;
    _visit: <Result>(value: MeasureStatus, visitor: MeasureStatus._Visitor<Result>) => Result;
};
export declare namespace MeasureStatus {
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
