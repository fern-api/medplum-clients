export type Molecularsequence_qualityType =
    | Molecularsequence_qualityType.Indel
    | Molecularsequence_qualityType.Snp;

export const Molecularsequence_qualityType = {
    Indel: "indel" as Molecularsequence_qualityType.Indel,
    Snp: "snp" as Molecularsequence_qualityType.Snp,

    _visit: <Result>(
        value: Molecularsequence_qualityType,
        visitor: Molecularsequence_qualityType._Visitor<Result>
    ): Result => {
        switch (value) {
            case Molecularsequence_qualityType.Indel:
                return visitor.indel();
            case Molecularsequence_qualityType.Snp:
                return visitor.snp();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Molecularsequence_qualityType {
    export type Indel = "indel" & {
        __Indel: void;
    };
    export type Snp = "snp" & {
        __Snp: void;
    };

    export interface _Visitor<Result> {
        indel: () => Result;
        snp: () => Result;
        _unknown: () => Result;
    }
}
