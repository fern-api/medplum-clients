import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { date } from "./date";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Money } from "./Money";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface PaymentNotice {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    status: code | null | undefined;
    request: Reference | null | undefined;
    response: Reference | null | undefined;
    created: dateTime | null | undefined;
    provider: Reference | null | undefined;
    payment: Reference;
    paymentDate: date | null | undefined;
    payee: Reference | null | undefined;
    recipient: Reference;
    amount: Money;
    paymentStatus: CodeableConcept | null | undefined;
}
