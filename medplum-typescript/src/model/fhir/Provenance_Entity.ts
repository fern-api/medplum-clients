import { Extension } from "./Extension";
import { Provenance_Agent } from "./Provenance_Agent";
import { Provenance_entityRole } from "./Provenance_entityRole";
import { Reference } from "./Reference";

export interface Provenance_Entity {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    role: Provenance_entityRole | null | undefined;
    what: Reference;
    agent: Provenance_Agent[] | null | undefined;
}
