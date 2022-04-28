import { Extension } from "./Extension";
import { QuestionnaireResponse_Answer } from "./QuestionnaireResponse_Answer";
import { QuestionnaireResponse_Item } from "./QuestionnaireResponse_Item";
import { uri } from "./uri";

export interface QuestionnaireResponse_Item {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    linkId: string | null | undefined;
    definition: uri | null | undefined;
    text: string | null | undefined;
    answer: QuestionnaireResponse_Answer[] | null | undefined;
    item: QuestionnaireResponse_Item[] | null | undefined;
}
