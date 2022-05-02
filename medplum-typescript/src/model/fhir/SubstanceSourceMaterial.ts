import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ResourceList } from "./ResourceList";
import { SubstanceSourceMaterial_FractionDescription } from "./SubstanceSourceMaterial_FractionDescription";
import { SubstanceSourceMaterial_Organism } from "./SubstanceSourceMaterial_Organism";
import { SubstanceSourceMaterial_PartDescription } from "./SubstanceSourceMaterial_PartDescription";
import { uri } from "./uri";

export interface SubstanceSourceMaterial {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    sourceMaterialClass: CodeableConcept | null | undefined;
    sourceMaterialType: CodeableConcept | null | undefined;
    sourceMaterialState: CodeableConcept | null | undefined;
    organismId: Identifier | null | undefined;
    organismName: string | null | undefined;
    parentSubstanceId: Identifier[] | null | undefined;
    parentSubstanceName: string[] | null | undefined;
    countryOfOrigin: CodeableConcept[] | null | undefined;
    geographicalLocation: string[] | null | undefined;
    developmentStage: CodeableConcept | null | undefined;
    fractionDescription:
        | SubstanceSourceMaterial_FractionDescription[]
        | null
        | undefined;
    organism: SubstanceSourceMaterial_Organism | null | undefined;
    partDescription:
        | SubstanceSourceMaterial_PartDescription[]
        | null
        | undefined;
}
