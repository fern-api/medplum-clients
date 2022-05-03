import { Extension } from "./Extension";
import { Reference } from "./Reference";
import { url } from "./url";
export interface MessageHeader_Destination {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    target: Reference | null | undefined;
    endpoint: url | null | undefined;
    receiver: Reference | null | undefined;
}
