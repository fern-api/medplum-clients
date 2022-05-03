import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ResourceList } from "./ResourceList";
import { SpecimenDefinition_TypeTested } from "./SpecimenDefinition_TypeTested";
import { uri } from "./uri";

export interface SpecimenDefinition {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier | null | undefined;
    typeCollected: CodeableConcept | null | undefined;
    patientPreparation: CodeableConcept[] | null | undefined;
    timeAspect: string | null | undefined;
    collection: CodeableConcept[] | null | undefined;
    typeTested: SpecimenDefinition_TypeTested[] | null | undefined;
}
