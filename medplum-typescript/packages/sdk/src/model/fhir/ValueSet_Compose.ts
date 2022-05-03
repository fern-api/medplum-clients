import { date } from "./date";
import { Extension } from "./Extension";
import { ValueSet_Include } from "./ValueSet_Include";

export interface ValueSet_Compose {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    lockedDate: date | null | undefined;
    inactive: boolean | null | undefined;
    include: ValueSet_Include[];
    exclude: ValueSet_Include[] | null | undefined;
}
