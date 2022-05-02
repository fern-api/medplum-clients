import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
import { Signature } from "./Signature";

export interface Contract_Signer {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Coding;
    party: Reference;
    signature: Signature[];
}
