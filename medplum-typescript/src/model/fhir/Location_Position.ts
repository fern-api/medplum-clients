import { decimal } from "./decimal";
import { Extension } from "./Extension";

export interface Location_Position {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    longitude: decimal | null | undefined;
    latitude: decimal | null | undefined;
    altitude: decimal | null | undefined;
}
