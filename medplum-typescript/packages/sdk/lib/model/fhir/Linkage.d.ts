import { code } from "./code";
import { Extension } from "./Extension";
import { id } from "./id";
import { Linkage_Item } from "./Linkage_Item";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
export interface Linkage {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    active: boolean | null | undefined;
    author: Reference | null | undefined;
    item: Linkage_Item[];
}
