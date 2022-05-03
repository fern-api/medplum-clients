export type Structuredefinition_contextType =
    | Structuredefinition_contextType.Fhirpath
    | Structuredefinition_contextType.Element
    | Structuredefinition_contextType.Extension;

export const Structuredefinition_contextType = {
    Fhirpath: "fhirpath" as Structuredefinition_contextType.Fhirpath,
    Element: "element" as Structuredefinition_contextType.Element,
    Extension: "extension" as Structuredefinition_contextType.Extension,

    _visit: <Result>(
        value: Structuredefinition_contextType,
        visitor: Structuredefinition_contextType._Visitor<Result>
    ): Result => {
        switch (value) {
            case Structuredefinition_contextType.Fhirpath:
                return visitor.fhirpath();
            case Structuredefinition_contextType.Element:
                return visitor.element();
            case Structuredefinition_contextType.Extension:
                return visitor.extension();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Structuredefinition_contextType {
    export type Fhirpath = "fhirpath" & {
        __Fhirpath: void;
    };
    export type Element = "element" & {
        __Element: void;
    };
    export type Extension = "extension" & {
        __Extension: void;
    };

    export interface _Visitor<Result> {
        fhirpath: () => Result;
        element: () => Result;
        extension: () => Result;
        _unknown: () => Result;
    }
}
