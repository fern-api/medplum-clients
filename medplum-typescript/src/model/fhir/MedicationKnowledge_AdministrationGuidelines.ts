import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { MedicationKnowledge_Dosage } from "./MedicationKnowledge_Dosage";
import { MedicationKnowledge_PatientCharacteristics } from "./MedicationKnowledge_PatientCharacteristics";
import { Reference } from "./Reference";

export interface MedicationKnowledge_AdministrationGuidelines {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    dosage: MedicationKnowledge_Dosage[] | null | undefined;
    indicationCodeableConcept: CodeableConcept | null | undefined;
    indicationReference: Reference | null | undefined;
    patientCharacteristics:
        | MedicationKnowledge_PatientCharacteristics[]
        | null
        | undefined;
}
