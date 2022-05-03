export declare type PaymentreconciliationOutcome = PaymentreconciliationOutcome.Queued | PaymentreconciliationOutcome.Complete | PaymentreconciliationOutcome.Error | PaymentreconciliationOutcome.Partial;
export declare const PaymentreconciliationOutcome: {
    Queued: PaymentreconciliationOutcome.Queued;
    Complete: PaymentreconciliationOutcome.Complete;
    Error: PaymentreconciliationOutcome.Error;
    Partial: PaymentreconciliationOutcome.Partial;
    _visit: <Result>(value: PaymentreconciliationOutcome, visitor: PaymentreconciliationOutcome._Visitor<Result>) => Result;
};
export declare namespace PaymentreconciliationOutcome {
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
