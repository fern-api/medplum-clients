import { CatalogentryStatus } from "./CatalogentryStatus";
import { CatalogEntry_RelatedEntry } from "./CatalogEntry_RelatedEntry";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface CatalogEntry {
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
    type: CodeableConcept | null | undefined;
    orderable: boolean | null | undefined;
    referencedItem: Reference;
    additionalIdentifier: Identifier[] | null | undefined;
    classification: CodeableConcept[] | null | undefined;
    status: CatalogentryStatus | null | undefined;
    validityPeriod: Period | null | undefined;
    validTo: dateTime | null | undefined;
    lastUpdated: dateTime | null | undefined;
    additionalCharacteristic: CodeableConcept[] | null | undefined;
    additionalClassification: CodeableConcept[] | null | undefined;
    relatedEntry: CatalogEntry_RelatedEntry[] | null | undefined;
}
