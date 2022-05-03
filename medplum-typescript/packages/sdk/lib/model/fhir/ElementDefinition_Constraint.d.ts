import { canonical } from "./canonical";
import { Elementdefinition_constraintSeverity } from "./Elementdefinition_constraintSeverity";
import { Extension } from "./Extension";
import { id } from "./id";
export interface ElementDefinition_Constraint {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    key: id | null | undefined;
    requirements: string | null | undefined;
    severity: Elementdefinition_constraintSeverity | null | undefined;
    human: string | null | undefined;
    expression: string | null | undefined;
    xpath: string | null | undefined;
    source: canonical | null | undefined;
}
