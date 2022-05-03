export declare type Capabilitystatement_resourceConditionaldelete = Capabilitystatement_resourceConditionaldelete.Single | Capabilitystatement_resourceConditionaldelete.Multiple;
export declare const Capabilitystatement_resourceConditionaldelete: {
    Single: Capabilitystatement_resourceConditionaldelete.Single;
    Multiple: Capabilitystatement_resourceConditionaldelete.Multiple;
    _visit: <Result>(value: Capabilitystatement_resourceConditionaldelete, visitor: Capabilitystatement_resourceConditionaldelete._Visitor<Result>) => Result;
};
export declare namespace Capabilitystatement_resourceConditionaldelete {
    type Single = "single" & {
        __Single: void;
    };
    type Multiple = "multiple" & {
        __Multiple: void;
    };
    interface _Visitor<Result> {
        single: () => Result;
        multiple: () => Result;
        _unknown: () => Result;
    }
}
