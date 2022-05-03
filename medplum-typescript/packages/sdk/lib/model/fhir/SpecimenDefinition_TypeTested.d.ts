import { CodeableConcept } from "./CodeableConcept";
import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { SpecimenDefinition_Container } from "./SpecimenDefinition_Container";
import { SpecimenDefinition_Handling } from "./SpecimenDefinition_Handling";
import { Specimendefinition_typetestedPreference } from "./Specimendefinition_typetestedPreference";
export interface SpecimenDefinition_TypeTested {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    isDerived: boolean | null | undefined;
    type: CodeableConcept | null | undefined;
    preference: Specimendefinition_typetestedPreference | null | undefined;
    container: SpecimenDefinition_Container | null | undefined;
    requirement: string | null | undefined;
    retentionTime: Duration | null | undefined;
    rejectionCriterion: CodeableConcept[] | null | undefined;
    handling: SpecimenDefinition_Handling[] | null | undefined;
}
