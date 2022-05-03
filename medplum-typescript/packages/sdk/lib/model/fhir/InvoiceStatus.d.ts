export declare type InvoiceStatus = InvoiceStatus.Draft | InvoiceStatus.Issued | InvoiceStatus.Balanced | InvoiceStatus.Cancelled;
export declare const InvoiceStatus: {
    Draft: InvoiceStatus.Draft;
    Issued: InvoiceStatus.Issued;
    Balanced: InvoiceStatus.Balanced;
    Cancelled: InvoiceStatus.Cancelled;
    _visit: <Result>(value: InvoiceStatus, visitor: InvoiceStatus._Visitor<Result>) => Result;
};
export declare namespace InvoiceStatus {
    type Draft = "draft" & {
        __Draft: void;
    };
    type Issued = "issued" & {
        __Issued: void;
    };
    type Balanced = "balanced" & {
        __Balanced: void;
    };
    type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    interface _Visitor<Result> {
        draft: () => Result;
        issued: () => Result;
        balanced: () => Result;
        cancelled: () => Result;
        _unknown: () => Result;
    }
}
