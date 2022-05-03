import { ContactPoint } from "./ContactPoint";
import { Extension } from "./Extension";
import { url } from "./url";
export interface MessageHeader_Source {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    software: string | null | undefined;
    version: string | null | undefined;
    contact: ContactPoint | null | undefined;
    endpoint: url | null | undefined;
}
