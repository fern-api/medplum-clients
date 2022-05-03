import { Composition_attesterMode } from "./Composition_attesterMode";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface Composition_Attester {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    mode: Composition_attesterMode | null | undefined;
    time: dateTime | null | undefined;
    party: Reference | null | undefined;
}
