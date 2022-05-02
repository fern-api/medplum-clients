import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Money } from "./Money";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";
import { unsignedInt } from "./unsignedInt";

export interface Contract_ValuedItem {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    entityCodeableConcept: CodeableConcept | null | undefined;
    entityReference: Reference | null | undefined;
    identifier: Identifier | null | undefined;
    effectiveTime: dateTime | null | undefined;
    quantity: Quantity | null | undefined;
    unitPrice: Money | null | undefined;
    factor: decimal | null | undefined;
    points: decimal | null | undefined;
    net: Money | null | undefined;
    payment: string | null | undefined;
    paymentDate: dateTime | null | undefined;
    responsible: Reference | null | undefined;
    recipient: Reference | null | undefined;
    linkId: string[] | null | undefined;
    securityLabelNumber: unsignedInt[] | null | undefined;
}
