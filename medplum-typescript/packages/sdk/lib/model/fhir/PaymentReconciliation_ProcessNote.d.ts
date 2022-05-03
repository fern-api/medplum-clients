import { Extension } from "./Extension";
import { Paymentreconciliation_processnoteType } from "./Paymentreconciliation_processnoteType";
export interface PaymentReconciliation_ProcessNote {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Paymentreconciliation_processnoteType | null | undefined;
    text: string | null | undefined;
}
