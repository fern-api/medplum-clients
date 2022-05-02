import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";

export interface MedicinalProduct_CountryLanguage {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    country: CodeableConcept;
    jurisdiction: CodeableConcept | null | undefined;
    language: CodeableConcept;
}
