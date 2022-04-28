export type Plandefinition_actionCardinalitybehavior =
    | Plandefinition_actionCardinalitybehavior.Single
    | Plandefinition_actionCardinalitybehavior.Multiple;

export const Plandefinition_actionCardinalitybehavior = {
    Single: "single" as Plandefinition_actionCardinalitybehavior.Single,
    Multiple: "multiple" as Plandefinition_actionCardinalitybehavior.Multiple,

    _visit: <Result>(value: Plandefinition_actionCardinalitybehavior, visitor: Plandefinition_actionCardinalitybehavior._Visitor<Result>): Result => {
        switch (value) {
            case Plandefinition_actionCardinalitybehavior.Single: return visitor.single();
            case Plandefinition_actionCardinalitybehavior.Multiple: return visitor.multiple();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Plandefinition_actionCardinalitybehavior {
    export type Single = "single" & {
        __Single: void,
    };
    export type Multiple = "multiple" & {
        __Multiple: void,
    };

    export interface _Visitor<Result> {
        single: () => Result;
        multiple: () => Result;
        _unknown: () => Result;
    }
}
