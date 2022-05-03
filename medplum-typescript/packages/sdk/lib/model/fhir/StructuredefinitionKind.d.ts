export declare type StructuredefinitionKind = StructuredefinitionKind.Resource | StructuredefinitionKind.Logical;
export declare const StructuredefinitionKind: {
    Resource: StructuredefinitionKind.Resource;
    Logical: StructuredefinitionKind.Logical;
    _visit: <Result>(value: StructuredefinitionKind, visitor: StructuredefinitionKind._Visitor<Result>) => Result;
};
export declare namespace StructuredefinitionKind {
    type Resource = "resource" & {
        __Resource: void;
    };
    type Logical = "logical" & {
        __Logical: void;
    };
    interface _Visitor<Result> {
        resource: () => Result;
        logical: () => Result;
        _unknown: () => Result;
    }
}
