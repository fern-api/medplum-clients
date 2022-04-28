import { canonical } from "./canonical";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { DataRequirement_CodeFilter } from "./DataRequirement_CodeFilter";
import { DataRequirement_DateFilter } from "./DataRequirement_DateFilter";
import { DataRequirement_Sort } from "./DataRequirement_Sort";
import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";
import { Reference } from "./Reference";

export interface DataRequirement {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    type: code | null | undefined;
    profile: canonical[] | null | undefined;
    subjectCodeableConcept: CodeableConcept | null | undefined;
    subjectReference: Reference | null | undefined;
    mustSupport: string[] | null | undefined;
    codeFilter: DataRequirement_CodeFilter[] | null | undefined;
    dateFilter: DataRequirement_DateFilter[] | null | undefined;
    limit: positiveInt | null | undefined;
    sort: DataRequirement_Sort[] | null | undefined;
}
