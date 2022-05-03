import { Extension } from "./Extension";
import { Linkage_itemType } from "./Linkage_itemType";
import { Reference } from "./Reference";
export interface Linkage_Item {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Linkage_itemType | null | undefined;
    resource: Reference;
}
