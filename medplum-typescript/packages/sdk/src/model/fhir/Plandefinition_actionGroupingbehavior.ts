export type Plandefinition_actionGroupingbehavior = never;

export const Plandefinition_actionGroupingbehavior = {
    _visit: <Result>(
        _value: Plandefinition_actionGroupingbehavior,
        visitor: Plandefinition_actionGroupingbehavior._Visitor<Result>
    ): Result => {
        return visitor._unknown();
    },
};

export declare namespace Plandefinition_actionGroupingbehavior {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
