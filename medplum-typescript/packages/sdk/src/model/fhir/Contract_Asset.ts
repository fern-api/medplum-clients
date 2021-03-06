import { CodeableConcept } from "./CodeableConcept";
import { Coding } from "./Coding";
import { Contract_Answer } from "./Contract_Answer";
import { Contract_Context } from "./Contract_Context";
import { Contract_ValuedItem } from "./Contract_ValuedItem";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { unsignedInt } from "./unsignedInt";

export interface Contract_Asset {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    scope: CodeableConcept | null | undefined;
    type: CodeableConcept[] | null | undefined;
    typeReference: Reference[] | null | undefined;
    subtype: CodeableConcept[] | null | undefined;
    relationship: Coding | null | undefined;
    context: Contract_Context[] | null | undefined;
    condition: string | null | undefined;
    periodType: CodeableConcept[] | null | undefined;
    period: Period[] | null | undefined;
    usePeriod: Period[] | null | undefined;
    text: string | null | undefined;
    linkId: string[] | null | undefined;
    answer: Contract_Answer[] | null | undefined;
    securityLabelNumber: unsignedInt[] | null | undefined;
    valuedItem: Contract_ValuedItem[] | null | undefined;
}
