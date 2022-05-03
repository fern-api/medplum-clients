import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { MedicinalProductIngredient_SpecifiedSubstance } from "./MedicinalProductIngredient_SpecifiedSubstance";
import { MedicinalProductIngredient_Substance } from "./MedicinalProductIngredient_Substance";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MedicinalProductIngredient {
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
    role: CodeableConcept;
    allergenicIndicator: boolean | null | undefined;
    manufacturer: Reference[] | null | undefined;
    specifiedSubstance:
        | MedicinalProductIngredient_SpecifiedSubstance[]
        | null
        | undefined;
    substance: MedicinalProductIngredient_Substance | null | undefined;
}
