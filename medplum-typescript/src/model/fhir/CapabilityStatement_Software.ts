import { dateTime } from "./dateTime";
import { Extension } from "./Extension";

export interface CapabilityStatement_Software {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    version: string | null | undefined;
    releaseDate: dateTime | null | undefined;
}
