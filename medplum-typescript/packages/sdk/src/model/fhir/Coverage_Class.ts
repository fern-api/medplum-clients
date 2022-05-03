import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";

export interface Coverage_Class {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    value: string | null | undefined;
    name: string | null | undefined;
}
