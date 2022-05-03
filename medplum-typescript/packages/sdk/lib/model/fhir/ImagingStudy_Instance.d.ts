import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { id } from "./id";
import { unsignedInt } from "./unsignedInt";
export interface ImagingStudy_Instance {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    uid: id | null | undefined;
    sopClass: Coding;
    number: unsignedInt | null | undefined;
    title: string | null | undefined;
}
