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
import { PaymentreconciliationOutcome } from "./PaymentreconciliationOutcome";
import { PaymentReconciliation_Detail } from "./PaymentReconciliation_Detail";
import { PaymentReconciliation_ProcessNote } from "./PaymentReconciliation_ProcessNote";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
export interface PaymentReconciliation {
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
    period: Period | null | undefined;
    created: dateTime | null | undefined;
    paymentIssuer: Reference | null | undefined;
    request: Reference | null | undefined;
    requestor: Reference | null | undefined;
    outcome: PaymentreconciliationOutcome | null | undefined;
    disposition: string | null | undefined;
    paymentDate: date | null | undefined;
    paymentAmount: Money;
    paymentIdentifier: Identifier | null | undefined;
    detail: PaymentReconciliation_Detail[] | null | undefined;
    formCode: CodeableConcept | null | undefined;
    processNote: PaymentReconciliation_ProcessNote[] | null | undefined;
}
