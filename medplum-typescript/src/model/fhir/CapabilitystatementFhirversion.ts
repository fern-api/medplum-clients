export type CapabilitystatementFhirversion = never;

export const CapabilitystatementFhirversion = {
    _visit: <Result>(
        _value: CapabilitystatementFhirversion,
        visitor: CapabilitystatementFhirversion._Visitor<Result>
    ): Result => {
        return visitor._unknown();
    },
};

export declare namespace CapabilitystatementFhirversion {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
