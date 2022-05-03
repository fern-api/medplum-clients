export type CoverageeligibilityresponseOutcome =
    | CoverageeligibilityresponseOutcome.Queued
    | CoverageeligibilityresponseOutcome.Complete
    | CoverageeligibilityresponseOutcome.Error
    | CoverageeligibilityresponseOutcome.Partial;

export const CoverageeligibilityresponseOutcome = {
    Queued: "queued" as CoverageeligibilityresponseOutcome.Queued,
    Complete: "complete" as CoverageeligibilityresponseOutcome.Complete,
    Error: "error" as CoverageeligibilityresponseOutcome.Error,
    Partial: "partial" as CoverageeligibilityresponseOutcome.Partial,

    _visit: <Result>(
        value: CoverageeligibilityresponseOutcome,
        visitor: CoverageeligibilityresponseOutcome._Visitor<Result>
    ): Result => {
        switch (value) {
            case CoverageeligibilityresponseOutcome.Queued:
                return visitor.queued();
            case CoverageeligibilityresponseOutcome.Complete:
                return visitor.complete();
            case CoverageeligibilityresponseOutcome.Error:
                return visitor.error();
            case CoverageeligibilityresponseOutcome.Partial:
                return visitor.partial();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace CoverageeligibilityresponseOutcome {
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
