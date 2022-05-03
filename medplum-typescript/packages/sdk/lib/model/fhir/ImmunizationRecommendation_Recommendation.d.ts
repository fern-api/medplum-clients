import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { ImmunizationRecommendation_DateCriterion } from "./ImmunizationRecommendation_DateCriterion";
import { Reference } from "./Reference";
export interface ImmunizationRecommendation_Recommendation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    vaccineCode: CodeableConcept[] | null | undefined;
    targetDisease: CodeableConcept | null | undefined;
    contraindicatedVaccineCode: CodeableConcept[] | null | undefined;
    forecastStatus: CodeableConcept;
    forecastReason: CodeableConcept[] | null | undefined;
    dateCriterion: ImmunizationRecommendation_DateCriterion[] | null | undefined;
    description: string | null | undefined;
    series: string | null | undefined;
    doseNumberPositiveInt: number | null | undefined;
    doseNumberString: string | null | undefined;
    seriesDosesPositiveInt: number | null | undefined;
    seriesDosesString: string | null | undefined;
    supportingImmunization: Reference[] | null | undefined;
    supportingPatientInformation: Reference[] | null | undefined;
}
