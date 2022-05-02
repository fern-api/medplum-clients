import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface MedicationAdministration_Performer {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    function: CodeableConcept | null | undefined;
    actor: Reference;
}
