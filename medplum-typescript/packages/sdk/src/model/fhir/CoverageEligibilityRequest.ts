import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { CoverageeligibilityrequestPurposeItem } from "./CoverageeligibilityrequestPurposeItem";
import { CoverageEligibilityRequest_Insurance } from "./CoverageEligibilityRequest_Insurance";
import { CoverageEligibilityRequest_Item } from "./CoverageEligibilityRequest_Item";
import { CoverageEligibilityRequest_SupportingInfo } from "./CoverageEligibilityRequest_SupportingInfo";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface CoverageEligibilityRequest {
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
    priority: CodeableConcept | null | undefined;
    purpose: CoverageeligibilityrequestPurposeItem[] | null | undefined;
    patient: Reference;
    servicedDate: string | null | undefined;
    servicedPeriod: Period | null | undefined;
    created: dateTime | null | undefined;
    enterer: Reference | null | undefined;
    provider: Reference | null | undefined;
    insurer: Reference;
    facility: Reference | null | undefined;
    supportingInfo:
        | CoverageEligibilityRequest_SupportingInfo[]
        | null
        | undefined;
    insurance: CoverageEligibilityRequest_Insurance[] | null | undefined;
    item: CoverageEligibilityRequest_Item[] | null | undefined;
}
