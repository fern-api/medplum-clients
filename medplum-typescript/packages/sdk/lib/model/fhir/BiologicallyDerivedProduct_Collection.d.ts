import { Extension } from "./Extension";
import { Period } from "./Period";
import { Reference } from "./Reference";
export interface BiologicallyDerivedProduct_Collection {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    collector: Reference | null | undefined;
    source: Reference | null | undefined;
    collectedDateTime: string | null | undefined;
    collectedPeriod: Period | null | undefined;
}
