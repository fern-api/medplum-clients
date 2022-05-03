export declare type Capabilitystatement_resourceReferencepolicyItem = Capabilitystatement_resourceReferencepolicyItem.Literal | Capabilitystatement_resourceReferencepolicyItem.Logical | Capabilitystatement_resourceReferencepolicyItem.Resolves | Capabilitystatement_resourceReferencepolicyItem.Enforced | Capabilitystatement_resourceReferencepolicyItem.Local;
export declare const Capabilitystatement_resourceReferencepolicyItem: {
    Literal: Capabilitystatement_resourceReferencepolicyItem.Literal;
    Logical: Capabilitystatement_resourceReferencepolicyItem.Logical;
    Resolves: Capabilitystatement_resourceReferencepolicyItem.Resolves;
    Enforced: Capabilitystatement_resourceReferencepolicyItem.Enforced;
    Local: Capabilitystatement_resourceReferencepolicyItem.Local;
    _visit: <Result>(value: Capabilitystatement_resourceReferencepolicyItem, visitor: Capabilitystatement_resourceReferencepolicyItem._Visitor<Result>) => Result;
};
export declare namespace Capabilitystatement_resourceReferencepolicyItem {
    type Literal = "literal" & {
        __Literal: void;
    };
    type Logical = "logical" & {
        __Logical: void;
    };
    type Resolves = "resolves" & {
        __Resolves: void;
    };
    type Enforced = "enforced" & {
        __Enforced: void;
    };
    type Local = "local" & {
        __Local: void;
    };
    interface _Visitor<Result> {
        literal: () => Result;
        logical: () => Result;
        resolves: () => Result;
        enforced: () => Result;
        local: () => Result;
        _unknown: () => Result;
    }
}
