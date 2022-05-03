import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ProdCharacteristic } from "./ProdCharacteristic";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
export interface MedicinalProductManufactured {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    manufacturedDoseForm: CodeableConcept;
    unitOfPresentation: CodeableConcept | null | undefined;
    quantity: Quantity;
    manufacturer: Reference[] | null | undefined;
    ingredient: Reference[] | null | undefined;
    physicalCharacteristics: ProdCharacteristic | null | undefined;
    otherCharacteristics: CodeableConcept[] | null | undefined;
}
