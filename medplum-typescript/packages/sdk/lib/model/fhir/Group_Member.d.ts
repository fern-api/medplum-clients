import { Extension } from "./Extension";
import { Period } from "./Period";
import { Reference } from "./Reference";
export interface Group_Member {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    entity: Reference;
    period: Period | null | undefined;
    inactive: boolean | null | undefined;
}
