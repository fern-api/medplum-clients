export declare type StructuredefinitionStatus = StructuredefinitionStatus.Draft | StructuredefinitionStatus.Active | StructuredefinitionStatus.Retired;
export declare const StructuredefinitionStatus: {
    Draft: StructuredefinitionStatus.Draft;
    Active: StructuredefinitionStatus.Active;
    Retired: StructuredefinitionStatus.Retired;
    _visit: <Result>(value: StructuredefinitionStatus, visitor: StructuredefinitionStatus._Visitor<Result>) => Result;
};
export declare namespace StructuredefinitionStatus {
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
