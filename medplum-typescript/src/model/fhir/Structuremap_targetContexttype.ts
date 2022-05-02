export type Structuremap_targetContexttype =
    | Structuremap_targetContexttype.Type
    | Structuremap_targetContexttype.Variable;

export const Structuremap_targetContexttype = {
    Type: "type" as Structuremap_targetContexttype.Type,
    Variable: "variable" as Structuremap_targetContexttype.Variable,

    _visit: <Result>(
        value: Structuremap_targetContexttype,
        visitor: Structuremap_targetContexttype._Visitor<Result>
    ): Result => {
        switch (value) {
            case Structuremap_targetContexttype.Type:
                return visitor.type();
            case Structuremap_targetContexttype.Variable:
                return visitor.variable();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Structuremap_targetContexttype {
    export type Type = "type" & {
        __Type: void;
    };
    export type Variable = "variable" & {
        __Variable: void;
    };

    export interface _Visitor<Result> {
        type: () => Result;
        variable: () => Result;
        _unknown: () => Result;
    }
}
