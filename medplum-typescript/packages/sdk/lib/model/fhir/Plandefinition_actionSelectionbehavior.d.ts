export declare type Plandefinition_actionSelectionbehavior = Plandefinition_actionSelectionbehavior.Any | Plandefinition_actionSelectionbehavior.All;
export declare const Plandefinition_actionSelectionbehavior: {
    Any: Plandefinition_actionSelectionbehavior.Any;
    All: Plandefinition_actionSelectionbehavior.All;
    _visit: <Result>(value: Plandefinition_actionSelectionbehavior, visitor: Plandefinition_actionSelectionbehavior._Visitor<Result>) => Result;
};
export declare namespace Plandefinition_actionSelectionbehavior {
    type Any = "any" & {
        __Any: void;
    };
    type All = "all" & {
        __All: void;
    };
    interface _Visitor<Result> {
        any: () => Result;
        all: () => Result;
        _unknown: () => Result;
    }
}
