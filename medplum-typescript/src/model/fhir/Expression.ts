import { ExpressionLanguage } from "./ExpressionLanguage";
import { Extension } from "./Extension";
import { id } from "./id";
import { uri } from "./uri";

export interface Expression {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    description: string | null | undefined;
    name: id | null | undefined;
    language: ExpressionLanguage | null | undefined;
    expression: string | null | undefined;
    reference: uri | null | undefined;
}
