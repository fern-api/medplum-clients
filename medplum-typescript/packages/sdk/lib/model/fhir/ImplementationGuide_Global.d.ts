import { canonical } from "./canonical";
import { code } from "./code";
import { Extension } from "./Extension";
export interface ImplementationGuide_Global {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: code | null | undefined;
    profile: canonical;
}
