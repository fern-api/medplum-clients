import { code } from "./code";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { MolecularsequenceType } from "./MolecularsequenceType";
import { MolecularSequence_Quality } from "./MolecularSequence_Quality";
import { MolecularSequence_ReferenceSeq } from "./MolecularSequence_ReferenceSeq";
import { MolecularSequence_Repository } from "./MolecularSequence_Repository";
import { MolecularSequence_StructureVariant } from "./MolecularSequence_StructureVariant";
import { MolecularSequence_Variant } from "./MolecularSequence_Variant";
import { Narrative } from "./Narrative";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MolecularSequence {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    type: MolecularsequenceType | null | undefined;
    coordinateSystem: number | null | undefined;
    patient: Reference | null | undefined;
    specimen: Reference | null | undefined;
    device: Reference | null | undefined;
    performer: Reference | null | undefined;
    quantity: Quantity | null | undefined;
    referenceSeq: MolecularSequence_ReferenceSeq | null | undefined;
    variant: MolecularSequence_Variant[] | null | undefined;
    observedSeq: string | null | undefined;
    quality: MolecularSequence_Quality[] | null | undefined;
    readCoverage: number | null | undefined;
    repository: MolecularSequence_Repository[] | null | undefined;
    pointer: Reference[] | null | undefined;
    structureVariant: MolecularSequence_StructureVariant[] | null | undefined;
}
