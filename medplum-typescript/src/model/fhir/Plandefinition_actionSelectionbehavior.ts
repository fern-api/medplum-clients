export type Plandefinition_actionSelectionbehavior =
    | Plandefinition_actionSelectionbehavior.Any
    | Plandefinition_actionSelectionbehavior.All;

export const Plandefinition_actionSelectionbehavior = {
    Any: "any" as Plandefinition_actionSelectionbehavior.Any,
    All: "all" as Plandefinition_actionSelectionbehavior.All,

    _visit: <Result>(
        value: Plandefinition_actionSelectionbehavior,
        visitor: Plandefinition_actionSelectionbehavior._Visitor<Result>
    ): Result => {
        switch (value) {
            case Plandefinition_actionSelectionbehavior.Any:
                return visitor.any();
            case Plandefinition_actionSelectionbehavior.All:
                return visitor.all();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Plandefinition_actionSelectionbehavior {
    export type Any = "any" & {
        __Any: void;
    };
    export type All = "all" & {
        __All: void;
    };

    export interface _Visitor<Result> {
        any: () => Result;
        all: () => Result;
        _unknown: () => Result;
    }
}
