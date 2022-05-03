import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Questionnaire_enablewhenOperator } from "./Questionnaire_enablewhenOperator";
import { Reference } from "./Reference";

export interface Questionnaire_EnableWhen {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    question: string | null | undefined;
    operator: Questionnaire_enablewhenOperator | null | undefined;
    answerBoolean: boolean | null | undefined;
    answerDecimal: number | null | undefined;
    answerInteger: number | null | undefined;
    answerDate: string | null | undefined;
    answerDateTime: string | null | undefined;
    answerTime: string | null | undefined;
    answerString: string | null | undefined;
    answerCoding: Coding | null | undefined;
    answerQuantity: Quantity | null | undefined;
    answerReference: Reference | null | undefined;
}
