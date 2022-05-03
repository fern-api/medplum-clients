import { canonical } from "./canonical";
import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { Questionnaire_AnswerOption } from "./Questionnaire_AnswerOption";
import { Questionnaire_EnableWhen } from "./Questionnaire_EnableWhen";
import { Questionnaire_Initial } from "./Questionnaire_Initial";
import { Questionnaire_itemEnablebehavior } from "./Questionnaire_itemEnablebehavior";
import { Questionnaire_itemType } from "./Questionnaire_itemType";
import { uri } from "./uri";

export interface Questionnaire_Item {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    linkId: string | null | undefined;
    definition: uri | null | undefined;
    code: Coding[] | null | undefined;
    prefix: string | null | undefined;
    text: string | null | undefined;
    type: Questionnaire_itemType | null | undefined;
    enableWhen: Questionnaire_EnableWhen[] | null | undefined;
    enableBehavior: Questionnaire_itemEnablebehavior | null | undefined;
    required: boolean | null | undefined;
    repeats: boolean | null | undefined;
    readOnly: boolean | null | undefined;
    maxLength: number | null | undefined;
    answerValueSet: canonical | null | undefined;
    answerOption: Questionnaire_AnswerOption[] | null | undefined;
    initial: Questionnaire_Initial[] | null | undefined;
    item: Questionnaire_Item[] | null | undefined;
}
