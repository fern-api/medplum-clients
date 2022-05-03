import { Bundle_requestMethod } from "./Bundle_requestMethod";
import { Extension } from "./Extension";
import { instant } from "./instant";
import { uri } from "./uri";

export interface Bundle_Request {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    method: Bundle_requestMethod | null | undefined;
    url: uri | null | undefined;
    ifNoneMatch: string | null | undefined;
    ifModifiedSince: instant | null | undefined;
    ifMatch: string | null | undefined;
    ifNoneExist: string | null | undefined;
}
