import { Documentreference_relatestoCode } from "./Documentreference_relatestoCode";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface DocumentReference_RelatesTo {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: Documentreference_relatestoCode | null | undefined;
    target: Reference;
}
