import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface AuditEvent_Source {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    site: string | null | undefined;
    observer: Reference;
    type: Coding[] | null | undefined;
}
