export declare type Molecularsequence_referenceseqStrand = Molecularsequence_referenceseqStrand.Watson | Molecularsequence_referenceseqStrand.Crick;
export declare const Molecularsequence_referenceseqStrand: {
    Watson: Molecularsequence_referenceseqStrand.Watson;
    Crick: Molecularsequence_referenceseqStrand.Crick;
    _visit: <Result>(value: Molecularsequence_referenceseqStrand, visitor: Molecularsequence_referenceseqStrand._Visitor<Result>) => Result;
};
export declare namespace Molecularsequence_referenceseqStrand {
    type Watson = "watson" & {
        __Watson: void;
    };
    type Crick = "crick" & {
        __Crick: void;
    };
    interface _Visitor<Result> {
        watson: () => Result;
        crick: () => Result;
        _unknown: () => Result;
    }
}
