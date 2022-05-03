import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Population } from "./Population";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MedicinalProductUndesirableEffect {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    subject: Reference[] | null | undefined;
    symptomConditionEffect: CodeableConcept | null | undefined;
    classification: CodeableConcept | null | undefined;
    frequencyOfOccurrence: CodeableConcept | null | undefined;
    population: Population[] | null | undefined;
}
