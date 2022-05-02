import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { MarketingStatus } from "./MarketingStatus";
import { MedicinalProductPackaged_BatchIdentifier } from "./MedicinalProductPackaged_BatchIdentifier";
import { MedicinalProductPackaged_PackageItem } from "./MedicinalProductPackaged_PackageItem";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MedicinalProductPackaged {
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
    subject: Reference[] | null | undefined;
    description: string | null | undefined;
    legalStatusOfSupply: CodeableConcept | null | undefined;
    marketingStatus: MarketingStatus[] | null | undefined;
    marketingAuthorization: Reference | null | undefined;
    manufacturer: Reference[] | null | undefined;
    batchIdentifier:
        | MedicinalProductPackaged_BatchIdentifier[]
        | null
        | undefined;
    packageItem: MedicinalProductPackaged_PackageItem[];
}
