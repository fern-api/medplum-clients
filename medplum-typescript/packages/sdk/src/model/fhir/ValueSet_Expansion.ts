import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { uri } from "./uri";
import { ValueSet_Contains } from "./ValueSet_Contains";
import { ValueSet_Parameter } from "./ValueSet_Parameter";

export interface ValueSet_Expansion {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: uri | null | undefined;
    timestamp: dateTime | null | undefined;
    total: number | null | undefined;
    offset: number | null | undefined;
    parameter: ValueSet_Parameter[] | null | undefined;
    contains: ValueSet_Contains[] | null | undefined;
}
