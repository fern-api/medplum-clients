import { code } from "./code";
import { Extension } from "./Extension";
import { time } from "./time";
export interface PractitionerRole_AvailableTime {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    daysOfWeek: code[] | null | undefined;
    allDay: boolean | null | undefined;
    availableStartTime: time | null | undefined;
    availableEndTime: time | null | undefined;
}
