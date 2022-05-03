export declare type MolecularsequenceType = MolecularsequenceType.Aa | MolecularsequenceType.Dna | MolecularsequenceType.Rna;
export declare const MolecularsequenceType: {
    Aa: MolecularsequenceType.Aa;
    Dna: MolecularsequenceType.Dna;
    Rna: MolecularsequenceType.Rna;
    _visit: <Result>(value: MolecularsequenceType, visitor: MolecularsequenceType._Visitor<Result>) => Result;
};
export declare namespace MolecularsequenceType {
    type Aa = "aa" & {
        __Aa: void;
    };
    type Dna = "dna" & {
        __Dna: void;
    };
    type Rna = "rna" & {
        __Rna: void;
    };
    interface _Visitor<Result> {
        aa: () => Result;
        dna: () => Result;
        rna: () => Result;
        _unknown: () => Result;
    }
}
