import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Plandefinition_participantType } from "./Plandefinition_participantType";
export interface PlanDefinition_Participant {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Plandefinition_participantType | null | undefined;
    role: CodeableConcept | null | undefined;
}
