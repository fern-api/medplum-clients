import { CodeableConcept } from "./CodeableConcept";
import { DataRequirement } from "./DataRequirement";
import { Duration } from "./Duration";
import { Expression } from "./Expression";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Researchelementdefinition_characteristicParticipanteffectivegroupmeasure } from "./Researchelementdefinition_characteristicParticipanteffectivegroupmeasure";
import { Researchelementdefinition_characteristicStudyeffectivegroupmeasure } from "./Researchelementdefinition_characteristicStudyeffectivegroupmeasure";
import { Timing } from "./Timing";
import { UsageContext } from "./UsageContext";

export interface ResearchElementDefinition_Characteristic {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    definitionCodeableConcept: CodeableConcept | null | undefined;
    definitionCanonical: string | null | undefined;
    definitionExpression: Expression | null | undefined;
    definitionDataRequirement: DataRequirement | null | undefined;
    usageContext: UsageContext[] | null | undefined;
    exclude: boolean | null | undefined;
    unitOfMeasure: CodeableConcept | null | undefined;
    studyEffectiveDescription: string | null | undefined;
    studyEffectiveDateTime: string | null | undefined;
    studyEffectivePeriod: Period | null | undefined;
    studyEffectiveDuration: Duration | null | undefined;
    studyEffectiveTiming: Timing | null | undefined;
    studyEffectiveTimeFromStart: Duration | null | undefined;
    studyEffectiveGroupMeasure: Researchelementdefinition_characteristicStudyeffectivegroupmeasure | null | undefined;
    participantEffectiveDescription: string | null | undefined;
    participantEffectiveDateTime: string | null | undefined;
    participantEffectivePeriod: Period | null | undefined;
    participantEffectiveDuration: Duration | null | undefined;
    participantEffectiveTiming: Timing | null | undefined;
    participantEffectiveTimeFromStart: Duration | null | undefined;
    participantEffectiveGroupMeasure: Researchelementdefinition_characteristicParticipanteffectivegroupmeasure | null | undefined;
}
