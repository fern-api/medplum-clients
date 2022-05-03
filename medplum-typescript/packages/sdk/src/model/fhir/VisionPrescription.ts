import { code } from "./code";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
import { VisionPrescription_LensSpecification } from "./VisionPrescription_LensSpecification";

export interface VisionPrescription {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    status: code | null | undefined;
    created: dateTime | null | undefined;
    patient: Reference;
    encounter: Reference | null | undefined;
    dateWritten: dateTime | null | undefined;
    prescriber: Reference;
    lensSpecification: VisionPrescription_LensSpecification[];
}
