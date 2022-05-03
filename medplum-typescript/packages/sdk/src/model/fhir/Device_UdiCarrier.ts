import { base64Binary } from "./base64Binary";
import { Device_udicarrierEntrytype } from "./Device_udicarrierEntrytype";
import { Extension } from "./Extension";
import { uri } from "./uri";

export interface Device_UdiCarrier {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    deviceIdentifier: string | null | undefined;
    issuer: uri | null | undefined;
    jurisdiction: uri | null | undefined;
    carrierAIDC: base64Binary | null | undefined;
    carrierHRF: string | null | undefined;
    entryType: Device_udicarrierEntrytype | null | undefined;
}
