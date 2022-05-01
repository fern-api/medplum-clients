export type Capabilitystatement_resourceConditionalread = never;

export const Capabilitystatement_resourceConditionalread = {
    _visit: <Result>(
        _value: Capabilitystatement_resourceConditionalread,
        visitor: Capabilitystatement_resourceConditionalread._Visitor<Result>
    ): Result => {
        return visitor._unknown();
    },
};

export declare namespace Capabilitystatement_resourceConditionalread {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
