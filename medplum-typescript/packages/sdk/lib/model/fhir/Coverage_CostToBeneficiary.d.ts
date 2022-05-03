import { CodeableConcept } from "./CodeableConcept";
import { Coverage_Exception } from "./Coverage_Exception";
import { Extension } from "./Extension";
import { Money } from "./Money";
import { Quantity } from "./Quantity";
export interface Coverage_CostToBeneficiary {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept | null | undefined;
    valueQuantity: Quantity | null | undefined;
    valueMoney: Money | null | undefined;
    exception: Coverage_Exception[] | null | undefined;
}
