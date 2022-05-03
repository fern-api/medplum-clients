import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Range } from "./Range";
export interface Population {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    ageRange: Range | null | undefined;
    ageCodeableConcept: CodeableConcept | null | undefined;
    gender: CodeableConcept | null | undefined;
    race: CodeableConcept | null | undefined;
    physiologicalCondition: CodeableConcept | null | undefined;
}
