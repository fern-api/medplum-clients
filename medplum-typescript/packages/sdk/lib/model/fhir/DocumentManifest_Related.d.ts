import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Reference } from "./Reference";
export interface DocumentManifest_Related {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier | null | undefined;
    ref: Reference | null | undefined;
}
