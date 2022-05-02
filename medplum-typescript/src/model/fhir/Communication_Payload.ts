import { Attachment } from "./Attachment";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface Communication_Payload {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    contentString: string | null | undefined;
    contentAttachment: Attachment | null | undefined;
    contentReference: Reference | null | undefined;
}
