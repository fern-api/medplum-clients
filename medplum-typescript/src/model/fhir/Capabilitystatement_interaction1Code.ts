export type Capabilitystatement_interaction1Code =
    | Capabilitystatement_interaction1Code.Transaction
    | Capabilitystatement_interaction1Code.Batch;

export const Capabilitystatement_interaction1Code = {
    Transaction:
        "transaction" as Capabilitystatement_interaction1Code.Transaction,
    Batch: "batch" as Capabilitystatement_interaction1Code.Batch,

    _visit: <Result>(
        value: Capabilitystatement_interaction1Code,
        visitor: Capabilitystatement_interaction1Code._Visitor<Result>
    ): Result => {
        switch (value) {
            case Capabilitystatement_interaction1Code.Transaction:
                return visitor.transaction();
            case Capabilitystatement_interaction1Code.Batch:
                return visitor.batch();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Capabilitystatement_interaction1Code {
    export type Transaction = "transaction" & {
        __Transaction: void;
    };
    export type Batch = "batch" & {
        __Batch: void;
    };

    export interface _Visitor<Result> {
        transaction: () => Result;
        batch: () => Result;
        _unknown: () => Result;
    }
}
