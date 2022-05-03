import { Extension } from "./Extension";
import { Reference } from "./Reference";
import { url } from "./url";
export interface ImplementationGuide_Resource1 {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    reference: Reference;
    exampleBoolean: boolean | null | undefined;
    exampleCanonical: string | null | undefined;
    relativePath: url | null | undefined;
}
