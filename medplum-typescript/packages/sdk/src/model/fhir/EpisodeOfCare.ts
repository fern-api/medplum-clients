import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { EpisodeofcareStatus } from "./EpisodeofcareStatus";
import { EpisodeOfCare_Diagnosis } from "./EpisodeOfCare_Diagnosis";
import { EpisodeOfCare_StatusHistory } from "./EpisodeOfCare_StatusHistory";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface EpisodeOfCare {
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
    status: EpisodeofcareStatus | null | undefined;
    statusHistory: EpisodeOfCare_StatusHistory[] | null | undefined;
    type: CodeableConcept[] | null | undefined;
    diagnosis: EpisodeOfCare_Diagnosis[] | null | undefined;
    patient: Reference;
    managingOrganization: Reference | null | undefined;
    period: Period | null | undefined;
    referralRequest: Reference[] | null | undefined;
    careManager: Reference | null | undefined;
    team: Reference[] | null | undefined;
    account: Reference[] | null | undefined;
}
