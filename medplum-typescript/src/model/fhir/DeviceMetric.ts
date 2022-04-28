import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { DevicemetricCategory } from "./DevicemetricCategory";
import { DevicemetricColor } from "./DevicemetricColor";
import { DevicemetricOperationalstatus } from "./DevicemetricOperationalstatus";
import { DeviceMetric_Calibration } from "./DeviceMetric_Calibration";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { Timing } from "./Timing";
import { uri } from "./uri";

export interface DeviceMetric {
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
    type: CodeableConcept;
    unit: CodeableConcept | null | undefined;
    source: Reference | null | undefined;
    parent: Reference | null | undefined;
    operationalStatus: DevicemetricOperationalstatus | null | undefined;
    color: DevicemetricColor | null | undefined;
    category: DevicemetricCategory | null | undefined;
    measurementPeriod: Timing | null | undefined;
    calibration: DeviceMetric_Calibration[] | null | undefined;
}
