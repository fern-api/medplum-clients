export type InvoiceStatus =
    | InvoiceStatus.Draft
    | InvoiceStatus.Issued
    | InvoiceStatus.Balanced
    | InvoiceStatus.Cancelled;

export const InvoiceStatus = {
    Draft: "draft" as InvoiceStatus.Draft,
    Issued: "issued" as InvoiceStatus.Issued,
    Balanced: "balanced" as InvoiceStatus.Balanced,
    Cancelled: "cancelled" as InvoiceStatus.Cancelled,

    _visit: <Result>(value: InvoiceStatus, visitor: InvoiceStatus._Visitor<Result>): Result => {
        switch (value) {
            case InvoiceStatus.Draft: return visitor.draft();
            case InvoiceStatus.Issued: return visitor.issued();
            case InvoiceStatus.Balanced: return visitor.balanced();
            case InvoiceStatus.Cancelled: return visitor.cancelled();
            default: return visitor._unknown();
        }
    },
};

export declare namespace InvoiceStatus {
    export type Draft = "draft" & {
        __Draft: void,
    };
    export type Issued = "issued" & {
        __Issued: void,
    };
    export type Balanced = "balanced" & {
        __Balanced: void,
    };
    export type Cancelled = "cancelled" & {
        __Cancelled: void,
    };

    export interface _Visitor<Result> {
        draft: () => Result;
        issued: () => Result;
        balanced: () => Result;
        cancelled: () => Result;
        _unknown: () => Result;
    }
}
