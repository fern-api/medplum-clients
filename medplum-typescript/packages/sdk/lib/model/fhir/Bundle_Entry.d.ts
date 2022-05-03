import { Bundle_Link } from "./Bundle_Link";
import { Bundle_Request } from "./Bundle_Request";
import { Bundle_Response } from "./Bundle_Response";
import { Bundle_Search } from "./Bundle_Search";
import { Extension } from "./Extension";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
export interface Bundle_Entry {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    link: Bundle_Link[] | null | undefined;
    fullUrl: uri | null | undefined;
    resource: ResourceList | null | undefined;
    search: Bundle_Search | null | undefined;
    request: Bundle_Request | null | undefined;
    response: Bundle_Response | null | undefined;
}
