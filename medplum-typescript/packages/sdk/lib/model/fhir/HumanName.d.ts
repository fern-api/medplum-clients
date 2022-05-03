import { Extension } from "./Extension";
import { HumannameUse } from "./HumannameUse";
import { Period } from "./Period";
export interface HumanName {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    use: HumannameUse | null | undefined;
    text: string | null | undefined;
    family: string | null | undefined;
    given: string[] | null | undefined;
    prefix: string[] | null | undefined;
    suffix: string[] | null | undefined;
    period: Period | null | undefined;
}
