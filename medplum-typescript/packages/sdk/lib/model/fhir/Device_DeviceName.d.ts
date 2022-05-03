import { Device_devicenameType } from "./Device_devicenameType";
import { Extension } from "./Extension";
export interface Device_DeviceName {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    type: Device_devicenameType | null | undefined;
}
