export type StructuredefinitionKind =
    | StructuredefinitionKind.Resource
    | StructuredefinitionKind.Logical;

export const StructuredefinitionKind = {
    Resource: "resource" as StructuredefinitionKind.Resource,
    Logical: "logical" as StructuredefinitionKind.Logical,

    _visit: <Result>(value: StructuredefinitionKind, visitor: StructuredefinitionKind._Visitor<Result>): Result => {
        switch (value) {
            case StructuredefinitionKind.Resource: return visitor.resource();
            case StructuredefinitionKind.Logical: return visitor.logical();
            default: return visitor._unknown();
        }
    },
};

export declare namespace StructuredefinitionKind {
    export type Resource = "resource" & {
        __Resource: void,
    };
    export type Logical = "logical" & {
        __Logical: void,
    };

    export interface _Visitor<Result> {
        resource: () => Result;
        logical: () => Result;
        _unknown: () => Result;
    }
}
