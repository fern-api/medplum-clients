export type DurationComparator = never;

export const DurationComparator = {

    _visit: <Result>(_value: DurationComparator, visitor: DurationComparator._Visitor<Result>): Result => {
        return visitor._unknown();
    },
};

export declare namespace DurationComparator {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
