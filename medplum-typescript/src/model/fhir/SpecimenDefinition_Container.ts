import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { SpecimenDefinition_Additive } from "./SpecimenDefinition_Additive";

export interface SpecimenDefinition_Container {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    material: CodeableConcept | null | undefined;
    type: CodeableConcept | null | undefined;
    cap: CodeableConcept | null | undefined;
    description: string | null | undefined;
    capacity: Quantity | null | undefined;
    minimumVolumeQuantity: Quantity | null | undefined;
    minimumVolumeString: string | null | undefined;
    additive: SpecimenDefinition_Additive[] | null | undefined;
    preparation: string | null | undefined;
}
