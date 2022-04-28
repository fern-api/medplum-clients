import { Extension } from "./Extension";
import { id } from "./id";
import { Messageheader_responseCode } from "./Messageheader_responseCode";
import { Reference } from "./Reference";

export interface MessageHeader_Response {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: id | null | undefined;
    code: Messageheader_responseCode | null | undefined;
    details: Reference | null | undefined;
}
