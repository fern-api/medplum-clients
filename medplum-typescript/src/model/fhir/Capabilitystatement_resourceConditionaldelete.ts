export type Capabilitystatement_resourceConditionaldelete =
    | Capabilitystatement_resourceConditionaldelete.Single
    | Capabilitystatement_resourceConditionaldelete.Multiple;

export const Capabilitystatement_resourceConditionaldelete = {
    Single: "single" as Capabilitystatement_resourceConditionaldelete.Single,
    Multiple: "multiple" as Capabilitystatement_resourceConditionaldelete.Multiple,

    _visit: <Result>(value: Capabilitystatement_resourceConditionaldelete, visitor: Capabilitystatement_resourceConditionaldelete._Visitor<Result>): Result => {
        switch (value) {
            case Capabilitystatement_resourceConditionaldelete.Single: return visitor.single();
            case Capabilitystatement_resourceConditionaldelete.Multiple: return visitor.multiple();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Capabilitystatement_resourceConditionaldelete {
    export type Single = "single" & {
        __Single: void,
    };
    export type Multiple = "multiple" & {
        __Multiple: void,
    };

    export interface _Visitor<Result> {
        single: () => Result;
        multiple: () => Result;
        _unknown: () => Result;
    }
}
