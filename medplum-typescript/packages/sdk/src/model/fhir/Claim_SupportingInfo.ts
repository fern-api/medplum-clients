import { Attachment } from "./Attachment";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { positiveInt } from "./positiveInt";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";

export interface Claim_SupportingInfo {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    sequence: positiveInt | null | undefined;
    category: CodeableConcept;
    code: CodeableConcept | null | undefined;
    timingDate: string | null | undefined;
    timingPeriod: Period | null | undefined;
    valueBoolean: boolean | null | undefined;
    valueString: string | null | undefined;
    valueQuantity: Quantity | null | undefined;
    valueAttachment: Attachment | null | undefined;
    valueReference: Reference | null | undefined;
    reason: CodeableConcept | null | undefined;
}
