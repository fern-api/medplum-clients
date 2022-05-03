import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { positiveInt } from "./positiveInt";
import { Reference } from "./Reference";
export interface Claim_Insurance {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    sequence: positiveInt | null | undefined;
    focal: boolean | null | undefined;
    identifier: Identifier | null | undefined;
    coverage: Reference;
    businessArrangement: string | null | undefined;
    preAuthRef: string[] | null | undefined;
    claimResponse: Reference | null | undefined;
}
