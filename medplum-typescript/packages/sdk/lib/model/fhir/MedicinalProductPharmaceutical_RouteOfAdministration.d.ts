import { CodeableConcept } from "./CodeableConcept";
import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { MedicinalProductPharmaceutical_TargetSpecies } from "./MedicinalProductPharmaceutical_TargetSpecies";
import { Quantity } from "./Quantity";
import { Ratio } from "./Ratio";
export interface MedicinalProductPharmaceutical_RouteOfAdministration {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept;
    firstDose: Quantity | null | undefined;
    maxSingleDose: Quantity | null | undefined;
    maxDosePerDay: Quantity | null | undefined;
    maxDosePerTreatmentPeriod: Ratio | null | undefined;
    maxTreatmentPeriod: Duration | null | undefined;
    targetSpecies: MedicinalProductPharmaceutical_TargetSpecies[] | null | undefined;
}
