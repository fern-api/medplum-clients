export declare type Devicemetric_calibrationState = Devicemetric_calibrationState.Calibrated | Devicemetric_calibrationState.Unspecified;
export declare const Devicemetric_calibrationState: {
    Calibrated: Devicemetric_calibrationState.Calibrated;
    Unspecified: Devicemetric_calibrationState.Unspecified;
    _visit: <Result>(value: Devicemetric_calibrationState, visitor: Devicemetric_calibrationState._Visitor<Result>) => Result;
};
export declare namespace Devicemetric_calibrationState {
    type Calibrated = "calibrated" & {
        __Calibrated: void;
    };
    type Unspecified = "unspecified" & {
        __Unspecified: void;
    };
    interface _Visitor<Result> {
        calibrated: () => Result;
        unspecified: () => Result;
        _unknown: () => Result;
    }
}
