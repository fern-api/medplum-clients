export type Devicemetric_calibrationState =
    | Devicemetric_calibrationState.Calibrated
    | Devicemetric_calibrationState.Unspecified;

export const Devicemetric_calibrationState = {
    Calibrated: "calibrated" as Devicemetric_calibrationState.Calibrated,
    Unspecified: "unspecified" as Devicemetric_calibrationState.Unspecified,

    _visit: <Result>(value: Devicemetric_calibrationState, visitor: Devicemetric_calibrationState._Visitor<Result>): Result => {
        switch (value) {
            case Devicemetric_calibrationState.Calibrated: return visitor.calibrated();
            case Devicemetric_calibrationState.Unspecified: return visitor.unspecified();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Devicemetric_calibrationState {
    export type Calibrated = "calibrated" & {
        __Calibrated: void,
    };
    export type Unspecified = "unspecified" & {
        __Unspecified: void,
    };

    export interface _Visitor<Result> {
        calibrated: () => Result;
        unspecified: () => Result;
        _unknown: () => Result;
    }
}
