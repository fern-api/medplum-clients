import { Extension } from "./Extension";

export interface AuditEvent_Detail {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: string | null | undefined;
    valueString: string | null | undefined;
    valueBase64Binary: string | null | undefined;
}
