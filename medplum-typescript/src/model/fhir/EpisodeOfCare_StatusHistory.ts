import { Episodeofcare_statushistoryStatus } from "./Episodeofcare_statushistoryStatus";
import { Extension } from "./Extension";
import { Period } from "./Period";

export interface EpisodeOfCare_StatusHistory {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    status: Episodeofcare_statushistoryStatus | null | undefined;
    period: Period;
}
