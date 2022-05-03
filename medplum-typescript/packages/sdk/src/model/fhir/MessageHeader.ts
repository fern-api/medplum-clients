import { canonical } from "./canonical";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { id } from "./id";
import { MessageHeader_Destination } from "./MessageHeader_Destination";
import { MessageHeader_Response } from "./MessageHeader_Response";
import { MessageHeader_Source } from "./MessageHeader_Source";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MessageHeader {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    eventCoding: Coding | null | undefined;
    eventUri: string | null | undefined;
    destination: MessageHeader_Destination[] | null | undefined;
    sender: Reference | null | undefined;
    enterer: Reference | null | undefined;
    author: Reference | null | undefined;
    source: MessageHeader_Source;
    responsible: Reference | null | undefined;
    reason: CodeableConcept | null | undefined;
    response: MessageHeader_Response | null | undefined;
    focus: Reference[] | null | undefined;
    definition: canonical | null | undefined;
}
