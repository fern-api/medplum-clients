import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { ProdCharacteristic } from "./ProdCharacteristic";
import { ProductShelfLife } from "./ProductShelfLife";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";
export interface MedicinalProductPackaged_PackageItem {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    type: CodeableConcept;
    quantity: Quantity;
    material: CodeableConcept[] | null | undefined;
    alternateMaterial: CodeableConcept[] | null | undefined;
    device: Reference[] | null | undefined;
    manufacturedItem: Reference[] | null | undefined;
    packageItem: MedicinalProductPackaged_PackageItem[] | null | undefined;
    physicalCharacteristics: ProdCharacteristic | null | undefined;
    otherCharacteristics: CodeableConcept[] | null | undefined;
    shelfLifeStorage: ProductShelfLife[] | null | undefined;
    manufacturer: Reference[] | null | undefined;
}
