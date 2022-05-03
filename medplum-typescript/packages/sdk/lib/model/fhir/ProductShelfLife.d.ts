import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Quantity } from "./Quantity";
export interface ProductShelfLife {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier | null | undefined;
    type: CodeableConcept;
    period: Quantity;
    specialPrecautionsForStorage: CodeableConcept[] | null | undefined;
}
