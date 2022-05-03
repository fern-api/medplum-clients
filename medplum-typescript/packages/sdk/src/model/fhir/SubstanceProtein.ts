import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ResourceList } from "./ResourceList";
import { SubstanceProtein_Subunit } from "./SubstanceProtein_Subunit";
import { uri } from "./uri";

export interface SubstanceProtein {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    sequenceType: CodeableConcept | null | undefined;
    numberOfSubunits: number | null | undefined;
    disulfideLinkage: string[] | null | undefined;
    subunit: SubstanceProtein_Subunit[] | null | undefined;
}
