import { Extension } from "./Extension";
import { MedicationKnowledge_MaxDispense } from "./MedicationKnowledge_MaxDispense";
import { MedicationKnowledge_Schedule } from "./MedicationKnowledge_Schedule";
import { MedicationKnowledge_Substitution } from "./MedicationKnowledge_Substitution";
import { Reference } from "./Reference";

export interface MedicationKnowledge_Regulatory {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    regulatoryAuthority: Reference;
    substitution: MedicationKnowledge_Substitution[] | null | undefined;
    schedule: MedicationKnowledge_Schedule[] | null | undefined;
    maxDispense: MedicationKnowledge_MaxDispense | null | undefined;
}
