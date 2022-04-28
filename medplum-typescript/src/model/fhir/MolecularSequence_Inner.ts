import { Extension } from "./Extension";

export interface MolecularSequence_Inner {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    start: number | null | undefined;
    end: number | null | undefined;
}
