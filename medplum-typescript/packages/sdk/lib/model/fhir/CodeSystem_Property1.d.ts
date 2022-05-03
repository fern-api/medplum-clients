import { code } from "./code";
import { Coding } from "./Coding";
import { Extension } from "./Extension";
export interface CodeSystem_Property1 {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: code | null | undefined;
    valueCode: string | null | undefined;
    valueCoding: Coding | null | undefined;
    valueString: string | null | undefined;
    valueInteger: number | null | undefined;
    valueBoolean: boolean | null | undefined;
    valueDateTime: string | null | undefined;
    valueDecimal: number | null | undefined;
}
