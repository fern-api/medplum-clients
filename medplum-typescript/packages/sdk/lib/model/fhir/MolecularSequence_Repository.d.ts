import { Extension } from "./Extension";
import { Molecularsequence_repositoryType } from "./Molecularsequence_repositoryType";
import { uri } from "./uri";
export interface MolecularSequence_Repository {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Molecularsequence_repositoryType | null | undefined;
    url: uri | null | undefined;
    name: string | null | undefined;
    datasetId: string | null | undefined;
    variantsetId: string | null | undefined;
    readsetId: string | null | undefined;
}
