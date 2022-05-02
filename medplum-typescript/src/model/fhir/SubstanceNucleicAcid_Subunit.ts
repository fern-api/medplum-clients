import { Attachment } from "./Attachment";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { SubstanceNucleicAcid_Linkage } from "./SubstanceNucleicAcid_Linkage";
import { SubstanceNucleicAcid_Sugar } from "./SubstanceNucleicAcid_Sugar";

export interface SubstanceNucleicAcid_Subunit {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    subunit: number | null | undefined;
    sequence: string | null | undefined;
    length: number | null | undefined;
    sequenceAttachment: Attachment | null | undefined;
    fivePrime: CodeableConcept | null | undefined;
    threePrime: CodeableConcept | null | undefined;
    linkage: SubstanceNucleicAcid_Linkage[] | null | undefined;
    sugar: SubstanceNucleicAcid_Sugar[] | null | undefined;
}
