import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { MedicinalProductAuthorization_Procedure } from "./MedicinalProductAuthorization_Procedure";
import { Period } from "./Period";

export interface MedicinalProductAuthorization_Procedure {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier | null | undefined;
    type: CodeableConcept;
    datePeriod: Period | null | undefined;
    dateDateTime: string | null | undefined;
    application: MedicinalProductAuthorization_Procedure[] | null | undefined;
}
