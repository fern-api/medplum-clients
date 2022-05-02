import { ClaimResponse_Adjudication } from "./ClaimResponse_Adjudication";
import { ClaimResponse_Detail } from "./ClaimResponse_Detail";
import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";

export interface ClaimResponse_Item {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    itemSequence: positiveInt | null | undefined;
    noteNumber: positiveInt[] | null | undefined;
    adjudication: ClaimResponse_Adjudication[];
    detail: ClaimResponse_Detail[] | null | undefined;
}
