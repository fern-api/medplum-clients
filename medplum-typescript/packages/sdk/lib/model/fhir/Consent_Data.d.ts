import { Consent_dataMeaning } from "./Consent_dataMeaning";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface Consent_Data {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    meaning: Consent_dataMeaning | null | undefined;
    reference: Reference;
}
