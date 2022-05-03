import { Extension } from "./Extension";
export interface Element {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
}
