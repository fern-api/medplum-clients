import { CodeableConcept } from "./CodeableConcept";
import { Coding } from "./Coding";
import { Consent_Actor } from "./Consent_Actor";
import { Consent_Data } from "./Consent_Data";
import { Consent_Provision } from "./Consent_Provision";
import { Consent_provisionType } from "./Consent_provisionType";
import { Extension } from "./Extension";
import { Period } from "./Period";

export interface Consent_Provision {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Consent_provisionType | null | undefined;
    period: Period | null | undefined;
    actor: Consent_Actor[] | null | undefined;
    action: CodeableConcept[] | null | undefined;
    securityLabel: Coding[] | null | undefined;
    purpose: Coding[] | null | undefined;
    class: Coding[] | null | undefined;
    code: CodeableConcept[] | null | undefined;
    dataPeriod: Period | null | undefined;
    data: Consent_Data[] | null | undefined;
    provision: Consent_Provision[] | null | undefined;
}
