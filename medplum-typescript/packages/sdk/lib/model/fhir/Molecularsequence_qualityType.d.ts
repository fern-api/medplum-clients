export declare type Molecularsequence_qualityType = Molecularsequence_qualityType.Indel | Molecularsequence_qualityType.Snp;
export declare const Molecularsequence_qualityType: {
    Indel: Molecularsequence_qualityType.Indel;
    Snp: Molecularsequence_qualityType.Snp;
    _visit: <Result>(value: Molecularsequence_qualityType, visitor: Molecularsequence_qualityType._Visitor<Result>) => Result;
};
export declare namespace Molecularsequence_qualityType {
    type Indel = "indel" & {
        __Indel: void;
    };
    type Snp = "snp" & {
        __Snp: void;
    };
    interface _Visitor<Result> {
        indel: () => Result;
        snp: () => Result;
        _unknown: () => Result;
    }
}
