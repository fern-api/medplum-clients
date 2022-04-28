import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Reference } from "./Reference";

export interface BiologicallyDerivedProduct_Processing {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    description: string | null | undefined;
    procedure: CodeableConcept | null | undefined;
    additive: Reference | null | undefined;
    timeDateTime: string | null | undefined;
    timePeriod: Period | null | undefined;
}
