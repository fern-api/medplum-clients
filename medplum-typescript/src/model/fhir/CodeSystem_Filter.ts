import { code } from "./code";
import { Extension } from "./Extension";

export interface CodeSystem_Filter {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: code | null | undefined;
    description: string | null | undefined;
    operator: code[] | null | undefined;
    value: string | null | undefined;
}
