export type Provenance_entityRole =
    | Provenance_entityRole.Derivation
    | Provenance_entityRole.Revision
    | Provenance_entityRole.Quotation
    | Provenance_entityRole.Source
    | Provenance_entityRole.Removal;

export const Provenance_entityRole = {
    Derivation: "derivation" as Provenance_entityRole.Derivation,
    Revision: "revision" as Provenance_entityRole.Revision,
    Quotation: "quotation" as Provenance_entityRole.Quotation,
    Source: "source" as Provenance_entityRole.Source,
    Removal: "removal" as Provenance_entityRole.Removal,

    _visit: <Result>(
        value: Provenance_entityRole,
        visitor: Provenance_entityRole._Visitor<Result>
    ): Result => {
        switch (value) {
            case Provenance_entityRole.Derivation:
                return visitor.derivation();
            case Provenance_entityRole.Revision:
                return visitor.revision();
            case Provenance_entityRole.Quotation:
                return visitor.quotation();
            case Provenance_entityRole.Source:
                return visitor.source();
            case Provenance_entityRole.Removal:
                return visitor.removal();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Provenance_entityRole {
    export type Derivation = "derivation" & {
        __Derivation: void;
    };
    export type Revision = "revision" & {
        __Revision: void;
    };
    export type Quotation = "quotation" & {
        __Quotation: void;
    };
    export type Source = "source" & {
        __Source: void;
    };
    export type Removal = "removal" & {
        __Removal: void;
    };

    export interface _Visitor<Result> {
        derivation: () => Result;
        revision: () => Result;
        quotation: () => Result;
        source: () => Result;
        removal: () => Result;
        _unknown: () => Result;
    }
}
