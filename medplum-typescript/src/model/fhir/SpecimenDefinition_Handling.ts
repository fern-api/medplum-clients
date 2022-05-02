import { CodeableConcept } from "./CodeableConcept";
import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { Range } from "./Range";

export interface SpecimenDefinition_Handling {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    temperatureQualifier: CodeableConcept | null | undefined;
    temperatureRange: Range | null | undefined;
    maxDuration: Duration | null | undefined;
    instruction: string | null | undefined;
}
