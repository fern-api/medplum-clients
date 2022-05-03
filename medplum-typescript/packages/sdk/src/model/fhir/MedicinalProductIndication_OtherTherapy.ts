import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface MedicinalProductIndication_OtherTherapy {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    therapyRelationshipType: CodeableConcept;
    medicationCodeableConcept: CodeableConcept | null | undefined;
    medicationReference: Reference | null | undefined;
}
