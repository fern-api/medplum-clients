import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface ExplanationOfBenefit_Insurance {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    focal: boolean | null | undefined;
    coverage: Reference;
    preAuthRef: string[] | null | undefined;
}
