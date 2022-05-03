import { Extension } from "./Extension";
export interface StructureMap_Parameter {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    valueId: string | null | undefined;
    valueString: string | null | undefined;
    valueBoolean: boolean | null | undefined;
    valueInteger: number | null | undefined;
    valueDecimal: number | null | undefined;
}
