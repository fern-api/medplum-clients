export type OperationdefinitionKind =
    | OperationdefinitionKind.Operation
    | OperationdefinitionKind.Query;

export const OperationdefinitionKind = {
    Operation: "operation" as OperationdefinitionKind.Operation,
    Query: "query" as OperationdefinitionKind.Query,

    _visit: <Result>(
        value: OperationdefinitionKind,
        visitor: OperationdefinitionKind._Visitor<Result>
    ): Result => {
        switch (value) {
            case OperationdefinitionKind.Operation:
                return visitor.operation();
            case OperationdefinitionKind.Query:
                return visitor.query();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace OperationdefinitionKind {
    export type Operation = "operation" & {
        __Operation: void;
    };
    export type Query = "query" & {
        __Query: void;
    };

    export interface _Visitor<Result> {
        operation: () => Result;
        query: () => Result;
        _unknown: () => Result;
    }
}
