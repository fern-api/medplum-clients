import { CodeableConcept } from "./CodeableConcept";
import { DataRequirement } from "./DataRequirement";
import { Duration } from "./Duration";
import { Evidencevariable_characteristicGroupmeasure } from "./Evidencevariable_characteristicGroupmeasure";
import { Expression } from "./Expression";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { Timing } from "./Timing";
import { TriggerDefinition } from "./TriggerDefinition";
import { UsageContext } from "./UsageContext";

export interface EvidenceVariable_Characteristic {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    description: string | null | undefined;
    definitionReference: Reference | null | undefined;
    definitionCanonical: string | null | undefined;
    definitionCodeableConcept: CodeableConcept | null | undefined;
    definitionExpression: Expression | null | undefined;
    definitionDataRequirement: DataRequirement | null | undefined;
    definitionTriggerDefinition: TriggerDefinition | null | undefined;
    usageContext: UsageContext[] | null | undefined;
    exclude: boolean | null | undefined;
    participantEffectiveDateTime: string | null | undefined;
    participantEffectivePeriod: Period | null | undefined;
    participantEffectiveDuration: Duration | null | undefined;
    participantEffectiveTiming: Timing | null | undefined;
    timeFromStart: Duration | null | undefined;
    groupMeasure:
        | Evidencevariable_characteristicGroupmeasure
        | null
        | undefined;
}
