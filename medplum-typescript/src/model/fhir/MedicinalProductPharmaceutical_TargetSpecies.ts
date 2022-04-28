import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { MedicinalProductPharmaceutical_WithdrawalPeriod } from "./MedicinalProductPharmaceutical_WithdrawalPeriod";

export interface MedicinalProductPharmaceutical_TargetSpecies {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept;
    withdrawalPeriod: MedicinalProductPharmaceutical_WithdrawalPeriod[] | null | undefined;
}
