import { canonical } from "./canonical";
import { Extension } from "./Extension";
import { Operationdefinition_bindingStrength } from "./Operationdefinition_bindingStrength";
export interface OperationDefinition_Binding {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    strength: Operationdefinition_bindingStrength | null | undefined;
    valueSet: canonical;
}
