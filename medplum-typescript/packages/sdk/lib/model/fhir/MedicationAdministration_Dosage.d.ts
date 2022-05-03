import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Ratio } from "./Ratio";
export interface MedicationAdministration_Dosage {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    text: string | null | undefined;
    site: CodeableConcept | null | undefined;
    route: CodeableConcept | null | undefined;
    method: CodeableConcept | null | undefined;
    dose: Quantity | null | undefined;
    rateRatio: Ratio | null | undefined;
    rateQuantity: Quantity | null | undefined;
}
