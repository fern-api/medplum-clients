import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { SubstanceAmount } from "./SubstanceAmount";
import { SubstancePolymer_DegreeOfPolymerisation } from "./SubstancePolymer_DegreeOfPolymerisation";
import { SubstancePolymer_StructuralRepresentation } from "./SubstancePolymer_StructuralRepresentation";

export interface SubstancePolymer_RepeatUnit {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    orientationOfPolymerisation: CodeableConcept | null | undefined;
    repeatUnit: string | null | undefined;
    amount: SubstanceAmount | null | undefined;
    degreeOfPolymerisation:
        | SubstancePolymer_DegreeOfPolymerisation[]
        | null
        | undefined;
    structuralRepresentation:
        | SubstancePolymer_StructuralRepresentation[]
        | null
        | undefined;
}
