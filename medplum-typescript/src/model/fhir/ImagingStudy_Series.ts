import { Coding } from "./Coding";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { ImagingStudy_Instance } from "./ImagingStudy_Instance";
import { ImagingStudy_Performer } from "./ImagingStudy_Performer";
import { Reference } from "./Reference";
import { unsignedInt } from "./unsignedInt";

export interface ImagingStudy_Series {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    uid: id | null | undefined;
    number: unsignedInt | null | undefined;
    modality: Coding;
    description: string | null | undefined;
    numberOfInstances: unsignedInt | null | undefined;
    endpoint: Reference[] | null | undefined;
    bodySite: Coding | null | undefined;
    laterality: Coding | null | undefined;
    specimen: Reference[] | null | undefined;
    started: dateTime | null | undefined;
    performer: ImagingStudy_Performer[] | null | undefined;
    instance: ImagingStudy_Instance[] | null | undefined;
}
