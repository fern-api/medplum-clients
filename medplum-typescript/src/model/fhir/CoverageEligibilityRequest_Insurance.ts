import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface CoverageEligibilityRequest_Insurance {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    focal: boolean | null | undefined;
    coverage: Reference;
    businessArrangement: string | null | undefined;
}
