import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface MolecularSequence_Variant {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    start: number | null | undefined;
    end: number | null | undefined;
    observedAllele: string | null | undefined;
    referenceAllele: string | null | undefined;
    cigar: string | null | undefined;
    variantPointer: Reference | null | undefined;
}
