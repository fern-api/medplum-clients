import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { MedicinalProductIndication_OtherTherapy } from "./MedicinalProductIndication_OtherTherapy";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Population } from "./Population";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MedicinalProductIndication {
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
    diseaseSymptomProcedure: CodeableConcept | null | undefined;
    diseaseStatus: CodeableConcept | null | undefined;
    comorbidity: CodeableConcept[] | null | undefined;
    intendedEffect: CodeableConcept | null | undefined;
    duration: Quantity | null | undefined;
    otherTherapy: MedicinalProductIndication_OtherTherapy[] | null | undefined;
    undesirableEffect: Reference[] | null | undefined;
    population: Population[] | null | undefined;
}
