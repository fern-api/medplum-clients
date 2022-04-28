import { CodeableConcept } from "./CodeableConcept";
import { Explanationofbenefit_processnoteType } from "./Explanationofbenefit_processnoteType";
import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";

export interface ExplanationOfBenefit_ProcessNote {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    number: positiveInt | null | undefined;
    type: Explanationofbenefit_processnoteType | null | undefined;
    text: string | null | undefined;
    language: CodeableConcept | null | undefined;
}
