export declare type Devicemetric_calibrationType = Devicemetric_calibrationType.Unspecified | Devicemetric_calibrationType.Offset | Devicemetric_calibrationType.Gain;
export declare const Devicemetric_calibrationType: {
    Unspecified: Devicemetric_calibrationType.Unspecified;
    Offset: Devicemetric_calibrationType.Offset;
    Gain: Devicemetric_calibrationType.Gain;
    _visit: <Result>(value: Devicemetric_calibrationType, visitor: Devicemetric_calibrationType._Visitor<Result>) => Result;
};
export declare namespace Devicemetric_calibrationType {
    type Unspecified = "unspecified" & {
        __Unspecified: void;
    };
    type Offset = "offset" & {
        __Offset: void;
    };
    type Gain = "gain" & {
        __Gain: void;
    };
    interface _Visitor<Result> {
        unspecified: () => Result;
        offset: () => Result;
        gain: () => Result;
        _unknown: () => Result;
    }
}
