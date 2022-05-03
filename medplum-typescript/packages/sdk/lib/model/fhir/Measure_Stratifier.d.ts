import { CodeableConcept } from "./CodeableConcept";
import { Expression } from "./Expression";
import { Extension } from "./Extension";
import { Measure_Component } from "./Measure_Component";
export interface Measure_Stratifier {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept | null | undefined;
    description: string | null | undefined;
    criteria: Expression | null | undefined;
    component: Measure_Component[] | null | undefined;
}
