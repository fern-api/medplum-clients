import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { MolecularSequence_Inner } from "./MolecularSequence_Inner";
import { MolecularSequence_Outer } from "./MolecularSequence_Outer";

export interface MolecularSequence_StructureVariant {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    variantType: CodeableConcept | null | undefined;
    exact: boolean | null | undefined;
    length: number | null | undefined;
    outer: MolecularSequence_Outer | null | undefined;
    inner: MolecularSequence_Inner | null | undefined;
}
