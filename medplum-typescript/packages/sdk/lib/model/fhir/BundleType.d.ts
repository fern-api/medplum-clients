export declare type BundleType = BundleType.Document | BundleType.Message | BundleType.Transaction | BundleType.Batch | BundleType.History | BundleType.Searchset | BundleType.Collection;
export declare const BundleType: {
    Document: BundleType.Document;
    Message: BundleType.Message;
    Transaction: BundleType.Transaction;
    Batch: BundleType.Batch;
    History: BundleType.History;
    Searchset: BundleType.Searchset;
    Collection: BundleType.Collection;
    _visit: <Result>(value: BundleType, visitor: BundleType._Visitor<Result>) => Result;
};
export declare namespace BundleType {
    type Document = "document" & {
        __Document: void;
    };
    type Message = "message" & {
        __Message: void;
    };
    type Transaction = "transaction" & {
        __Transaction: void;
    };
    type Batch = "batch" & {
        __Batch: void;
    };
    type History = "history" & {
        __History: void;
    };
    type Searchset = "searchset" & {
        __Searchset: void;
    };
    type Collection = "collection" & {
        __Collection: void;
    };
    interface _Visitor<Result> {
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
