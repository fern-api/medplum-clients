export type ImplementationguideFhirversionItem = never;

export const ImplementationguideFhirversionItem = {
    _visit: <Result>(
        _value: ImplementationguideFhirversionItem,
        visitor: ImplementationguideFhirversionItem._Visitor<Result>
    ): Result => {
        return visitor._unknown();
    },
};

export declare namespace ImplementationguideFhirversionItem {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
