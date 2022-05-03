import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Period } from "./Period";
import { Reference } from "./Reference";
export interface Practitioner_Qualification {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    code: CodeableConcept;
    period: Period | null | undefined;
    issuer: Reference | null | undefined;
}
