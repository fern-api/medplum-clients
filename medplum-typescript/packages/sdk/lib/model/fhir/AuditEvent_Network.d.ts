import { Auditevent_networkType } from "./Auditevent_networkType";
import { Extension } from "./Extension";
export interface AuditEvent_Network {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    address: string | null | undefined;
    type: Auditevent_networkType | null | undefined;
}
