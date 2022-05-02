import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Reference } from "./Reference";

export interface CareTeam_Participant {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    role: CodeableConcept[] | null | undefined;
    member: Reference | null | undefined;
    onBehalfOf: Reference | null | undefined;
    period: Period | null | undefined;
}
