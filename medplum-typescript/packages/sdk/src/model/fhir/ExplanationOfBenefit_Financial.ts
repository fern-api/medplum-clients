import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Money } from "./Money";

export interface ExplanationOfBenefit_Financial {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    allowedUnsignedInt: number | null | undefined;
    allowedString: string | null | undefined;
    allowedMoney: Money | null | undefined;
    usedUnsignedInt: number | null | undefined;
    usedMoney: Money | null | undefined;
}
