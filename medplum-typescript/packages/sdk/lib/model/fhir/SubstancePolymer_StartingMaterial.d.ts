import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { SubstanceAmount } from "./SubstanceAmount";
export interface SubstancePolymer_StartingMaterial {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    material: CodeableConcept | null | undefined;
    type: CodeableConcept | null | undefined;
    isDefining: boolean | null | undefined;
    amount: SubstanceAmount | null | undefined;
}
