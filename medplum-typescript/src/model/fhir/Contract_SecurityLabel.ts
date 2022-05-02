import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { unsignedInt } from "./unsignedInt";

export interface Contract_SecurityLabel {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    number: unsignedInt[] | null | undefined;
    classification: Coding;
    category: Coding[] | null | undefined;
    control: Coding[] | null | undefined;
}
