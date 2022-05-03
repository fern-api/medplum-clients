import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Reference } from "./Reference";
export interface MedicinalProduct_ManufacturingBusinessOperation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    operationType: CodeableConcept | null | undefined;
    authorisationReferenceNumber: Identifier | null | undefined;
    effectiveDate: dateTime | null | undefined;
    confidentialityIndicator: CodeableConcept | null | undefined;
    manufacturer: Reference[] | null | undefined;
    regulator: Reference | null | undefined;
}
