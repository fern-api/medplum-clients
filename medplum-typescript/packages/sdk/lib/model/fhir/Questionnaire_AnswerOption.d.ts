import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface Questionnaire_AnswerOption {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    valueInteger: number | null | undefined;
    valueDate: string | null | undefined;
    valueTime: string | null | undefined;
    valueString: string | null | undefined;
    valueCoding: Coding | null | undefined;
    valueReference: Reference | null | undefined;
    initialSelected: boolean | null | undefined;
}
