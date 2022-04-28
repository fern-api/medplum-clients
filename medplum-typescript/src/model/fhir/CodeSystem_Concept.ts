import { code } from "./code";
import { CodeSystem_Concept } from "./CodeSystem_Concept";
import { CodeSystem_Designation } from "./CodeSystem_Designation";
import { CodeSystem_Property1 } from "./CodeSystem_Property1";
import { Extension } from "./Extension";

export interface CodeSystem_Concept {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: code | null | undefined;
    display: string | null | undefined;
    definition: string | null | undefined;
    designation: CodeSystem_Designation[] | null | undefined;
    property: CodeSystem_Property1[] | null | undefined;
    concept: CodeSystem_Concept[] | null | undefined;
}
