import { code } from "./code";
import { decimal } from "./decimal";
import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { positiveInt } from "./positiveInt";
import { Range } from "./Range";
import { time } from "./time";
import { Timing_repeatDurationunit } from "./Timing_repeatDurationunit";
import { Timing_repeatPeriodunit } from "./Timing_repeatPeriodunit";
import { Timing_repeatWhenItem } from "./Timing_repeatWhenItem";
import { unsignedInt } from "./unsignedInt";

export interface Timing_Repeat {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    boundsDuration: Duration | null | undefined;
    boundsRange: Range | null | undefined;
    boundsPeriod: Period | null | undefined;
    count: positiveInt | null | undefined;
    countMax: positiveInt | null | undefined;
    duration: decimal | null | undefined;
    durationMax: decimal | null | undefined;
    durationUnit: Timing_repeatDurationunit | null | undefined;
    frequency: positiveInt | null | undefined;
    frequencyMax: positiveInt | null | undefined;
    period: decimal | null | undefined;
    periodMax: decimal | null | undefined;
    periodUnit: Timing_repeatPeriodunit | null | undefined;
    dayOfWeek: code[] | null | undefined;
    timeOfDay: time[] | null | undefined;
    when: Timing_repeatWhenItem[] | null | undefined;
    offset: unsignedInt | null | undefined;
}
