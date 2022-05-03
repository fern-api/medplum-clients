import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { MeasureReport_Population } from "./MeasureReport_Population";
import { MeasureReport_Stratifier } from "./MeasureReport_Stratifier";
import { Quantity } from "./Quantity";

export interface MeasureReport_Group {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept | null | undefined;
    population: MeasureReport_Population[] | null | undefined;
    measureScore: Quantity | null | undefined;
    stratifier: MeasureReport_Stratifier[] | null | undefined;
}
