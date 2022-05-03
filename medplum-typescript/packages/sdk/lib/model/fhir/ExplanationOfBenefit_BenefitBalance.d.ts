import { CodeableConcept } from "./CodeableConcept";
import { ExplanationOfBenefit_Financial } from "./ExplanationOfBenefit_Financial";
import { Extension } from "./Extension";
export interface ExplanationOfBenefit_BenefitBalance {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    category: CodeableConcept;
    excluded: boolean | null | undefined;
    name: string | null | undefined;
    description: string | null | undefined;
    network: CodeableConcept | null | undefined;
    unit: CodeableConcept | null | undefined;
    term: CodeableConcept | null | undefined;
    financial: ExplanationOfBenefit_Financial[] | null | undefined;
}
