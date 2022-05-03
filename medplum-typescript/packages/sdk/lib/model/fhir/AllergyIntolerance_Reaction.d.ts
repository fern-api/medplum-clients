import { Allergyintolerance_reactionSeverity } from "./Allergyintolerance_reactionSeverity";
import { Annotation } from "./Annotation";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
export interface AllergyIntolerance_Reaction {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    substance: CodeableConcept | null | undefined;
    manifestation: CodeableConcept[];
    description: string | null | undefined;
    onset: dateTime | null | undefined;
    severity: Allergyintolerance_reactionSeverity | null | undefined;
    exposureRoute: CodeableConcept | null | undefined;
    note: Annotation[] | null | undefined;
}
