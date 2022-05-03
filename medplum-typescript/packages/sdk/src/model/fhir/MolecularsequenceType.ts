export type MolecularsequenceType =
    | MolecularsequenceType.Aa
    | MolecularsequenceType.Dna
    | MolecularsequenceType.Rna;

export const MolecularsequenceType = {
    Aa: "aa" as MolecularsequenceType.Aa,
    Dna: "dna" as MolecularsequenceType.Dna,
    Rna: "rna" as MolecularsequenceType.Rna,

    _visit: <Result>(
        value: MolecularsequenceType,
        visitor: MolecularsequenceType._Visitor<Result>
    ): Result => {
        switch (value) {
            case MolecularsequenceType.Aa:
                return visitor.aa();
            case MolecularsequenceType.Dna:
                return visitor.dna();
            case MolecularsequenceType.Rna:
                return visitor.rna();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace MolecularsequenceType {
    export type Aa = "aa" & {
        __Aa: void;
    };
    export type Dna = "dna" & {
        __Dna: void;
    };
    export type Rna = "rna" & {
        __Rna: void;
    };

    export interface _Visitor<Result> {
        aa: () => Result;
        dna: () => Result;
        rna: () => Result;
        _unknown: () => Result;
    }
}
