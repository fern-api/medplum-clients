import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ResourceList } from "./ResourceList";
import { SubstancePolymer_MonomerSet } from "./SubstancePolymer_MonomerSet";
import { SubstancePolymer_Repeat } from "./SubstancePolymer_Repeat";
import { uri } from "./uri";

export interface SubstancePolymer {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    class: CodeableConcept | null | undefined;
    geometry: CodeableConcept | null | undefined;
    copolymerConnectivity: CodeableConcept[] | null | undefined;
    modification: string[] | null | undefined;
    monomerSet: SubstancePolymer_MonomerSet[] | null | undefined;
    repeat: SubstancePolymer_Repeat[] | null | undefined;
}
