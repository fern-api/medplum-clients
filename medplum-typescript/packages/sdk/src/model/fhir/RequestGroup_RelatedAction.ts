import { code } from "./code";
import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { id } from "./id";
import { Range } from "./Range";

export interface RequestGroup_RelatedAction {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    actionId: id | null | undefined;
    relationship: code | null | undefined;
    offsetDuration: Duration | null | undefined;
    offsetRange: Range | null | undefined;
}
