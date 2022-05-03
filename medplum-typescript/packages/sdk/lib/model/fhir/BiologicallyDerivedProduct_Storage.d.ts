import { Biologicallyderivedproduct_storageScale } from "./Biologicallyderivedproduct_storageScale";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { Period } from "./Period";
export interface BiologicallyDerivedProduct_Storage {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    description: string | null | undefined;
    temperature: decimal | null | undefined;
    scale: Biologicallyderivedproduct_storageScale | null | undefined;
    duration: Period | null | undefined;
}
