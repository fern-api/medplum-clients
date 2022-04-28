import { code } from "./code";
import { id } from "./id";
import { Meta } from "./Meta";
import { Parameters_Parameter } from "./Parameters_Parameter";
import { uri } from "./uri";

export interface Parameters {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    parameter: Parameters_Parameter[] | null | undefined;
}
