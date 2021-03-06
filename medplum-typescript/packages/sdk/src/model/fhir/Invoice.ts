import { Annotation } from "./Annotation";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { InvoiceStatus } from "./InvoiceStatus";
import { Invoice_LineItem } from "./Invoice_LineItem";
import { Invoice_Participant } from "./Invoice_Participant";
import { Invoice_PriceComponent } from "./Invoice_PriceComponent";
import { markdown } from "./markdown";
import { Meta } from "./Meta";
import { Money } from "./Money";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface Invoice {
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
    status: InvoiceStatus | null | undefined;
    cancelledReason: string | null | undefined;
    type: CodeableConcept | null | undefined;
    subject: Reference | null | undefined;
    recipient: Reference | null | undefined;
    date: dateTime | null | undefined;
    participant: Invoice_Participant[] | null | undefined;
    issuer: Reference | null | undefined;
    account: Reference | null | undefined;
    lineItem: Invoice_LineItem[] | null | undefined;
    totalPriceComponent: Invoice_PriceComponent[] | null | undefined;
    totalNet: Money | null | undefined;
    totalGross: Money | null | undefined;
    paymentTerms: markdown | null | undefined;
    note: Annotation[] | null | undefined;
}
