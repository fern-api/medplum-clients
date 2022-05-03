import { Attachment } from "./Attachment";
import { Coding } from "./Coding";
import { Extension } from "./Extension";

export interface DocumentReference_Content {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    attachment: Attachment;
    format: Coding | null | undefined;
}
