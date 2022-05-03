export declare type CoverageeligibilityresponseOutcome = CoverageeligibilityresponseOutcome.Queued | CoverageeligibilityresponseOutcome.Complete | CoverageeligibilityresponseOutcome.Error | CoverageeligibilityresponseOutcome.Partial;
export declare const CoverageeligibilityresponseOutcome: {
    Queued: CoverageeligibilityresponseOutcome.Queued;
    Complete: CoverageeligibilityresponseOutcome.Complete;
    Error: CoverageeligibilityresponseOutcome.Error;
    Partial: CoverageeligibilityresponseOutcome.Partial;
    _visit: <Result>(value: CoverageeligibilityresponseOutcome, visitor: CoverageeligibilityresponseOutcome._Visitor<Result>) => Result;
};
export declare namespace CoverageeligibilityresponseOutcome {
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
