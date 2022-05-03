import { code } from "./code";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
export interface Money {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    value: decimal | null | undefined;
    currency: code | null | undefined;
}
