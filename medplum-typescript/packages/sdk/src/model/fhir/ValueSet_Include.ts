import { canonical } from "./canonical";
import { Extension } from "./Extension";
import { uri } from "./uri";
import { ValueSet_Concept } from "./ValueSet_Concept";
import { ValueSet_Filter } from "./ValueSet_Filter";

export interface ValueSet_Include {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    system: uri | null | undefined;
    version: string | null | undefined;
    concept: ValueSet_Concept[] | null | undefined;
    filter: ValueSet_Filter[] | null | undefined;
    valueSet: canonical[] | null | undefined;
}
