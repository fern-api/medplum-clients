import { Extension } from "./Extension";
import { Namingsystem_uniqueidType } from "./Namingsystem_uniqueidType";
import { Period } from "./Period";
export interface NamingSystem_UniqueId {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Namingsystem_uniqueidType | null | undefined;
    value: string | null | undefined;
    preferred: boolean | null | undefined;
    comment: string | null | undefined;
    period: Period | null | undefined;
}
