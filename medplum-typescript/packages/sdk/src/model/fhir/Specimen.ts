import { Annotation } from "./Annotation";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { SpecimenStatus } from "./SpecimenStatus";
import { Specimen_Collection } from "./Specimen_Collection";
import { Specimen_Container } from "./Specimen_Container";
import { Specimen_Processing } from "./Specimen_Processing";
import { uri } from "./uri";

export interface Specimen {
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
    accessionIdentifier: Identifier | null | undefined;
    status: SpecimenStatus | null | undefined;
    type: CodeableConcept | null | undefined;
    subject: Reference | null | undefined;
    receivedTime: dateTime | null | undefined;
    parent: Reference[] | null | undefined;
    request: Reference[] | null | undefined;
    collection: Specimen_Collection | null | undefined;
    processing: Specimen_Processing[] | null | undefined;
    container: Specimen_Container[] | null | undefined;
    condition: CodeableConcept[] | null | undefined;
    note: Annotation[] | null | undefined;
}
