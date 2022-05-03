import { CodeableConcept } from "./CodeableConcept";
import { Contract_Answer } from "./Contract_Answer";
import { Contract_Party } from "./Contract_Party";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Reference } from "./Reference";
import { unsignedInt } from "./unsignedInt";

export interface Contract_Offer {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    party: Contract_Party[] | null | undefined;
    topic: Reference | null | undefined;
    type: CodeableConcept | null | undefined;
    decision: CodeableConcept | null | undefined;
    decisionMode: CodeableConcept[] | null | undefined;
    answer: Contract_Answer[] | null | undefined;
    text: string | null | undefined;
    linkId: string[] | null | undefined;
    securityLabelNumber: unsignedInt[] | null | undefined;
}
