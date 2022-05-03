import { AdverseEvent_Causality } from "./AdverseEvent_Causality";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface AdverseEvent_SuspectEntity {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    instance: Reference;
    causality: AdverseEvent_Causality[] | null | undefined;
}
