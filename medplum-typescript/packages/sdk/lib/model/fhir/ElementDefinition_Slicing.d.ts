import { ElementDefinition_Discriminator } from "./ElementDefinition_Discriminator";
import { Elementdefinition_slicingRules } from "./Elementdefinition_slicingRules";
import { Extension } from "./Extension";
export interface ElementDefinition_Slicing {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    discriminator: ElementDefinition_Discriminator[] | null | undefined;
    description: string | null | undefined;
    ordered: boolean | null | undefined;
    rules: Elementdefinition_slicingRules | null | undefined;
}
