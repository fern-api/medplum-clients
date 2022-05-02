import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Range } from "./Range";
import { Ratio } from "./Ratio";
import { Reference } from "./Reference";

export interface SubstanceSpecification_Relationship {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    substanceReference: Reference | null | undefined;
    substanceCodeableConcept: CodeableConcept | null | undefined;
    relationship: CodeableConcept | null | undefined;
    isDefining: boolean | null | undefined;
    amountQuantity: Quantity | null | undefined;
    amountRange: Range | null | undefined;
    amountRatio: Ratio | null | undefined;
    amountString: string | null | undefined;
    amountRatioLowLimit: Ratio | null | undefined;
    amountType: CodeableConcept | null | undefined;
    source: Reference[] | null | undefined;
}
