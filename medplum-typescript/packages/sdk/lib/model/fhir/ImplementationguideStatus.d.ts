export declare type ImplementationguideStatus = ImplementationguideStatus.Draft | ImplementationguideStatus.Active | ImplementationguideStatus.Retired;
export declare const ImplementationguideStatus: {
    Draft: ImplementationguideStatus.Draft;
    Active: ImplementationguideStatus.Active;
    Retired: ImplementationguideStatus.Retired;
    _visit: <Result>(value: ImplementationguideStatus, visitor: ImplementationguideStatus._Visitor<Result>) => Result;
};
export declare namespace ImplementationguideStatus {
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
