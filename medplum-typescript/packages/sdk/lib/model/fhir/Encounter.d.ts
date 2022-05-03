import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Coding } from "./Coding";
import { Duration } from "./Duration";
import { EncounterStatus } from "./EncounterStatus";
import { Encounter_ClassHistory } from "./Encounter_ClassHistory";
import { Encounter_Diagnosis } from "./Encounter_Diagnosis";
import { Encounter_Hospitalization } from "./Encounter_Hospitalization";
import { Encounter_Location } from "./Encounter_Location";
import { Encounter_Participant } from "./Encounter_Participant";
import { Encounter_StatusHistory } from "./Encounter_StatusHistory";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
export interface Encounter {
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
    status: EncounterStatus | null | undefined;
    statusHistory: Encounter_StatusHistory[] | null | undefined;
    class: Coding;
    classHistory: Encounter_ClassHistory[] | null | undefined;
    type: CodeableConcept[] | null | undefined;
    serviceType: CodeableConcept | null | undefined;
    priority: CodeableConcept | null | undefined;
    subject: Reference | null | undefined;
    episodeOfCare: Reference[] | null | undefined;
    basedOn: Reference[] | null | undefined;
    participant: Encounter_Participant[] | null | undefined;
    appointment: Reference[] | null | undefined;
    period: Period | null | undefined;
    length: Duration | null | undefined;
    reasonCode: CodeableConcept[] | null | undefined;
    reasonReference: Reference[] | null | undefined;
    diagnosis: Encounter_Diagnosis[] | null | undefined;
    account: Reference[] | null | undefined;
    hospitalization: Encounter_Hospitalization | null | undefined;
    location: Encounter_Location[] | null | undefined;
    serviceProvider: Reference | null | undefined;
    partOf: Reference | null | undefined;
}
