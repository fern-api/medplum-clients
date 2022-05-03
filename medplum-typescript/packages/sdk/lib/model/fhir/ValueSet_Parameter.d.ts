import { Extension } from "./Extension";
export interface ValueSet_Parameter {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    valueString: string | null | undefined;
    valueBoolean: boolean | null | undefined;
    valueInteger: number | null | undefined;
    valueDecimal: number | null | undefined;
    valueUri: string | null | undefined;
    valueCode: string | null | undefined;
    valueDateTime: string | null | undefined;
}
