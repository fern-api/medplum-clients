import { Annotation } from "./Annotation";
import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Visionprescription_lensspecificationEye } from "./Visionprescription_lensspecificationEye";
import { VisionPrescription_Prism } from "./VisionPrescription_Prism";
export interface VisionPrescription_LensSpecification {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    product: CodeableConcept;
    eye: Visionprescription_lensspecificationEye | null | undefined;
    sphere: decimal | null | undefined;
    cylinder: decimal | null | undefined;
    axis: number | null | undefined;
    prism: VisionPrescription_Prism[] | null | undefined;
    add: decimal | null | undefined;
    power: decimal | null | undefined;
    backCurve: decimal | null | undefined;
    diameter: decimal | null | undefined;
    duration: Quantity | null | undefined;
    color: string | null | undefined;
    brand: string | null | undefined;
    note: Annotation[] | null | undefined;
}
