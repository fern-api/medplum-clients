import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";
import { Reference } from "./Reference";
export interface CoverageEligibilityRequest_SupportingInfo {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    sequence: positiveInt | null | undefined;
    information: Reference;
    appliesToAll: boolean | null | undefined;
}
