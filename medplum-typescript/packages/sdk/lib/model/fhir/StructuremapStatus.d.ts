export declare type StructuremapStatus = StructuremapStatus.Draft | StructuremapStatus.Active | StructuremapStatus.Retired;
export declare const StructuremapStatus: {
    Draft: StructuremapStatus.Draft;
    Active: StructuremapStatus.Active;
    Retired: StructuremapStatus.Retired;
    _visit: <Result>(value: StructuremapStatus, visitor: StructuremapStatus._Visitor<Result>) => Result;
};
export declare namespace StructuremapStatus {
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
