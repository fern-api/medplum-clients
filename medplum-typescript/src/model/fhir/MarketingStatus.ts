import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { Period } from "./Period";

export interface MarketingStatus {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    country: CodeableConcept;
    jurisdiction: CodeableConcept | null | undefined;
    status: CodeableConcept;
    dateRange: Period;
    restoreDate: dateTime | null | undefined;
}
