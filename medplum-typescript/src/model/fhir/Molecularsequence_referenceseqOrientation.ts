export type Molecularsequence_referenceseqOrientation =
    | Molecularsequence_referenceseqOrientation.Sense
    | Molecularsequence_referenceseqOrientation.Antisense;

export const Molecularsequence_referenceseqOrientation = {
    Sense: "sense" as Molecularsequence_referenceseqOrientation.Sense,
    Antisense: "antisense" as Molecularsequence_referenceseqOrientation.Antisense,

    _visit: <Result>(value: Molecularsequence_referenceseqOrientation, visitor: Molecularsequence_referenceseqOrientation._Visitor<Result>): Result => {
        switch (value) {
            case Molecularsequence_referenceseqOrientation.Sense: return visitor.sense();
            case Molecularsequence_referenceseqOrientation.Antisense: return visitor.antisense();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Molecularsequence_referenceseqOrientation {
    export type Sense = "sense" & {
        __Sense: void,
    };
    export type Antisense = "antisense" & {
        __Antisense: void,
    };

    export interface _Visitor<Result> {
        sense: () => Result;
        antisense: () => Result;
        _unknown: () => Result;
    }
}
