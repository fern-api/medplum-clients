export declare type Structuredefinition_contextType = Structuredefinition_contextType.Fhirpath | Structuredefinition_contextType.Element | Structuredefinition_contextType.Extension;
export declare const Structuredefinition_contextType: {
    Fhirpath: Structuredefinition_contextType.Fhirpath;
    Element: Structuredefinition_contextType.Element;
    Extension: Structuredefinition_contextType.Extension;
    _visit: <Result>(value: Structuredefinition_contextType, visitor: Structuredefinition_contextType._Visitor<Result>) => Result;
};
export declare namespace Structuredefinition_contextType {
    type Fhirpath = "fhirpath" & {
        __Fhirpath: void;
    };
    type Element = "element" & {
        __Element: void;
    };
    type Extension = "extension" & {
        __Extension: void;
    };
    interface _Visitor<Result> {
        fhirpath: () => Result;
        element: () => Result;
        extension: () => Result;
        _unknown: () => Result;
    }
}
