import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { SupplyrequestStatus } from "./SupplyrequestStatus";
import { SupplyRequest_Parameter } from "./SupplyRequest_Parameter";
import { Timing } from "./Timing";
import { uri } from "./uri";

export interface SupplyRequest {
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
    status: SupplyrequestStatus | null | undefined;
    category: CodeableConcept | null | undefined;
    priority: code | null | undefined;
    itemCodeableConcept: CodeableConcept | null | undefined;
    itemReference: Reference | null | undefined;
    quantity: Quantity;
    parameter: SupplyRequest_Parameter[] | null | undefined;
    occurrenceDateTime: string | null | undefined;
    occurrencePeriod: Period | null | undefined;
    occurrenceTiming: Timing | null | undefined;
    authoredOn: dateTime | null | undefined;
    requester: Reference | null | undefined;
    supplier: Reference[] | null | undefined;
    reasonCode: CodeableConcept[] | null | undefined;
    reasonReference: Reference[] | null | undefined;
    deliverFrom: Reference | null | undefined;
    deliverTo: Reference | null | undefined;
}