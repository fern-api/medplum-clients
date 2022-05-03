import { ContactpointSystem } from "./ContactpointSystem";
import { ContactpointUse } from "./ContactpointUse";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { positiveInt } from "./positiveInt";

export interface ContactPoint {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    system: ContactpointSystem | null | undefined;
    value: string | null | undefined;
    use: ContactpointUse | null | undefined;
    rank: positiveInt | null | undefined;
    period: Period | null | undefined;
}
