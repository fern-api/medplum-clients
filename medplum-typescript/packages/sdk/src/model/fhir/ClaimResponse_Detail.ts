import { ClaimResponse_Adjudication } from "./ClaimResponse_Adjudication";
import { ClaimResponse_SubDetail } from "./ClaimResponse_SubDetail";
import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";

export interface ClaimResponse_Detail {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    detailSequence: positiveInt | null | undefined;
    noteNumber: positiveInt[] | null | undefined;
    adjudication: ClaimResponse_Adjudication[];
    subDetail: ClaimResponse_SubDetail[] | null | undefined;
}
