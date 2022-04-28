import { canonical } from "./canonical";
import { Elementdefinition_bindingStrength } from "./Elementdefinition_bindingStrength";
import { Extension } from "./Extension";

export interface ElementDefinition_Binding {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    strength: Elementdefinition_bindingStrength | null | undefined;
    description: string | null | undefined;
    valueSet: canonical | null | undefined;
}
