export type CountComparator = never;

export const CountComparator = {

    _visit: <Result>(_value: CountComparator, visitor: CountComparator._Visitor<Result>): Result => {
        return visitor._unknown();
    },
};

export declare namespace CountComparator {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
