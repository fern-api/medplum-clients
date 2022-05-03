import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";
import { Quantity } from "./Quantity";
export interface SampledData {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    origin: Quantity;
    period: decimal | null | undefined;
    factor: decimal | null | undefined;
    lowerLimit: decimal | null | undefined;
    upperLimit: decimal | null | undefined;
    dimensions: positiveInt | null | undefined;
    data: string | null | undefined;
}
