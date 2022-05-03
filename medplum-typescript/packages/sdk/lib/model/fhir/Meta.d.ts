import { canonical } from "./canonical";
import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { id } from "./id";
import { instant } from "./instant";
import { Reference } from "./Reference";
import { uri } from "./uri";
export interface Meta {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    versionId: id | null | undefined;
    lastUpdated: instant | null | undefined;
    source: uri | null | undefined;
    profile: canonical[] | null | undefined;
    security: Coding[] | null | undefined;
    tag: Coding[] | null | undefined;
    project: uri | null | undefined;
    author: Reference | null | undefined;
}
