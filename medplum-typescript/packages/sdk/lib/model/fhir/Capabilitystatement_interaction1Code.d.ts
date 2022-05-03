export declare type Capabilitystatement_interaction1Code = Capabilitystatement_interaction1Code.Transaction | Capabilitystatement_interaction1Code.Batch;
export declare const Capabilitystatement_interaction1Code: {
    Transaction: Capabilitystatement_interaction1Code.Transaction;
    Batch: Capabilitystatement_interaction1Code.Batch;
    _visit: <Result>(value: Capabilitystatement_interaction1Code, visitor: Capabilitystatement_interaction1Code._Visitor<Result>) => Result;
};
export declare namespace Capabilitystatement_interaction1Code {
    type Transaction = "transaction" & {
        __Transaction: void;
    };
    type Batch = "batch" & {
        __Batch: void;
    };
    interface _Visitor<Result> {
        transaction: () => Result;
        batch: () => Result;
        _unknown: () => Result;
    }
}
