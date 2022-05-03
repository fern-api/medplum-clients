export declare type EnrollmentresponseOutcome = EnrollmentresponseOutcome.Queued | EnrollmentresponseOutcome.Complete | EnrollmentresponseOutcome.Error | EnrollmentresponseOutcome.Partial;
export declare const EnrollmentresponseOutcome: {
    Queued: EnrollmentresponseOutcome.Queued;
    Complete: EnrollmentresponseOutcome.Complete;
    Error: EnrollmentresponseOutcome.Error;
    Partial: EnrollmentresponseOutcome.Partial;
    _visit: <Result>(value: EnrollmentresponseOutcome, visitor: EnrollmentresponseOutcome._Visitor<Result>) => Result;
};
export declare namespace EnrollmentresponseOutcome {
    type Queued = "queued" & {
        __Queued: void;
    };
    type Complete = "complete" & {
        __Complete: void;
    };
    type Error = "error" & {
        __Error: void;
    };
    type Partial = "partial" & {
        __Partial: void;
    };
    interface _Visitor<Result> {
        queued: () => Result;
        complete: () => Result;
        error: () => Result;
        partial: () => Result;
        _unknown: () => Result;
    }
}
