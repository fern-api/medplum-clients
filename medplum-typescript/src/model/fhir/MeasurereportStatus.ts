export type MeasurereportStatus =
    | MeasurereportStatus.Complete
    | MeasurereportStatus.Pending
    | MeasurereportStatus.Error;

export const MeasurereportStatus = {
    Complete: "complete" as MeasurereportStatus.Complete,
    Pending: "pending" as MeasurereportStatus.Pending,
    Error: "error" as MeasurereportStatus.Error,

    _visit: <Result>(
        value: MeasurereportStatus,
        visitor: MeasurereportStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case MeasurereportStatus.Complete:
                return visitor.complete();
            case MeasurereportStatus.Pending:
                return visitor.pending();
            case MeasurereportStatus.Error:
                return visitor.error();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace MeasurereportStatus {
    export type Complete = "complete" & {
        __Complete: void;
    };
    export type Pending = "pending" & {
        __Pending: void;
    };
    export type Error = "error" & {
        __Error: void;
    };

    export interface _Visitor<Result> {
        complete: () => Result;
        pending: () => Result;
        error: () => Result;
        _unknown: () => Result;
    }
}
