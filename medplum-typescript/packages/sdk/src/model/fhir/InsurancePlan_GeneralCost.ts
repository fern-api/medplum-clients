import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Money } from "./Money";
import { positiveInt } from "./positiveInt";

export interface InsurancePlan_GeneralCost {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept | null | undefined;
    groupSize: positiveInt | null | undefined;
    cost: Money | null | undefined;
    comment: string | null | undefined;
}
