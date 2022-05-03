import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { SubstanceAmount } from "./SubstanceAmount";
export interface SubstancePolymer_DegreeOfPolymerisation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    degree: CodeableConcept | null | undefined;
    amount: SubstanceAmount | null | undefined;
}
