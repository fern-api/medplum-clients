import { Extension } from "./Extension";
import { Period } from "./Period";
export interface HealthcareService_NotAvailable {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    description: string | null | undefined;
    during: Period | null | undefined;
}
