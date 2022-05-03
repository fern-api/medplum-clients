import { Extension } from "./Extension";
import { instant } from "./instant";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
export interface Bundle_Response {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    status: string | null | undefined;
    location: uri | null | undefined;
    etag: string | null | undefined;
    lastModified: instant | null | undefined;
    outcome: ResourceList | null | undefined;
}
