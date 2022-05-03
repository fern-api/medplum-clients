import { code } from "./code";
import { Extension } from "./Extension";

export interface ImplementationGuide_Template {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: code | null | undefined;
    source: string | null | undefined;
    scope: string | null | undefined;
}
