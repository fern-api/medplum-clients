export declare type OperationdefinitionKind = OperationdefinitionKind.Operation | OperationdefinitionKind.Query;
export declare const OperationdefinitionKind: {
    Operation: OperationdefinitionKind.Operation;
    Query: OperationdefinitionKind.Query;
    _visit: <Result>(value: OperationdefinitionKind, visitor: OperationdefinitionKind._Visitor<Result>) => Result;
};
export declare namespace OperationdefinitionKind {
    type Operation = "operation" & {
        __Operation: void;
    };
    type Query = "query" & {
        __Query: void;
    };
    interface _Visitor<Result> {
        operation: () => Result;
        query: () => Result;
        _unknown: () => Result;
    }
}
