export declare type BiologicallyderivedproductStatus = BiologicallyderivedproductStatus.Available | BiologicallyderivedproductStatus.Unavailable;
export declare const BiologicallyderivedproductStatus: {
    Available: BiologicallyderivedproductStatus.Available;
    Unavailable: BiologicallyderivedproductStatus.Unavailable;
    _visit: <Result>(value: BiologicallyderivedproductStatus, visitor: BiologicallyderivedproductStatus._Visitor<Result>) => Result;
};
export declare namespace BiologicallyderivedproductStatus {
    type Available = "available" & {
        __Available: void;
    };
    type Unavailable = "unavailable" & {
        __Unavailable: void;
    };
    interface _Visitor<Result> {
        available: () => Result;
        unavailable: () => Result;
        _unknown: () => Result;
    }
}
