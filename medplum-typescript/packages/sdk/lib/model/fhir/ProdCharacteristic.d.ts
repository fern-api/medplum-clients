import { Attachment } from "./Attachment";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
export interface ProdCharacteristic {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    height: Quantity | null | undefined;
    width: Quantity | null | undefined;
    depth: Quantity | null | undefined;
    weight: Quantity | null | undefined;
    nominalVolume: Quantity | null | undefined;
    externalDiameter: Quantity | null | undefined;
    shape: string | null | undefined;
    color: string[] | null | undefined;
    imprint: string[] | null | undefined;
    image: Attachment[] | null | undefined;
    scoring: CodeableConcept | null | undefined;
}
