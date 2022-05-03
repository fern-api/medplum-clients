import { Extension } from "./Extension";
import { NarrativeStatus } from "./NarrativeStatus";
import { xhtml } from "./xhtml";
export interface Narrative {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    status: NarrativeStatus | null | undefined;
    div: xhtml;
}
