import { canonical } from "./canonical";
import { Careplan_detailStatus } from "./Careplan_detailStatus";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";
import { Timing } from "./Timing";
import { uri } from "./uri";

export interface CarePlan_Detail {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    kind: code | null | undefined;
    instantiatesCanonical: canonical[] | null | undefined;
    instantiatesUri: uri[] | null | undefined;
    code: CodeableConcept | null | undefined;
    reasonCode: CodeableConcept[] | null | undefined;
    reasonReference: Reference[] | null | undefined;
    goal: Reference[] | null | undefined;
    status: Careplan_detailStatus | null | undefined;
    statusReason: CodeableConcept | null | undefined;
    doNotPerform: boolean | null | undefined;
    scheduledTiming: Timing | null | undefined;
    scheduledPeriod: Period | null | undefined;
    scheduledString: string | null | undefined;
    location: Reference | null | undefined;
    performer: Reference[] | null | undefined;
    productCodeableConcept: CodeableConcept | null | undefined;
    productReference: Reference | null | undefined;
    dailyAmount: Quantity | null | undefined;
    quantity: Quantity | null | undefined;
    description: string | null | undefined;
}
