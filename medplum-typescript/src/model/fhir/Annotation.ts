import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { markdown } from "./markdown";
import { Reference } from "./Reference";

export interface Annotation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    authorReference: Reference | null | undefined;
    authorString: string | null | undefined;
    time: dateTime | null | undefined;
    text: markdown | null | undefined;
}
