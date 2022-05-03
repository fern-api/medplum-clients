import { dateTime } from "./dateTime";
import { Extension } from "./Extension";

export interface Period {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    start: dateTime | null | undefined;
    end: dateTime | null | undefined;
}
