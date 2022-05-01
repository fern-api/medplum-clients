export type Capabilitystatement_resourceReferencepolicyItem =
    | Capabilitystatement_resourceReferencepolicyItem.Literal
    | Capabilitystatement_resourceReferencepolicyItem.Logical
    | Capabilitystatement_resourceReferencepolicyItem.Resolves
    | Capabilitystatement_resourceReferencepolicyItem.Enforced
    | Capabilitystatement_resourceReferencepolicyItem.Local;

export const Capabilitystatement_resourceReferencepolicyItem = {
    Literal:
        "literal" as Capabilitystatement_resourceReferencepolicyItem.Literal,
    Logical:
        "logical" as Capabilitystatement_resourceReferencepolicyItem.Logical,
    Resolves:
        "resolves" as Capabilitystatement_resourceReferencepolicyItem.Resolves,
    Enforced:
        "enforced" as Capabilitystatement_resourceReferencepolicyItem.Enforced,
    Local: "local" as Capabilitystatement_resourceReferencepolicyItem.Local,

    _visit: <Result>(
        value: Capabilitystatement_resourceReferencepolicyItem,
        visitor: Capabilitystatement_resourceReferencepolicyItem._Visitor<Result>
    ): Result => {
        switch (value) {
            case Capabilitystatement_resourceReferencepolicyItem.Literal:
                return visitor.literal();
            case Capabilitystatement_resourceReferencepolicyItem.Logical:
                return visitor.logical();
            case Capabilitystatement_resourceReferencepolicyItem.Resolves:
                return visitor.resolves();
            case Capabilitystatement_resourceReferencepolicyItem.Enforced:
                return visitor.enforced();
            case Capabilitystatement_resourceReferencepolicyItem.Local:
                return visitor.local();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Capabilitystatement_resourceReferencepolicyItem {
    export type Literal = "literal" & {
        __Literal: void;
    };
    export type Logical = "logical" & {
        __Logical: void;
    };
    export type Resolves = "resolves" & {
        __Resolves: void;
    };
    export type Enforced = "enforced" & {
        __Enforced: void;
    };
    export type Local = "local" & {
        __Local: void;
    };

    export interface _Visitor<Result> {
        literal: () => Result;
        logical: () => Result;
        resolves: () => Result;
        enforced: () => Result;
        local: () => Result;
        _unknown: () => Result;
    }
}
