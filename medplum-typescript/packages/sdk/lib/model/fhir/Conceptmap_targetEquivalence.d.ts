export declare type Conceptmap_targetEquivalence = Conceptmap_targetEquivalence.Relatedto | Conceptmap_targetEquivalence.Equivalent | Conceptmap_targetEquivalence.Equal | Conceptmap_targetEquivalence.Wider | Conceptmap_targetEquivalence.Subsumes | Conceptmap_targetEquivalence.Narrower | Conceptmap_targetEquivalence.Specializes | Conceptmap_targetEquivalence.Inexact | Conceptmap_targetEquivalence.Unmatched | Conceptmap_targetEquivalence.Disjoint;
export declare const Conceptmap_targetEquivalence: {
    Relatedto: Conceptmap_targetEquivalence.Relatedto;
    Equivalent: Conceptmap_targetEquivalence.Equivalent;
    Equal: Conceptmap_targetEquivalence.Equal;
    Wider: Conceptmap_targetEquivalence.Wider;
    Subsumes: Conceptmap_targetEquivalence.Subsumes;
    Narrower: Conceptmap_targetEquivalence.Narrower;
    Specializes: Conceptmap_targetEquivalence.Specializes;
    Inexact: Conceptmap_targetEquivalence.Inexact;
    Unmatched: Conceptmap_targetEquivalence.Unmatched;
    Disjoint: Conceptmap_targetEquivalence.Disjoint;
    _visit: <Result>(value: Conceptmap_targetEquivalence, visitor: Conceptmap_targetEquivalence._Visitor<Result>) => Result;
};
export declare namespace Conceptmap_targetEquivalence {
    type Relatedto = "relatedto" & {
        __Relatedto: void;
    };
    type Equivalent = "equivalent" & {
        __Equivalent: void;
    };
    type Equal = "equal" & {
        __Equal: void;
    };
    type Wider = "wider" & {
        __Wider: void;
    };
    type Subsumes = "subsumes" & {
        __Subsumes: void;
    };
    type Narrower = "narrower" & {
        __Narrower: void;
    };
    type Specializes = "specializes" & {
        __Specializes: void;
    };
    type Inexact = "inexact" & {
        __Inexact: void;
    };
    type Unmatched = "unmatched" & {
        __Unmatched: void;
    };
    type Disjoint = "disjoint" & {
        __Disjoint: void;
    };
    interface _Visitor<Result> {
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
