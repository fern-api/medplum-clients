import { Extension } from "./Extension";

export interface DeviceDefinition_Specialization {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    systemType: string | null | undefined;
    version: string | null | undefined;
}
