import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";
import { Reference } from "./Reference";

export interface Claim_CareTeam {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    sequence: positiveInt | null | undefined;
    provider: Reference;
    responsible: boolean | null | undefined;
    role: CodeableConcept | null | undefined;
    qualification: CodeableConcept | null | undefined;
}
