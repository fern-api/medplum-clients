import { DataRequirement } from "./DataRequirement";
import { Expression } from "./Expression";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
import { Timing } from "./Timing";
import { TriggerdefinitionType } from "./TriggerdefinitionType";
export interface TriggerDefinition {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    type: TriggerdefinitionType | null | undefined;
    name: string | null | undefined;
    timingTiming: Timing | null | undefined;
    timingReference: Reference | null | undefined;
    timingDate: string | null | undefined;
    timingDateTime: string | null | undefined;
    data: DataRequirement[] | null | undefined;
    condition: Expression | null | undefined;
}
