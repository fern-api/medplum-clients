import { ClaimResponse_Adjudication } from "./ClaimResponse_Adjudication";
import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";

export interface ClaimResponse_SubDetail {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    subDetailSequence: positiveInt | null | undefined;
    noteNumber: positiveInt[] | null | undefined;
    adjudication: ClaimResponse_Adjudication[] | null | undefined;
}
