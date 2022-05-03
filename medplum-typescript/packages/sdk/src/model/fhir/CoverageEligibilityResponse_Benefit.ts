import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Money } from "./Money";

export interface CoverageEligibilityResponse_Benefit {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    allowedUnsignedInt: number | null | undefined;
    allowedString: string | null | undefined;
    allowedMoney: Money | null | undefined;
    usedUnsignedInt: number | null | undefined;
    usedString: string | null | undefined;
    usedMoney: Money | null | undefined;
}
