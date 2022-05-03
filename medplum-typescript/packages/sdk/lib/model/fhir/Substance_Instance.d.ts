import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Quantity } from "./Quantity";
export interface Substance_Instance {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier | null | undefined;
    expiry: dateTime | null | undefined;
    quantity: Quantity | null | undefined;
}
