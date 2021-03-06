import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { DetectedissueSeverity } from "./DetectedissueSeverity";
import { DetectedIssue_Evidence } from "./DetectedIssue_Evidence";
import { DetectedIssue_Mitigation } from "./DetectedIssue_Mitigation";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface DetectedIssue {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    status: code | null | undefined;
    code: CodeableConcept | null | undefined;
    severity: DetectedissueSeverity | null | undefined;
    patient: Reference | null | undefined;
    identifiedDateTime: string | null | undefined;
    identifiedPeriod: Period | null | undefined;
    author: Reference | null | undefined;
    implicated: Reference[] | null | undefined;
    evidence: DetectedIssue_Evidence[] | null | undefined;
    detail: string | null | undefined;
    reference: uri | null | undefined;
    mitigation: DetectedIssue_Mitigation[] | null | undefined;
}
