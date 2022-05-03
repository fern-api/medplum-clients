import { Attachment } from "./Attachment";
import { canonical } from "./canonical";
import { Extension } from "./Extension";
import { markdown } from "./markdown";
import { RelatedartifactType } from "./RelatedartifactType";
import { url } from "./url";
export interface RelatedArtifact {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    type: RelatedartifactType | null | undefined;
    label: string | null | undefined;
    display: string | null | undefined;
    citation: markdown | null | undefined;
    url: url | null | undefined;
    document: Attachment | null | undefined;
    resource: canonical | null | undefined;
}
