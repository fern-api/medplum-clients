import { Elementdefinition_discriminatorType } from "./Elementdefinition_discriminatorType";
import { Extension } from "./Extension";

export interface ElementDefinition_Discriminator {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Elementdefinition_discriminatorType | null | undefined;
    path: string | null | undefined;
}
