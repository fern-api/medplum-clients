import { ClaimResponse_Adjudication } from "./ClaimResponse_Adjudication";
import { ClaimResponse_SubDetail1 } from "./ClaimResponse_SubDetail1";
import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { Money } from "./Money";
import { positiveInt } from "./positiveInt";
import { Quantity } from "./Quantity";

export interface ClaimResponse_Detail1 {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    productOrService: CodeableConcept;
    modifier: CodeableConcept[] | null | undefined;
    quantity: Quantity | null | undefined;
    unitPrice: Money | null | undefined;
    factor: decimal | null | undefined;
    net: Money | null | undefined;
    noteNumber: positiveInt[] | null | undefined;
    adjudication: ClaimResponse_Adjudication[];
    subDetail: ClaimResponse_SubDetail1[] | null | undefined;
}
