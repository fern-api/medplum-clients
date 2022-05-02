import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";

export interface ClaimResponse_Error {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    itemSequence: positiveInt | null | undefined;
    detailSequence: positiveInt | null | undefined;
    subDetailSequence: positiveInt | null | undefined;
    code: CodeableConcept;
}
