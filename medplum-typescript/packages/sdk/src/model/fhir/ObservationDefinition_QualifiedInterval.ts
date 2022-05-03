import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Observationdefinition_qualifiedintervalCategory } from "./Observationdefinition_qualifiedintervalCategory";
import { Observationdefinition_qualifiedintervalGender } from "./Observationdefinition_qualifiedintervalGender";
import { Range } from "./Range";

export interface ObservationDefinition_QualifiedInterval {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    category:
        | Observationdefinition_qualifiedintervalCategory
        | null
        | undefined;
    range: Range | null | undefined;
    context: CodeableConcept | null | undefined;
    appliesTo: CodeableConcept[] | null | undefined;
    gender: Observationdefinition_qualifiedintervalGender | null | undefined;
    age: Range | null | undefined;
    gestationalAge: Range | null | undefined;
    condition: string | null | undefined;
}
