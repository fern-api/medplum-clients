import { Extension } from "./Extension";
import { Reference } from "./Reference";
import { Signature } from "./Signature";
export interface VerificationResult_Validator {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    organization: Reference;
    identityCertificate: string | null | undefined;
    attestationSignature: Signature | null | undefined;
}
