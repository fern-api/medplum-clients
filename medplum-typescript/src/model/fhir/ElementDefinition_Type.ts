import { canonical } from "./canonical";
import { Elementdefinition_typeAggregationItem } from "./Elementdefinition_typeAggregationItem";
import { Elementdefinition_typeVersioning } from "./Elementdefinition_typeVersioning";
import { Extension } from "./Extension";
import { uri } from "./uri";

export interface ElementDefinition_Type {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: uri | null | undefined;
    profile: canonical[] | null | undefined;
    targetProfile: canonical[] | null | undefined;
    aggregation: Elementdefinition_typeAggregationItem[] | null | undefined;
    versioning: Elementdefinition_typeVersioning | null | undefined;
}
