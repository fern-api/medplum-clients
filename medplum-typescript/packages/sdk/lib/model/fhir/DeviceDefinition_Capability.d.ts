import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface DeviceDefinition_Capability {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    description: CodeableConcept[] | null | undefined;
}
