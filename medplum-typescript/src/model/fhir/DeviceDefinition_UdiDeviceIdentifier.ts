import { Extension } from "./Extension";
import { uri } from "./uri";

export interface DeviceDefinition_UdiDeviceIdentifier {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    deviceIdentifier: string | null | undefined;
    issuer: uri | null | undefined;
    jurisdiction: uri | null | undefined;
}
