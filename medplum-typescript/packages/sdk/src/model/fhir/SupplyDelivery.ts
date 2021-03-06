import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { SupplydeliveryStatus } from "./SupplydeliveryStatus";
import { SupplyDelivery_SuppliedItem } from "./SupplyDelivery_SuppliedItem";
import { Timing } from "./Timing";
import { uri } from "./uri";

export interface SupplyDelivery {
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
    basedOn: Reference[] | null | undefined;
    partOf: Reference[] | null | undefined;
    status: SupplydeliveryStatus | null | undefined;
    patient: Reference | null | undefined;
    type: CodeableConcept | null | undefined;
    suppliedItem: SupplyDelivery_SuppliedItem | null | undefined;
    occurrenceDateTime: string | null | undefined;
    occurrencePeriod: Period | null | undefined;
    occurrenceTiming: Timing | null | undefined;
    supplier: Reference | null | undefined;
    destination: Reference | null | undefined;
    receiver: Reference[] | null | undefined;
}
