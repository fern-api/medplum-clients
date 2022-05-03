import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Measure_Population } from "./Measure_Population";
import { Measure_Stratifier } from "./Measure_Stratifier";

export interface Measure_Group {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept | null | undefined;
    description: string | null | undefined;
    population: Measure_Population[] | null | undefined;
    stratifier: Measure_Stratifier[] | null | undefined;
}
