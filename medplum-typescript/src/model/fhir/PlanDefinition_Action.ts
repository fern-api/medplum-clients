import { Age } from "./Age";
import { canonical } from "./canonical";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { DataRequirement } from "./DataRequirement";
import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { id } from "./id";
import { Period } from "./Period";
import { PlanDefinition_Action } from "./PlanDefinition_Action";
import { Plandefinition_actionCardinalitybehavior } from "./Plandefinition_actionCardinalitybehavior";
import { Plandefinition_actionGroupingbehavior } from "./Plandefinition_actionGroupingbehavior";
import { Plandefinition_actionPrecheckbehavior } from "./Plandefinition_actionPrecheckbehavior";
import { Plandefinition_actionRequiredbehavior } from "./Plandefinition_actionRequiredbehavior";
import { Plandefinition_actionSelectionbehavior } from "./Plandefinition_actionSelectionbehavior";
import { PlanDefinition_Condition } from "./PlanDefinition_Condition";
import { PlanDefinition_DynamicValue } from "./PlanDefinition_DynamicValue";
import { PlanDefinition_Participant } from "./PlanDefinition_Participant";
import { PlanDefinition_RelatedAction } from "./PlanDefinition_RelatedAction";
import { Range } from "./Range";
import { Reference } from "./Reference";
import { RelatedArtifact } from "./RelatedArtifact";
import { Timing } from "./Timing";
import { TriggerDefinition } from "./TriggerDefinition";

export interface PlanDefinition_Action {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    prefix: string | null | undefined;
    title: string | null | undefined;
    description: string | null | undefined;
    textEquivalent: string | null | undefined;
    priority: code | null | undefined;
    code: CodeableConcept[] | null | undefined;
    reason: CodeableConcept[] | null | undefined;
    documentation: RelatedArtifact[] | null | undefined;
    goalId: id[] | null | undefined;
    subjectCodeableConcept: CodeableConcept | null | undefined;
    subjectReference: Reference | null | undefined;
    trigger: TriggerDefinition[] | null | undefined;
    condition: PlanDefinition_Condition[] | null | undefined;
    input: DataRequirement[] | null | undefined;
    output: DataRequirement[] | null | undefined;
    relatedAction: PlanDefinition_RelatedAction[] | null | undefined;
    timingDateTime: string | null | undefined;
    timingAge: Age | null | undefined;
    timingPeriod: Period | null | undefined;
    timingDuration: Duration | null | undefined;
    timingRange: Range | null | undefined;
    timingTiming: Timing | null | undefined;
    participant: PlanDefinition_Participant[] | null | undefined;
    type: CodeableConcept | null | undefined;
    groupingBehavior: Plandefinition_actionGroupingbehavior | null | undefined;
    selectionBehavior:
        | Plandefinition_actionSelectionbehavior
        | null
        | undefined;
    requiredBehavior: Plandefinition_actionRequiredbehavior | null | undefined;
    precheckBehavior: Plandefinition_actionPrecheckbehavior | null | undefined;
    cardinalityBehavior:
        | Plandefinition_actionCardinalitybehavior
        | null
        | undefined;
    definitionCanonical: string | null | undefined;
    definitionUri: string | null | undefined;
    transform: canonical | null | undefined;
    dynamicValue: PlanDefinition_DynamicValue[] | null | undefined;
    action: PlanDefinition_Action[] | null | undefined;
}
