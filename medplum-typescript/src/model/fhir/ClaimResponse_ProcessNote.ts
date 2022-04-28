import { Claimresponse_processnoteType } from "./Claimresponse_processnoteType";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";

export interface ClaimResponse_ProcessNote {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    number: positiveInt | null | undefined;
    type: Claimresponse_processnoteType | null | undefined;
    text: string | null | undefined;
    language: CodeableConcept | null | undefined;
}
