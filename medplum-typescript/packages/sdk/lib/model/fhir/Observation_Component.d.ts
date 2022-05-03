import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Observation_ReferenceRange } from "./Observation_ReferenceRange";
import { Period } from "./Period";
import { Quantity } from "./Quantity";
import { Range } from "./Range";
import { Ratio } from "./Ratio";
import { SampledData } from "./SampledData";
export interface Observation_Component {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept;
    valueQuantity: Quantity | null | undefined;
    valueCodeableConcept: CodeableConcept | null | undefined;
    valueString: string | null | undefined;
    valueBoolean: boolean | null | undefined;
    valueInteger: number | null | undefined;
    valueRange: Range | null | undefined;
    valueRatio: Ratio | null | undefined;
    valueSampledData: SampledData | null | undefined;
    valueTime: string | null | undefined;
    valueDateTime: string | null | undefined;
    valuePeriod: Period | null | undefined;
    dataAbsentReason: CodeableConcept | null | undefined;
    interpretation: CodeableConcept[] | null | undefined;
    referenceRange: Observation_ReferenceRange[] | null | undefined;
}
