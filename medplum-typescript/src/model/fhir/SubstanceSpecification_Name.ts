import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
import { SubstanceSpecification_Name } from "./SubstanceSpecification_Name";
import { SubstanceSpecification_Official } from "./SubstanceSpecification_Official";

export interface SubstanceSpecification_Name {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    type: CodeableConcept | null | undefined;
    status: CodeableConcept | null | undefined;
    preferred: boolean | null | undefined;
    language: CodeableConcept[] | null | undefined;
    domain: CodeableConcept[] | null | undefined;
    jurisdiction: CodeableConcept[] | null | undefined;
    synonym: SubstanceSpecification_Name[] | null | undefined;
    translation: SubstanceSpecification_Name[] | null | undefined;
    official: SubstanceSpecification_Official[] | null | undefined;
    source: Reference[] | null | undefined;
}
