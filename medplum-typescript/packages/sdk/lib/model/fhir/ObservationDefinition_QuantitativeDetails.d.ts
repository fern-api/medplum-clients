import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
export interface ObservationDefinition_QuantitativeDetails {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    customaryUnit: CodeableConcept | null | undefined;
    unit: CodeableConcept | null | undefined;
    conversionFactor: decimal | null | undefined;
    decimalPrecision: number | null | undefined;
}
