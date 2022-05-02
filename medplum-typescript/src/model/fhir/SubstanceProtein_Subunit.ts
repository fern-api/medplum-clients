import { Attachment } from "./Attachment";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";

export interface SubstanceProtein_Subunit {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    subunit: number | null | undefined;
    sequence: string | null | undefined;
    length: number | null | undefined;
    sequenceAttachment: Attachment | null | undefined;
    nTerminalModificationId: Identifier | null | undefined;
    nTerminalModification: string | null | undefined;
    cTerminalModificationId: Identifier | null | undefined;
    cTerminalModification: string | null | undefined;
}
