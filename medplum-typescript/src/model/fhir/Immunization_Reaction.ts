import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface Immunization_Reaction {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    date: dateTime | null | undefined;
    detail: Reference | null | undefined;
    reported: boolean | null | undefined;
}
