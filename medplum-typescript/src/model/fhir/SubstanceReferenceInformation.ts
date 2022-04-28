import { code } from "./code";
import { Extension } from "./Extension";
import { id } from "./id";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ResourceList } from "./ResourceList";
import { SubstanceReferenceInformation_Classification } from "./SubstanceReferenceInformation_Classification";
import { SubstanceReferenceInformation_Gene } from "./SubstanceReferenceInformation_Gene";
import { SubstanceReferenceInformation_GeneElement } from "./SubstanceReferenceInformation_GeneElement";
import { SubstanceReferenceInformation_Target } from "./SubstanceReferenceInformation_Target";
import { uri } from "./uri";

export interface SubstanceReferenceInformation {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    comment: string | null | undefined;
    gene: SubstanceReferenceInformation_Gene[] | null | undefined;
    geneElement: SubstanceReferenceInformation_GeneElement[] | null | undefined;
    classification: SubstanceReferenceInformation_Classification[] | null | undefined;
    target: SubstanceReferenceInformation_Target[] | null | undefined;
}
