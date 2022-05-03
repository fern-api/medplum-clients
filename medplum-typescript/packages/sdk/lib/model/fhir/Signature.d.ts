import { base64Binary } from "./base64Binary";
import { code } from "./code";
import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { instant } from "./instant";
import { Reference } from "./Reference";
export interface Signature {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    type: Coding[];
    when: instant | null | undefined;
    who: Reference;
    onBehalfOf: Reference | null | undefined;
    targetFormat: code | null | undefined;
    sigFormat: code | null | undefined;
    data: base64Binary | null | undefined;
}
