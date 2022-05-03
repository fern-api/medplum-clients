import { base64Binary } from "./base64Binary";
import { code } from "./code";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { unsignedInt } from "./unsignedInt";
import { url } from "./url";
export interface Attachment {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    contentType: code | null | undefined;
    language: code | null | undefined;
    data: base64Binary | null | undefined;
    url: url | null | undefined;
    size: unsignedInt | null | undefined;
    hash: base64Binary | null | undefined;
    title: string | null | undefined;
    creation: dateTime | null | undefined;
}
