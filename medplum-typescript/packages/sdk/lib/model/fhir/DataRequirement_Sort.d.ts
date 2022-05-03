import { Datarequirement_sortDirection } from "./Datarequirement_sortDirection";
import { Extension } from "./Extension";
export interface DataRequirement_Sort {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    path: string | null | undefined;
    direction: Datarequirement_sortDirection | null | undefined;
}
