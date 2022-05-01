export type EnrollmentresponseOutcome =
    | EnrollmentresponseOutcome.Queued
    | EnrollmentresponseOutcome.Complete
    | EnrollmentresponseOutcome.Error
    | EnrollmentresponseOutcome.Partial;

export const EnrollmentresponseOutcome = {
    Queued: "queued" as EnrollmentresponseOutcome.Queued,
    Complete: "complete" as EnrollmentresponseOutcome.Complete,
    Error: "error" as EnrollmentresponseOutcome.Error,
    Partial: "partial" as EnrollmentresponseOutcome.Partial,

    _visit: <Result>(
        value: EnrollmentresponseOutcome,
        visitor: EnrollmentresponseOutcome._Visitor<Result>
    ): Result => {
        switch (value) {
            case EnrollmentresponseOutcome.Queued:
                return visitor.queued();
            case EnrollmentresponseOutcome.Complete:
                return visitor.complete();
            case EnrollmentresponseOutcome.Error:
                return visitor.error();
            case EnrollmentresponseOutcome.Partial:
                return visitor.partial();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace EnrollmentresponseOutcome {
    export type Queued = "queued" & {
        __Queued: void;
    };
    export type Complete = "complete" & {
        __Complete: void;
    };
    export type Error = "error" & {
        __Error: void;
    };
    export type Partial = "partial" & {
        __Partial: void;
    };

    export interface _Visitor<Result> {
        queued: () => Result;
        complete: () => Result;
        error: () => Result;
        partial: () => Result;
        _unknown: () => Result;
    }
}
