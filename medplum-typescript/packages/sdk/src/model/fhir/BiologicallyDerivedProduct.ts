import { BiologicallyderivedproductProductcategory } from "./BiologicallyderivedproductProductcategory";
import { BiologicallyderivedproductStatus } from "./BiologicallyderivedproductStatus";
import { BiologicallyDerivedProduct_Collection } from "./BiologicallyDerivedProduct_Collection";
import { BiologicallyDerivedProduct_Manipulation } from "./BiologicallyDerivedProduct_Manipulation";
import { BiologicallyDerivedProduct_Processing } from "./BiologicallyDerivedProduct_Processing";
import { BiologicallyDerivedProduct_Storage } from "./BiologicallyDerivedProduct_Storage";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface BiologicallyDerivedProduct {
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
    productCategory:
        | BiologicallyderivedproductProductcategory
        | null
        | undefined;
    productCode: CodeableConcept | null | undefined;
    status: BiologicallyderivedproductStatus | null | undefined;
    request: Reference[] | null | undefined;
    quantity: number | null | undefined;
    parent: Reference[] | null | undefined;
    collection: BiologicallyDerivedProduct_Collection | null | undefined;
    processing: BiologicallyDerivedProduct_Processing[] | null | undefined;
    manipulation: BiologicallyDerivedProduct_Manipulation | null | undefined;
    storage: BiologicallyDerivedProduct_Storage[] | null | undefined;
}
