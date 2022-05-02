import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { MedicinalProductInteraction_Interactant } from "./MedicinalProductInteraction_Interactant";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MedicinalProductInteraction {
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
    description: string | null | undefined;
    interactant: MedicinalProductInteraction_Interactant[] | null | undefined;
    type: CodeableConcept | null | undefined;
    effect: CodeableConcept | null | undefined;
    incidence: CodeableConcept | null | undefined;
    management: CodeableConcept | null | undefined;
}
