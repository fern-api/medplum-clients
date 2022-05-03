import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface DiagnosticReport_Media {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    comment: string | null | undefined;
    link: Reference;
}
