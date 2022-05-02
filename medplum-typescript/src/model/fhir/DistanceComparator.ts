export type DistanceComparator = never;

export const DistanceComparator = {
    _visit: <Result>(
        _value: DistanceComparator,
        visitor: DistanceComparator._Visitor<Result>
    ): Result => {
        return visitor._unknown();
    },
};

export declare namespace DistanceComparator {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
