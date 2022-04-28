export type Devicemetric_calibrationType =
    | Devicemetric_calibrationType.Unspecified
    | Devicemetric_calibrationType.Offset
    | Devicemetric_calibrationType.Gain;

export const Devicemetric_calibrationType = {
    Unspecified: "unspecified" as Devicemetric_calibrationType.Unspecified,
    Offset: "offset" as Devicemetric_calibrationType.Offset,
    Gain: "gain" as Devicemetric_calibrationType.Gain,

    _visit: <Result>(value: Devicemetric_calibrationType, visitor: Devicemetric_calibrationType._Visitor<Result>): Result => {
        switch (value) {
            case Devicemetric_calibrationType.Unspecified: return visitor.unspecified();
            case Devicemetric_calibrationType.Offset: return visitor.offset();
            case Devicemetric_calibrationType.Gain: return visitor.gain();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Devicemetric_calibrationType {
    export type Unspecified = "unspecified" & {
        __Unspecified: void,
    };
    export type Offset = "offset" & {
        __Offset: void,
    };
    export type Gain = "gain" & {
        __Gain: void,
    };

    export interface _Visitor<Result> {
        unspecified: () => Result;
        offset: () => Result;
        gain: () => Result;
        _unknown: () => Result;
    }
}
