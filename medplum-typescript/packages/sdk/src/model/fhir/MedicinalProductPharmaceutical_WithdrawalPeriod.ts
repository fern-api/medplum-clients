import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";

export interface MedicinalProductPharmaceutical_WithdrawalPeriod {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    tissue: CodeableConcept;
    value: Quantity;
    supportingInformation: string | null | undefined;
}
