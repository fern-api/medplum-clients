import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { Period } from "./Period";

export interface Encounter_ClassHistory {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    class: Coding;
    period: Period;
}
