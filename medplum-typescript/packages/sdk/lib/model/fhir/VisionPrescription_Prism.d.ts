import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { Visionprescription_prismBase } from "./Visionprescription_prismBase";
export interface VisionPrescription_Prism {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    amount: decimal | null | undefined;
    base: Visionprescription_prismBase | null | undefined;
}
