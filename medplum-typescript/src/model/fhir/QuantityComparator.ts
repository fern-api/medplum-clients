export type QuantityComparator = never;

export const QuantityComparator = {

    _visit: <Result>(_value: QuantityComparator, visitor: QuantityComparator._Visitor<Result>): Result => {
        return visitor._unknown();
    },
};

export declare namespace QuantityComparator {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
