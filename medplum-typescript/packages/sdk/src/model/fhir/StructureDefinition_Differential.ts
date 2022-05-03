import { ElementDefinition } from "./ElementDefinition";
import { Extension } from "./Extension";

export interface StructureDefinition_Differential {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    element: ElementDefinition[];
}
