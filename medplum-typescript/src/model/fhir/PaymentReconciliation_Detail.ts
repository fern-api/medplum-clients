import { CodeableConcept } from "./CodeableConcept";
import { date } from "./date";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Money } from "./Money";
import { Reference } from "./Reference";

export interface PaymentReconciliation_Detail {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier | null | undefined;
    predecessor: Identifier | null | undefined;
    type: CodeableConcept;
    request: Reference | null | undefined;
    submitter: Reference | null | undefined;
    response: Reference | null | undefined;
    date: date | null | undefined;
    responsible: Reference | null | undefined;
    payee: Reference | null | undefined;
    amount: Money | null | undefined;
}
