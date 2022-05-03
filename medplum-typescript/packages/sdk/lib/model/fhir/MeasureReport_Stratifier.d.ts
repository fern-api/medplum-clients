import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { MeasureReport_Stratum } from "./MeasureReport_Stratum";
export interface MeasureReport_Stratifier {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept[] | null | undefined;
    stratum: MeasureReport_Stratum[] | null | undefined;
}
