export type AgeComparator = never;

export const AgeComparator = {

    _visit: <Result>(_value: AgeComparator, visitor: AgeComparator._Visitor<Result>): Result => {
        return visitor._unknown();
    },
};

export declare namespace AgeComparator {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
