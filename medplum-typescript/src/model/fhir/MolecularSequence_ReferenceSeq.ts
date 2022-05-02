import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Molecularsequence_referenceseqOrientation } from "./Molecularsequence_referenceseqOrientation";
import { Molecularsequence_referenceseqStrand } from "./Molecularsequence_referenceseqStrand";
import { Reference } from "./Reference";

export interface MolecularSequence_ReferenceSeq {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    chromosome: CodeableConcept | null | undefined;
    genomeBuild: string | null | undefined;
    orientation: Molecularsequence_referenceseqOrientation | null | undefined;
    referenceSeqId: CodeableConcept | null | undefined;
    referenceSeqPointer: Reference | null | undefined;
    referenceSeqString: string | null | undefined;
    strand: Molecularsequence_referenceseqStrand | null | undefined;
    windowStart: number | null | undefined;
    windowEnd: number | null | undefined;
}
