export type PaymentreconciliationOutcome =
    | PaymentreconciliationOutcome.Queued
    | PaymentreconciliationOutcome.Complete
    | PaymentreconciliationOutcome.Error
    | PaymentreconciliationOutcome.Partial;

export const PaymentreconciliationOutcome = {
    Queued: "queued" as PaymentreconciliationOutcome.Queued,
    Complete: "complete" as PaymentreconciliationOutcome.Complete,
    Error: "error" as PaymentreconciliationOutcome.Error,
    Partial: "partial" as PaymentreconciliationOutcome.Partial,

    _visit: <Result>(value: PaymentreconciliationOutcome, visitor: PaymentreconciliationOutcome._Visitor<Result>): Result => {
        switch (value) {
            case PaymentreconciliationOutcome.Queued: return visitor.queued();
            case PaymentreconciliationOutcome.Complete: return visitor.complete();
            case PaymentreconciliationOutcome.Error: return visitor.error();
            case PaymentreconciliationOutcome.Partial: return visitor.partial();
            default: return visitor._unknown();
        }
    },
};

export declare namespace PaymentreconciliationOutcome {
    export type Queued = "queued" & {
        __Queued: void,
    };
    export type Complete = "complete" & {
        __Complete: void,
    };
    export type Error = "error" & {
        __Error: void,
    };
    export type Partial = "partial" & {
        __Partial: void,
    };

    export interface _Visitor<Result> {
        queued: () => Result;
        complete: () => Result;
        error: () => Result;
        partial: () => Result;
        _unknown: () => Result;
    }
}
