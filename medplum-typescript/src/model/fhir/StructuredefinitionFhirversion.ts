export type StructuredefinitionFhirversion = never;

export const StructuredefinitionFhirversion = {
    _visit: <Result>(
        _value: StructuredefinitionFhirversion,
        visitor: StructuredefinitionFhirversion._Visitor<Result>
    ): Result => {
        return visitor._unknown();
    },
};

export declare namespace StructuredefinitionFhirversion {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
