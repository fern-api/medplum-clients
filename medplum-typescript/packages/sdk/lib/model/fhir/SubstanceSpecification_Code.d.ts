import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface SubstanceSpecification_Code {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept | null | undefined;
    status: CodeableConcept | null | undefined;
    statusDate: dateTime | null | undefined;
    comment: string | null | undefined;
    source: Reference[] | null | undefined;
}
