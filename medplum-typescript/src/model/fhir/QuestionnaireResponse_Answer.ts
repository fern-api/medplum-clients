import { Attachment } from "./Attachment";
import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { QuestionnaireResponse_Item } from "./QuestionnaireResponse_Item";
import { Reference } from "./Reference";

export interface QuestionnaireResponse_Answer {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    valueBoolean: boolean | null | undefined;
    valueDecimal: number | null | undefined;
    valueInteger: number | null | undefined;
    valueDate: string | null | undefined;
    valueDateTime: string | null | undefined;
    valueTime: string | null | undefined;
    valueString: string | null | undefined;
    valueUri: string | null | undefined;
    valueAttachment: Attachment | null | undefined;
    valueCoding: Coding | null | undefined;
    valueQuantity: Quantity | null | undefined;
    valueReference: Reference | null | undefined;
    item: QuestionnaireResponse_Item[] | null | undefined;
}
