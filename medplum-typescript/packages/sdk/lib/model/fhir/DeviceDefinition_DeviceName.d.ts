import { Devicedefinition_devicenameType } from "./Devicedefinition_devicenameType";
import { Extension } from "./Extension";
export interface DeviceDefinition_DeviceName {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    type: Devicedefinition_devicenameType | null | undefined;
}
