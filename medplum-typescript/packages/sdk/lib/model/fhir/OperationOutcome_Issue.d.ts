import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Operationoutcome_issueCode } from "./Operationoutcome_issueCode";
import { Operationoutcome_issueSeverity } from "./Operationoutcome_issueSeverity";
export interface OperationOutcome_Issue {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    severity: Operationoutcome_issueSeverity | null | undefined;
    code: Operationoutcome_issueCode | null | undefined;
    details: CodeableConcept | null | undefined;
    diagnostics: string | null | undefined;
    location: string[] | null | undefined;
    expression: string[] | null | undefined;
}
