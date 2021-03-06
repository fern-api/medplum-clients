import { Annotation } from "./Annotation";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { ContactPoint } from "./ContactPoint";
import { DeviceDefinition_Capability } from "./DeviceDefinition_Capability";
import { DeviceDefinition_DeviceName } from "./DeviceDefinition_DeviceName";
import { DeviceDefinition_Material } from "./DeviceDefinition_Material";
import { DeviceDefinition_Property } from "./DeviceDefinition_Property";
import { DeviceDefinition_Specialization } from "./DeviceDefinition_Specialization";
import { DeviceDefinition_UdiDeviceIdentifier } from "./DeviceDefinition_UdiDeviceIdentifier";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ProdCharacteristic } from "./ProdCharacteristic";
import { ProductShelfLife } from "./ProductShelfLife";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface DeviceDefinition {
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
    udiDeviceIdentifier:
        | DeviceDefinition_UdiDeviceIdentifier[]
        | null
        | undefined;
    manufacturerString: string | null | undefined;
    manufacturerReference: Reference | null | undefined;
    deviceName: DeviceDefinition_DeviceName[] | null | undefined;
    modelNumber: string | null | undefined;
    type: CodeableConcept | null | undefined;
    specialization: DeviceDefinition_Specialization[] | null | undefined;
    version: string[] | null | undefined;
    safety: CodeableConcept[] | null | undefined;
    shelfLifeStorage: ProductShelfLife[] | null | undefined;
    physicalCharacteristics: ProdCharacteristic | null | undefined;
    languageCode: CodeableConcept[] | null | undefined;
    capability: DeviceDefinition_Capability[] | null | undefined;
    property: DeviceDefinition_Property[] | null | undefined;
    owner: Reference | null | undefined;
    contact: ContactPoint[] | null | undefined;
    url: uri | null | undefined;
    onlineInformation: uri | null | undefined;
    note: Annotation[] | null | undefined;
    quantity: Quantity | null | undefined;
    parentDevice: Reference | null | undefined;
    material: DeviceDefinition_Material[] | null | undefined;
}
