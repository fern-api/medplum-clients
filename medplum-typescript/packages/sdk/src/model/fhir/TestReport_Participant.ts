import { Extension } from "./Extension";
import { Testreport_participantType } from "./Testreport_participantType";
import { uri } from "./uri";

export interface TestReport_Participant {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Testreport_participantType | null | undefined;
    uri: uri | null | undefined;
    display: string | null | undefined;
}
