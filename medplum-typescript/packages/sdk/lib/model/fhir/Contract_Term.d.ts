import { CodeableConcept } from "./CodeableConcept";
import { Contract_Action } from "./Contract_Action";
import { Contract_Asset } from "./Contract_Asset";
import { Contract_Offer } from "./Contract_Offer";
import { Contract_SecurityLabel } from "./Contract_SecurityLabel";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Period } from "./Period";
import { Reference } from "./Reference";
export interface Contract_Term {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier | null | undefined;
    issued: dateTime | null | undefined;
    applies: Period | null | undefined;
    topicCodeableConcept: CodeableConcept | null | undefined;
    topicReference: Reference | null | undefined;
    type: CodeableConcept | null | undefined;
    subType: CodeableConcept | null | undefined;
    text: string | null | undefined;
    securityLabel: Contract_SecurityLabel[] | null | undefined;
    offer: Contract_Offer;
    asset: Contract_Asset[] | null | undefined;
    action: Contract_Action[] | null | undefined;
    group: Contract_Term[] | null | undefined;
}
