import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { NutritionOrder_Administration } from "./NutritionOrder_Administration";
import { Quantity } from "./Quantity";

export interface NutritionOrder_EnteralFormula {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    baseFormulaType: CodeableConcept | null | undefined;
    baseFormulaProductName: string | null | undefined;
    additiveType: CodeableConcept | null | undefined;
    additiveProductName: string | null | undefined;
    caloricDensity: Quantity | null | undefined;
    routeofAdministration: CodeableConcept | null | undefined;
    administration: NutritionOrder_Administration[] | null | undefined;
    maxVolumeToDeliver: Quantity | null | undefined;
    administrationInstruction: string | null | undefined;
}
