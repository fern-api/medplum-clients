import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";
import { Reference } from "./Reference";
export interface ClaimResponse_Insurance {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    sequence: positiveInt | null | undefined;
    focal: boolean | null | undefined;
    coverage: Reference;
    businessArrangement: string | null | undefined;
    claimResponse: Reference | null | undefined;
}
