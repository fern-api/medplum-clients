import { Extension } from "./Extension";
import { Period } from "./Period";

export interface BiologicallyDerivedProduct_Manipulation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    description: string | null | undefined;
    timeDateTime: string | null | undefined;
    timePeriod: Period | null | undefined;
}
