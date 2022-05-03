import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { markdown } from "./markdown";
export interface CapabilityStatement_Security {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    cors: boolean | null | undefined;
    service: CodeableConcept[] | null | undefined;
    description: markdown | null | undefined;
}
