import { Coding } from "./Coding";
import { Extension } from "./Extension";
export interface CodeableConcept {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    coding: Coding[] | null | undefined;
    text: string | null | undefined;
}
