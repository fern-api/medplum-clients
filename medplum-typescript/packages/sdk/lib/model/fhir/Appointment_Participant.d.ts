import { Appointment_participantRequired } from "./Appointment_participantRequired";
import { Appointment_participantStatus } from "./Appointment_participantStatus";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Reference } from "./Reference";
export interface Appointment_Participant {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept[] | null | undefined;
    actor: Reference | null | undefined;
    required: Appointment_participantRequired | null | undefined;
    status: Appointment_participantStatus | null | undefined;
    period: Period | null | undefined;
}
