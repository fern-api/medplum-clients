import { Annotation } from "./Annotation";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { MedicationAdministration_Dosage } from "./MedicationAdministration_Dosage";
import { MedicationAdministration_Performer } from "./MedicationAdministration_Performer";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MedicationAdministration {
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
    instantiates: uri[] | null | undefined;
    partOf: Reference[] | null | undefined;
    status: code | null | undefined;
    statusReason: CodeableConcept[] | null | undefined;
    category: CodeableConcept | null | undefined;
    medicationCodeableConcept: CodeableConcept | null | undefined;
    medicationReference: Reference | null | undefined;
    subject: Reference;
    context: Reference | null | undefined;
    supportingInformation: Reference[] | null | undefined;
    effectiveDateTime: string | null | undefined;
    effectivePeriod: Period | null | undefined;
    performer: MedicationAdministration_Performer[] | null | undefined;
    reasonCode: CodeableConcept[] | null | undefined;
    reasonReference: Reference[] | null | undefined;
    request: Reference | null | undefined;
    device: Reference[] | null | undefined;
    note: Annotation[] | null | undefined;
    dosage: MedicationAdministration_Dosage | null | undefined;
    eventHistory: Reference[] | null | undefined;
}
