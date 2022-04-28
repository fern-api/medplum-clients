export type Conceptmap_targetEquivalence =
    | Conceptmap_targetEquivalence.Relatedto
    | Conceptmap_targetEquivalence.Equivalent
    | Conceptmap_targetEquivalence.Equal
    | Conceptmap_targetEquivalence.Wider
    | Conceptmap_targetEquivalence.Subsumes
    | Conceptmap_targetEquivalence.Narrower
    | Conceptmap_targetEquivalence.Specializes
    | Conceptmap_targetEquivalence.Inexact
    | Conceptmap_targetEquivalence.Unmatched
    | Conceptmap_targetEquivalence.Disjoint;

export const Conceptmap_targetEquivalence = {
    Relatedto: "relatedto" as Conceptmap_targetEquivalence.Relatedto,
    Equivalent: "equivalent" as Conceptmap_targetEquivalence.Equivalent,
    Equal: "equal" as Conceptmap_targetEquivalence.Equal,
    Wider: "wider" as Conceptmap_targetEquivalence.Wider,
    Subsumes: "subsumes" as Conceptmap_targetEquivalence.Subsumes,
    Narrower: "narrower" as Conceptmap_targetEquivalence.Narrower,
    Specializes: "specializes" as Conceptmap_targetEquivalence.Specializes,
    Inexact: "inexact" as Conceptmap_targetEquivalence.Inexact,
    Unmatched: "unmatched" as Conceptmap_targetEquivalence.Unmatched,
    Disjoint: "disjoint" as Conceptmap_targetEquivalence.Disjoint,

    _visit: <Result>(value: Conceptmap_targetEquivalence, visitor: Conceptmap_targetEquivalence._Visitor<Result>): Result => {
        switch (value) {
            case Conceptmap_targetEquivalence.Relatedto: return visitor.relatedto();
            case Conceptmap_targetEquivalence.Equivalent: return visitor.equivalent();
            case Conceptmap_targetEquivalence.Equal: return visitor.equal();
            case Conceptmap_targetEquivalence.Wider: return visitor.wider();
            case Conceptmap_targetEquivalence.Subsumes: return visitor.subsumes();
            case Conceptmap_targetEquivalence.Narrower: return visitor.narrower();
            case Conceptmap_targetEquivalence.Specializes: return visitor.specializes();
            case Conceptmap_targetEquivalence.Inexact: return visitor.inexact();
            case Conceptmap_targetEquivalence.Unmatched: return visitor.unmatched();
            case Conceptmap_targetEquivalence.Disjoint: return visitor.disjoint();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Conceptmap_targetEquivalence {
    export type Relatedto = "relatedto" & {
        __Relatedto: void,
    };
    export type Equivalent = "equivalent" & {
        __Equivalent: void,
    };
    export type Equal = "equal" & {
        __Equal: void,
    };
    export type Wider = "wider" & {
        __Wider: void,
    };
    export type Subsumes = "subsumes" & {
        __Subsumes: void,
    };
    export type Narrower = "narrower" & {
        __Narrower: void,
    };
    export type Specializes = "specializes" & {
        __Specializes: void,
    };
    export type Inexact = "inexact" & {
        __Inexact: void,
    };
    export type Unmatched = "unmatched" & {
        __Unmatched: void,
    };
    export type Disjoint = "disjoint" & {
        __Disjoint: void,
    };

    export interface _Visitor<Result> {
        relatedto: () => Result;
        equivalent: () => Result;
        equal: () => Result;
        wider: () => Result;
        subsumes: () => Result;
        narrower: () => Result;
        specializes: () => Result;
        inexact: () => Result;
        unmatched: () => Result;
        disjoint: () => Result;
        _unknown: () => Result;
    }
}
