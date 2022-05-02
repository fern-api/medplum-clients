import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { PlanDefinition_Target } from "./PlanDefinition_Target";
import { RelatedArtifact } from "./RelatedArtifact";

export interface PlanDefinition_Goal {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    category: CodeableConcept | null | undefined;
    description: CodeableConcept;
    priority: CodeableConcept | null | undefined;
    start: CodeableConcept | null | undefined;
    addresses: CodeableConcept[] | null | undefined;
    documentation: RelatedArtifact[] | null | undefined;
    target: PlanDefinition_Target[] | null | undefined;
}
