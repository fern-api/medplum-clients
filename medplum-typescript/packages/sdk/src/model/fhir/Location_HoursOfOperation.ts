import { code } from "./code";
import { Extension } from "./Extension";
import { time } from "./time";

export interface Location_HoursOfOperation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    daysOfWeek: code[] | null | undefined;
    allDay: boolean | null | undefined;
    openingTime: time | null | undefined;
    closingTime: time | null | undefined;
}
