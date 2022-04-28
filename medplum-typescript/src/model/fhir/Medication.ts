import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Medication_Batch } from "./Medication_Batch";
import { Medication_Ingredient } from "./Medication_Ingredient";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Ratio } from "./Ratio";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface Medication {
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
    code: CodeableConcept | null | undefined;
    status: code | null | undefined;
    manufacturer: Reference | null | undefined;
    form: CodeableConcept | null | undefined;
    amount: Ratio | null | undefined;
    ingredient: Medication_Ingredient[] | null | undefined;
    batch: Medication_Batch | null | undefined;
}
