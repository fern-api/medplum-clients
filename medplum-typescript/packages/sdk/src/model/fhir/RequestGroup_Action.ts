import { Age } from "./Age";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Range } from "./Range";
import { Reference } from "./Reference";
import { RelatedArtifact } from "./RelatedArtifact";
import { RequestGroup_Condition } from "./RequestGroup_Condition";
import { RequestGroup_RelatedAction } from "./RequestGroup_RelatedAction";
import { Timing } from "./Timing";

export interface RequestGroup_Action {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    prefix: string | null | undefined;
    title: string | null | undefined;
    description: string | null | undefined;
    textEquivalent: string | null | undefined;
    priority: code | null | undefined;
    code: CodeableConcept[] | null | undefined;
    documentation: RelatedArtifact[] | null | undefined;
    condition: RequestGroup_Condition[] | null | undefined;
    relatedAction: RequestGroup_RelatedAction[] | null | undefined;
    timingDateTime: string | null | undefined;
    timingAge: Age | null | undefined;
    timingPeriod: Period | null | undefined;
    timingDuration: Duration | null | undefined;
    timingRange: Range | null | undefined;
    timingTiming: Timing | null | undefined;
    participant: Reference[] | null | undefined;
    type: CodeableConcept | null | undefined;
    groupingBehavior: code | null | undefined;
    selectionBehavior: code | null | undefined;
    requiredBehavior: code | null | undefined;
    precheckBehavior: code | null | undefined;
    cardinalityBehavior: code | null | undefined;
    resource: Reference | null | undefined;
    action: RequestGroup_Action[] | null | undefined;
}
