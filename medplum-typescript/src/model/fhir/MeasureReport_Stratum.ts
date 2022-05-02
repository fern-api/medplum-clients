import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { MeasureReport_Component } from "./MeasureReport_Component";
import { MeasureReport_Population1 } from "./MeasureReport_Population1";
import { Quantity } from "./Quantity";

export interface MeasureReport_Stratum {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    value: CodeableConcept | null | undefined;
    component: MeasureReport_Component[] | null | undefined;
    population: MeasureReport_Population1[] | null | undefined;
    measureScore: Quantity | null | undefined;
}
