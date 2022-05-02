import { Annotation } from "./Annotation";
import { canonical } from "./canonical";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { NutritionOrder_EnteralFormula } from "./NutritionOrder_EnteralFormula";
import { NutritionOrder_OralDiet } from "./NutritionOrder_OralDiet";
import { NutritionOrder_Supplement } from "./NutritionOrder_Supplement";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface NutritionOrder {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    instantiatesCanonical: canonical[] | null | undefined;
    instantiatesUri: uri[] | null | undefined;
    instantiates: uri[] | null | undefined;
    status: code | null | undefined;
    intent: code | null | undefined;
    patient: Reference;
    encounter: Reference | null | undefined;
    dateTime: dateTime | null | undefined;
    orderer: Reference | null | undefined;
    allergyIntolerance: Reference[] | null | undefined;
    foodPreferenceModifier: CodeableConcept[] | null | undefined;
    excludeFoodModifier: CodeableConcept[] | null | undefined;
    oralDiet: NutritionOrder_OralDiet | null | undefined;
    supplement: NutritionOrder_Supplement[] | null | undefined;
    enteralFormula: NutritionOrder_EnteralFormula | null | undefined;
    note: Annotation[] | null | undefined;
}