import { Extension } from "./Extension";
import { Healthcareservice_availabletimeDaysofweekItem } from "./Healthcareservice_availabletimeDaysofweekItem";
import { time } from "./time";
export interface HealthcareService_AvailableTime {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    daysOfWeek: Healthcareservice_availabletimeDaysofweekItem[] | null | undefined;
    allDay: boolean | null | undefined;
    availableStartTime: time | null | undefined;
    availableEndTime: time | null | undefined;
}
