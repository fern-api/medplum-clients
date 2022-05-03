import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";

export interface ActivityDefinition_Participant {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: code | null | undefined;
    role: CodeableConcept | null | undefined;
}
