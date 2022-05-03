import { AddressType } from "./AddressType";
import { AddressUse } from "./AddressUse";
import { Extension } from "./Extension";
import { Period } from "./Period";

export interface Address {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    use: AddressUse | null | undefined;
    type: AddressType | null | undefined;
    text: string | null | undefined;
    line: string[] | null | undefined;
    city: string | null | undefined;
    district: string | null | undefined;
    state: string | null | undefined;
    postalCode: string | null | undefined;
    country: string | null | undefined;
    period: Period | null | undefined;
}
