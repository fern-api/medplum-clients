import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { id } from "./id";
import { Plandefinition_relatedactionRelationship } from "./Plandefinition_relatedactionRelationship";
import { Range } from "./Range";

export interface PlanDefinition_RelatedAction {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    actionId: id | null | undefined;
    relationship: Plandefinition_relatedactionRelationship | null | undefined;
    offsetDuration: Duration | null | undefined;
    offsetRange: Range | null | undefined;
}
