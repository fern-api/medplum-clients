import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Reference } from "./Reference";

export interface MedicinalProduct_SpecialDesignation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    type: CodeableConcept | null | undefined;
    intendedUse: CodeableConcept | null | undefined;
    indicationCodeableConcept: CodeableConcept | null | undefined;
    indicationReference: Reference | null | undefined;
    status: CodeableConcept | null | undefined;
    date: dateTime | null | undefined;
    species: CodeableConcept | null | undefined;
}
