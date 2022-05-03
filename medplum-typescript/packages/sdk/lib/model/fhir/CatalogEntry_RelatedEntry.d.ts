import { Catalogentry_relatedentryRelationtype } from "./Catalogentry_relatedentryRelationtype";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface CatalogEntry_RelatedEntry {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    relationtype: Catalogentry_relatedentryRelationtype | null | undefined;
    item: Reference;
}
