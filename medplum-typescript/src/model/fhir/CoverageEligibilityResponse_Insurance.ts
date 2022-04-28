import { CoverageEligibilityResponse_Item } from "./CoverageEligibilityResponse_Item";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Reference } from "./Reference";

export interface CoverageEligibilityResponse_Insurance {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    coverage: Reference;
    inforce: boolean | null | undefined;
    benefitPeriod: Period | null | undefined;
    item: CoverageEligibilityResponse_Item[] | null | undefined;
}
