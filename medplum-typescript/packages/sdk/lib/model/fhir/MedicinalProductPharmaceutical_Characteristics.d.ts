import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface MedicinalProductPharmaceutical_Characteristics {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept;
    status: CodeableConcept | null | undefined;
}
