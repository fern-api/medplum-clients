import { CodeableConcept } from "./CodeableConcept";
import { CoverageEligibilityResponse_Benefit } from "./CoverageEligibilityResponse_Benefit";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
import { uri } from "./uri";

export interface CoverageEligibilityResponse_Item {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    category: CodeableConcept | null | undefined;
    productOrService: CodeableConcept | null | undefined;
    modifier: CodeableConcept[] | null | undefined;
    provider: Reference | null | undefined;
    excluded: boolean | null | undefined;
    name: string | null | undefined;
    description: string | null | undefined;
    network: CodeableConcept | null | undefined;
    unit: CodeableConcept | null | undefined;
    term: CodeableConcept | null | undefined;
    benefit: CoverageEligibilityResponse_Benefit[] | null | undefined;
    authorizationRequired: boolean | null | undefined;
    authorizationSupporting: CodeableConcept[] | null | undefined;
    authorizationUrl: uri | null | undefined;
}
