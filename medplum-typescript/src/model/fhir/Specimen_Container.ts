import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";

export interface Specimen_Container {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    description: string | null | undefined;
    type: CodeableConcept | null | undefined;
    capacity: Quantity | null | undefined;
    specimenQuantity: Quantity | null | undefined;
    additiveCodeableConcept: CodeableConcept | null | undefined;
    additiveReference: Reference | null | undefined;
}
