import { Attachment } from "./Attachment";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface Contract_Friendly {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    contentAttachment: Attachment | null | undefined;
    contentReference: Reference | null | undefined;
}
