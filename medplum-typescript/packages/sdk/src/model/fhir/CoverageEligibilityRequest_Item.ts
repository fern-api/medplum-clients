import { CodeableConcept } from "./CodeableConcept";
import { CoverageEligibilityRequest_Diagnosis } from "./CoverageEligibilityRequest_Diagnosis";
import { Extension } from "./Extension";
import { Money } from "./Money";
import { positiveInt } from "./positiveInt";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";

export interface CoverageEligibilityRequest_Item {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    supportingInfoSequence: positiveInt[] | null | undefined;
    category: CodeableConcept | null | undefined;
    productOrService: CodeableConcept | null | undefined;
    modifier: CodeableConcept[] | null | undefined;
    provider: Reference | null | undefined;
    quantity: Quantity | null | undefined;
    unitPrice: Money | null | undefined;
    facility: Reference | null | undefined;
    diagnosis: CoverageEligibilityRequest_Diagnosis[] | null | undefined;
    detail: Reference[] | null | undefined;
}
