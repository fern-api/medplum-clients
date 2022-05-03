import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { IdentifierUse } from "./IdentifierUse";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { uri } from "./uri";

export interface Identifier {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    use: IdentifierUse | null | undefined;
    type: CodeableConcept | null | undefined;
    system: uri | null | undefined;
    value: string | null | undefined;
    period: Period | null | undefined;
    assigner: Reference | null | undefined;
}
