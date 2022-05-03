export declare type Effectevidencesynthesis_resultsbyexposureExposurestate = Effectevidencesynthesis_resultsbyexposureExposurestate.Exposure;
export declare const Effectevidencesynthesis_resultsbyexposureExposurestate: {
    Exposure: Effectevidencesynthesis_resultsbyexposureExposurestate.Exposure;
    _visit: <Result>(value: Effectevidencesynthesis_resultsbyexposureExposurestate, visitor: Effectevidencesynthesis_resultsbyexposureExposurestate._Visitor<Result>) => Result;
};
export declare namespace Effectevidencesynthesis_resultsbyexposureExposurestate {
    type Exposure = "exposure" & {
        __Exposure: void;
    };
    interface _Visitor<Result> {
        exposure: () => Result;
        _unknown: () => Result;
    }
}
