import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";

export interface SubstanceSpecification_Official {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    authority: CodeableConcept | null | undefined;
    status: CodeableConcept | null | undefined;
    date: dateTime | null | undefined;
}
