import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { MedicinalProductPharmaceutical_Characteristics } from "./MedicinalProductPharmaceutical_Characteristics";
import { MedicinalProductPharmaceutical_RouteOfAdministration } from "./MedicinalProductPharmaceutical_RouteOfAdministration";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MedicinalProductPharmaceutical {
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
    administrableDoseForm: CodeableConcept;
    unitOfPresentation: CodeableConcept | null | undefined;
    ingredient: Reference[] | null | undefined;
    device: Reference[] | null | undefined;
    characteristics: MedicinalProductPharmaceutical_Characteristics[] | null | undefined;
    routeOfAdministration: MedicinalProductPharmaceutical_RouteOfAdministration[];
}
