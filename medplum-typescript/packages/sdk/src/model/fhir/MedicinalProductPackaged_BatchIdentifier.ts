import { Extension } from "./Extension";
import { Identifier } from "./Identifier";

export interface MedicinalProductPackaged_BatchIdentifier {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    outerPackaging: Identifier;
    immediatePackaging: Identifier | null | undefined;
}
