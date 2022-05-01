import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { SubstanceSpecification_Code } from "./SubstanceSpecification_Code";
import { SubstanceSpecification_Moiety } from "./SubstanceSpecification_Moiety";
import { SubstanceSpecification_MolecularWeight } from "./SubstanceSpecification_MolecularWeight";
import { SubstanceSpecification_Name } from "./SubstanceSpecification_Name";
import { SubstanceSpecification_Property } from "./SubstanceSpecification_Property";
import { SubstanceSpecification_Relationship } from "./SubstanceSpecification_Relationship";
import { SubstanceSpecification_Structure } from "./SubstanceSpecification_Structure";
import { uri } from "./uri";

export interface SubstanceSpecification {
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
    type: CodeableConcept | null | undefined;
    status: CodeableConcept | null | undefined;
    domain: CodeableConcept | null | undefined;
    description: string | null | undefined;
    source: Reference[] | null | undefined;
    comment: string | null | undefined;
    moiety: SubstanceSpecification_Moiety[] | null | undefined;
    property: SubstanceSpecification_Property[] | null | undefined;
    referenceInformation: Reference | null | undefined;
    structure: SubstanceSpecification_Structure | null | undefined;
    code: SubstanceSpecification_Code[] | null | undefined;
    name: SubstanceSpecification_Name[] | null | undefined;
    molecularWeight:
        | SubstanceSpecification_MolecularWeight[]
        | null
        | undefined;
    relationship: SubstanceSpecification_Relationship[] | null | undefined;
    nucleicAcid: Reference | null | undefined;
    polymer: Reference | null | undefined;
    protein: Reference | null | undefined;
    sourceMaterial: Reference | null | undefined;
}
