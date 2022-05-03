import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface DeviceDefinition_Material {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    substance: CodeableConcept;
    alternate: boolean | null | undefined;
    allergenicIndicator: boolean | null | undefined;
}
