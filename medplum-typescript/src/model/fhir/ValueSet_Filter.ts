import { code } from "./code";
import { Extension } from "./Extension";
import { Valueset_filterOp } from "./Valueset_filterOp";

export interface ValueSet_Filter {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    property: code | null | undefined;
    op: Valueset_filterOp | null | undefined;
    value: string | null | undefined;
}
