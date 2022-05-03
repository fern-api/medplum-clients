import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
export interface Reference {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    reference: string | null | undefined;
    type: uri | null | undefined;
    identifier: Identifier | null | undefined;
    display: string | null | undefined;
    resource: ResourceList | null | undefined;
}
