import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Quantity } from "./Quantity";
import { Range } from "./Range";
import { Reference } from "./Reference";

export interface SubstanceReferenceInformation_Target {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    target: Identifier | null | undefined;
    type: CodeableConcept | null | undefined;
    interaction: CodeableConcept | null | undefined;
    organism: CodeableConcept | null | undefined;
    organismType: CodeableConcept | null | undefined;
    amountQuantity: Quantity | null | undefined;
    amountRange: Range | null | undefined;
    amountString: string | null | undefined;
    amountType: CodeableConcept | null | undefined;
    source: Reference[] | null | undefined;
}
