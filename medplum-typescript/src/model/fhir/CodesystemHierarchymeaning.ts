export type CodesystemHierarchymeaning = never;

export const CodesystemHierarchymeaning = {

    _visit: <Result>(_value: CodesystemHierarchymeaning, visitor: CodesystemHierarchymeaning._Visitor<Result>): Result => {
        return visitor._unknown();
    },
};

export declare namespace CodesystemHierarchymeaning {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
