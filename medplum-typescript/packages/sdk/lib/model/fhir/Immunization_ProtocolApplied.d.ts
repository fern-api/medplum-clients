import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface Immunization_ProtocolApplied {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    series: string | null | undefined;
    authority: Reference | null | undefined;
    targetDisease: CodeableConcept[] | null | undefined;
    doseNumberPositiveInt: number | null | undefined;
    doseNumberString: string | null | undefined;
    seriesDosesPositiveInt: number | null | undefined;
    seriesDosesString: string | null | undefined;
}
