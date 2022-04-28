import { Devicemetric_calibrationState } from "./Devicemetric_calibrationState";
import { Devicemetric_calibrationType } from "./Devicemetric_calibrationType";
import { Extension } from "./Extension";
import { instant } from "./instant";

export interface DeviceMetric_Calibration {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Devicemetric_calibrationType | null | undefined;
    state: Devicemetric_calibrationState | null | undefined;
    time: instant | null | undefined;
}
