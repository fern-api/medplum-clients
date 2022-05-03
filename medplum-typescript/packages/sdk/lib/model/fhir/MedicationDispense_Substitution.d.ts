import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface MedicationDispense_Substitution {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    wasSubstituted: boolean | null | undefined;
    type: CodeableConcept | null | undefined;
    reason: CodeableConcept[] | null | undefined;
    responsibleParty: Reference[] | null | undefined;
}
