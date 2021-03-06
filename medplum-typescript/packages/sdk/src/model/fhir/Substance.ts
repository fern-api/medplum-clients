import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ResourceList } from "./ResourceList";
import { SubstanceStatus } from "./SubstanceStatus";
import { Substance_Ingredient } from "./Substance_Ingredient";
import { Substance_Instance } from "./Substance_Instance";
import { uri } from "./uri";

export interface Substance {
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
    status: SubstanceStatus | null | undefined;
    category: CodeableConcept[] | null | undefined;
    code: CodeableConcept;
    description: string | null | undefined;
    instance: Substance_Instance[] | null | undefined;
    ingredient: Substance_Ingredient[] | null | undefined;
}
