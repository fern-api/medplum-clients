export declare type Molecularsequence_referenceseqOrientation = Molecularsequence_referenceseqOrientation.Sense | Molecularsequence_referenceseqOrientation.Antisense;
export declare const Molecularsequence_referenceseqOrientation: {
    Sense: Molecularsequence_referenceseqOrientation.Sense;
    Antisense: Molecularsequence_referenceseqOrientation.Antisense;
    _visit: <Result>(value: Molecularsequence_referenceseqOrientation, visitor: Molecularsequence_referenceseqOrientation._Visitor<Result>) => Result;
};
export declare namespace Molecularsequence_referenceseqOrientation {
    type Sense = "sense" & {
        __Sense: void;
    };
    type Antisense = "antisense" & {
        __Antisense: void;
    };
    interface _Visitor<Result> {
        sense: () => Result;
        antisense: () => Result;
        _unknown: () => Result;
    }
}
