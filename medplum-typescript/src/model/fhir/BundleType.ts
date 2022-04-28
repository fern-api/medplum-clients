export type BundleType =
    | BundleType.Document
    | BundleType.Message
    | BundleType.Transaction
    | BundleType.Batch
    | BundleType.History
    | BundleType.Searchset
    | BundleType.Collection;

export const BundleType = {
    Document: "document" as BundleType.Document,
    Message: "message" as BundleType.Message,
    Transaction: "transaction" as BundleType.Transaction,
    Batch: "batch" as BundleType.Batch,
    History: "history" as BundleType.History,
    Searchset: "searchset" as BundleType.Searchset,
    Collection: "collection" as BundleType.Collection,

    _visit: <Result>(value: BundleType, visitor: BundleType._Visitor<Result>): Result => {
        switch (value) {
            case BundleType.Document: return visitor.document();
            case BundleType.Message: return visitor.message();
            case BundleType.Transaction: return visitor.transaction();
            case BundleType.Batch: return visitor.batch();
            case BundleType.History: return visitor.history();
            case BundleType.Searchset: return visitor.searchset();
            case BundleType.Collection: return visitor.collection();
            default: return visitor._unknown();
        }
    },
};

export declare namespace BundleType {
    export type Document = "document" & {
        __Document: void,
    };
    export type Message = "message" & {
        __Message: void,
    };
    export type Transaction = "transaction" & {
        __Transaction: void,
    };
    export type Batch = "batch" & {
        __Batch: void,
    };
    export type History = "history" & {
        __History: void,
    };
    export type Searchset = "searchset" & {
        __Searchset: void,
    };
    export type Collection = "collection" & {
        __Collection: void,
    };

    export interface _Visitor<Result> {
        document: () => Result;
        message: () => Result;
        transaction: () => Result;
        batch: () => Result;
        history: () => Result;
        searchset: () => Result;
        collection: () => Result;
        _unknown: () => Result;
    }
}
