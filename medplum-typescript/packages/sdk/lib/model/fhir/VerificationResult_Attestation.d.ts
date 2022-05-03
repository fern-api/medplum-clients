import { CodeableConcept } from "./CodeableConcept";
import { date } from "./date";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
import { Signature } from "./Signature";
export interface VerificationResult_Attestation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    who: Reference | null | undefined;
    onBehalfOf: Reference | null | undefined;
    communicationMethod: CodeableConcept | null | undefined;
    date: date | null | undefined;
    sourceIdentityCertificate: string | null | undefined;
    proxyIdentityCertificate: string | null | undefined;
    proxySignature: Signature | null | undefined;
    sourceSignature: Signature | null | undefined;
}
