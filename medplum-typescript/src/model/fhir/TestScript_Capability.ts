import { canonical } from "./canonical";
import { Extension } from "./Extension";
import { uri } from "./uri";

export interface TestScript_Capability {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    required: boolean | null | undefined;
    validated: boolean | null | undefined;
    description: string | null | undefined;
    origin: number[] | null | undefined;
    destination: number | null | undefined;
    link: uri[] | null | undefined;
    capabilities: canonical;
}
