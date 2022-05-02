import { code } from "./code";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Reference } from "./Reference";

export interface Composition_RelatesTo {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: code | null | undefined;
    targetIdentifier: Identifier | null | undefined;
    targetReference: Reference | null | undefined;
}
