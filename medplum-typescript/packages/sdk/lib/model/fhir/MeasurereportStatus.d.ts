export declare type MeasurereportStatus = MeasurereportStatus.Complete | MeasurereportStatus.Pending | MeasurereportStatus.Error;
export declare const MeasurereportStatus: {
    Complete: MeasurereportStatus.Complete;
    Pending: MeasurereportStatus.Pending;
    Error: MeasurereportStatus.Error;
    _visit: <Result>(value: MeasurereportStatus, visitor: MeasurereportStatus._Visitor<Result>) => Result;
};
export declare namespace MeasurereportStatus {
    type Complete = "complete" & {
        __Complete: void;
    };
    type Pending = "pending" & {
        __Pending: void;
    };
    type Error = "error" & {
        __Error: void;
    };
    interface _Visitor<Result> {
        complete: () => Result;
        pending: () => Result;
        error: () => Result;
        _unknown: () => Result;
    }
}
