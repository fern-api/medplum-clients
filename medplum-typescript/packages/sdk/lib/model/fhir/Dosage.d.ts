import { CodeableConcept } from "./CodeableConcept";
import { Dosage_DoseAndRate } from "./Dosage_DoseAndRate";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Ratio } from "./Ratio";
import { Timing } from "./Timing";
export interface Dosage {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    sequence: number | null | undefined;
    text: string | null | undefined;
    additionalInstruction: CodeableConcept[] | null | undefined;
    patientInstruction: string | null | undefined;
    timing: Timing | null | undefined;
    asNeededBoolean: boolean | null | undefined;
    asNeededCodeableConcept: CodeableConcept | null | undefined;
    site: CodeableConcept | null | undefined;
    route: CodeableConcept | null | undefined;
    method: CodeableConcept | null | undefined;
    doseAndRate: Dosage_DoseAndRate[] | null | undefined;
    maxDosePerPeriod: Ratio | null | undefined;
    maxDosePerAdministration: Quantity | null | undefined;
    maxDosePerLifetime: Quantity | null | undefined;
}
