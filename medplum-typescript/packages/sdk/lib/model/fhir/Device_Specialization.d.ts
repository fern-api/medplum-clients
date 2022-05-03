import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface Device_Specialization {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    systemType: CodeableConcept;
    version: string | null | undefined;
}
