export declare type Provenance_entityRole = Provenance_entityRole.Derivation | Provenance_entityRole.Revision | Provenance_entityRole.Quotation | Provenance_entityRole.Source | Provenance_entityRole.Removal;
export declare const Provenance_entityRole: {
    Derivation: Provenance_entityRole.Derivation;
    Revision: Provenance_entityRole.Revision;
    Quotation: Provenance_entityRole.Quotation;
    Source: Provenance_entityRole.Source;
    Removal: Provenance_entityRole.Removal;
    _visit: <Result>(value: Provenance_entityRole, visitor: Provenance_entityRole._Visitor<Result>) => Result;
};
export declare namespace Provenance_entityRole {
    type Derivation = "derivation" & {
        __Derivation: void;
    };
    type Revision = "revision" & {
        __Revision: void;
    };
    type Quotation = "quotation" & {
        __Quotation: void;
    };
    type Source = "source" & {
        __Source: void;
    };
    type Removal = "removal" & {
        __Removal: void;
    };
    interface _Visitor<Result> {
        derivation: () => Result;
        revision: () => Result;
        quotation: () => Result;
        source: () => Result;
        removal: () => Result;
        _unknown: () => Result;
    }
}
