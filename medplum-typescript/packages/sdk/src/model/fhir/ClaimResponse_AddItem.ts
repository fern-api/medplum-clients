import { Address } from "./Address";
import { ClaimResponse_Adjudication } from "./ClaimResponse_Adjudication";
import { ClaimResponse_Detail1 } from "./ClaimResponse_Detail1";
import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { Money } from "./Money";
import { Period } from "./Period";
import { positiveInt } from "./positiveInt";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";

export interface ClaimResponse_AddItem {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    itemSequence: positiveInt[] | null | undefined;
    detailSequence: positiveInt[] | null | undefined;
    subdetailSequence: positiveInt[] | null | undefined;
    provider: Reference[] | null | undefined;
    productOrService: CodeableConcept;
    modifier: CodeableConcept[] | null | undefined;
    programCode: CodeableConcept[] | null | undefined;
    servicedDate: string | null | undefined;
    servicedPeriod: Period | null | undefined;
    locationCodeableConcept: CodeableConcept | null | undefined;
    locationAddress: Address | null | undefined;
    locationReference: Reference | null | undefined;
    quantity: Quantity | null | undefined;
    unitPrice: Money | null | undefined;
    factor: decimal | null | undefined;
    net: Money | null | undefined;
    bodySite: CodeableConcept | null | undefined;
    subSite: CodeableConcept[] | null | undefined;
    noteNumber: positiveInt[] | null | undefined;
    adjudication: ClaimResponse_Adjudication[];
    detail: ClaimResponse_Detail1[] | null | undefined;
}
