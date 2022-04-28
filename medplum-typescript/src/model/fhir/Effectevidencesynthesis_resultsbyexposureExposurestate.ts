export type Effectevidencesynthesis_resultsbyexposureExposurestate =
    | Effectevidencesynthesis_resultsbyexposureExposurestate.Exposure;

export const Effectevidencesynthesis_resultsbyexposureExposurestate = {
    Exposure: "exposure" as Effectevidencesynthesis_resultsbyexposureExposurestate.Exposure,

    _visit: <Result>(value: Effectevidencesynthesis_resultsbyexposureExposurestate, visitor: Effectevidencesynthesis_resultsbyexposureExposurestate._Visitor<Result>): Result => {
        switch (value) {
            case Effectevidencesynthesis_resultsbyexposureExposurestate.Exposure: return visitor.exposure();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Effectevidencesynthesis_resultsbyexposureExposurestate {
    export type Exposure = "exposure" & {
        __Exposure: void,
    };

    export interface _Visitor<Result> {
        exposure: () => Result;
        _unknown: () => Result;
    }
}
