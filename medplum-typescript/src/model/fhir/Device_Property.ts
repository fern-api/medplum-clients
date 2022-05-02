import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";

export interface Device_Property {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    valueQuantity: Quantity[] | null | undefined;
    valueCode: CodeableConcept[] | null | undefined;
}
