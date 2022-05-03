import { Extension } from "./Extension";
import { Person_linkAssurance } from "./Person_linkAssurance";
import { Reference } from "./Reference";

export interface Person_Link {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    target: Reference;
    assurance: Person_linkAssurance | null | undefined;
}
