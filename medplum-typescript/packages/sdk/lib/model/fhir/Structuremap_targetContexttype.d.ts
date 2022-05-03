export declare type Structuremap_targetContexttype = Structuremap_targetContexttype.Type | Structuremap_targetContexttype.Variable;
export declare const Structuremap_targetContexttype: {
    Type: Structuremap_targetContexttype.Type;
    Variable: Structuremap_targetContexttype.Variable;
    _visit: <Result>(value: Structuremap_targetContexttype, visitor: Structuremap_targetContexttype._Visitor<Result>) => Result;
};
export declare namespace Structuremap_targetContexttype {
    type Type = "type" & {
        __Type: void;
    };
    type Variable = "variable" & {
        __Variable: void;
    };
    interface _Visitor<Result> {
        type: () => Result;
        variable: () => Result;
        _unknown: () => Result;
    }
}
