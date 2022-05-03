import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface MeasureReport_Component {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept;
    value: CodeableConcept;
}
