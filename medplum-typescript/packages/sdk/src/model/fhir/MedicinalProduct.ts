import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { MarketingStatus } from "./MarketingStatus";
import { MedicinalProduct_ManufacturingBusinessOperation } from "./MedicinalProduct_ManufacturingBusinessOperation";
import { MedicinalProduct_Name } from "./MedicinalProduct_Name";
import { MedicinalProduct_SpecialDesignation } from "./MedicinalProduct_SpecialDesignation";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MedicinalProduct {
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
    type: CodeableConcept | null | undefined;
    domain: Coding | null | undefined;
    combinedPharmaceuticalDoseForm: CodeableConcept | null | undefined;
    legalStatusOfSupply: CodeableConcept | null | undefined;
    additionalMonitoringIndicator: CodeableConcept | null | undefined;
    specialMeasures: string[] | null | undefined;
    paediatricUseIndicator: CodeableConcept | null | undefined;
    productClassification: CodeableConcept[] | null | undefined;
    marketingStatus: MarketingStatus[] | null | undefined;
    pharmaceuticalProduct: Reference[] | null | undefined;
    packagedMedicinalProduct: Reference[] | null | undefined;
    attachedDocument: Reference[] | null | undefined;
    masterFile: Reference[] | null | undefined;
    contact: Reference[] | null | undefined;
    clinicalTrial: Reference[] | null | undefined;
    name: MedicinalProduct_Name[];
    crossReference: Identifier[] | null | undefined;
    manufacturingBusinessOperation:
        | MedicinalProduct_ManufacturingBusinessOperation[]
        | null
        | undefined;
    specialDesignation:
        | MedicinalProduct_SpecialDesignation[]
        | null
        | undefined;
}
