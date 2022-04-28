export type Molecularsequence_referenceseqStrand =
    | Molecularsequence_referenceseqStrand.Watson
    | Molecularsequence_referenceseqStrand.Crick;

export const Molecularsequence_referenceseqStrand = {
    Watson: "watson" as Molecularsequence_referenceseqStrand.Watson,
    Crick: "crick" as Molecularsequence_referenceseqStrand.Crick,

    _visit: <Result>(value: Molecularsequence_referenceseqStrand, visitor: Molecularsequence_referenceseqStrand._Visitor<Result>): Result => {
        switch (value) {
            case Molecularsequence_referenceseqStrand.Watson: return visitor.watson();
            case Molecularsequence_referenceseqStrand.Crick: return visitor.crick();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Molecularsequence_referenceseqStrand {
    export type Watson = "watson" & {
        __Watson: void,
    };
    export type Crick = "crick" & {
        __Crick: void,
    };

    export interface _Visitor<Result> {
        watson: () => Result;
        crick: () => Result;
        _unknown: () => Result;
    }
}
