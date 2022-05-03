export declare type Plandefinition_actionCardinalitybehavior = Plandefinition_actionCardinalitybehavior.Single | Plandefinition_actionCardinalitybehavior.Multiple;
export declare const Plandefinition_actionCardinalitybehavior: {
    Single: Plandefinition_actionCardinalitybehavior.Single;
    Multiple: Plandefinition_actionCardinalitybehavior.Multiple;
    _visit: <Result>(value: Plandefinition_actionCardinalitybehavior, visitor: Plandefinition_actionCardinalitybehavior._Visitor<Result>) => Result;
};
export declare namespace Plandefinition_actionCardinalitybehavior {
    type Single = "single" & {
        __Single: void;
    };
    type Multiple = "multiple" & {
        __Multiple: void;
    };
    interface _Visitor<Result> {
        single: () => Result;
        multiple: () => Result;
        _unknown: () => Result;
    }
}
