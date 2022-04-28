export type BiologicallyderivedproductStatus =
    | BiologicallyderivedproductStatus.Available
    | BiologicallyderivedproductStatus.Unavailable;

export const BiologicallyderivedproductStatus = {
    Available: "available" as BiologicallyderivedproductStatus.Available,
    Unavailable: "unavailable" as BiologicallyderivedproductStatus.Unavailable,

    _visit: <Result>(value: BiologicallyderivedproductStatus, visitor: BiologicallyderivedproductStatus._Visitor<Result>): Result => {
        switch (value) {
            case BiologicallyderivedproductStatus.Available: return visitor.available();
            case BiologicallyderivedproductStatus.Unavailable: return visitor.unavailable();
            default: return visitor._unknown();
        }
    },
};

export declare namespace BiologicallyderivedproductStatus {
    export type Available = "available" & {
        __Available: void,
    };
    export type Unavailable = "unavailable" & {
        __Unavailable: void,
    };

    export interface _Visitor<Result> {
        available: () => Result;
        unavailable: () => Result;
        _unknown: () => Result;
    }
}
