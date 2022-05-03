export declare type Implementationguide_pageGeneration = Implementationguide_pageGeneration.Html | Implementationguide_pageGeneration.Markdown | Implementationguide_pageGeneration.Xml | Implementationguide_pageGeneration.Generated;
export declare const Implementationguide_pageGeneration: {
    Html: Implementationguide_pageGeneration.Html;
    Markdown: Implementationguide_pageGeneration.Markdown;
    Xml: Implementationguide_pageGeneration.Xml;
    Generated: Implementationguide_pageGeneration.Generated;
    _visit: <Result>(value: Implementationguide_pageGeneration, visitor: Implementationguide_pageGeneration._Visitor<Result>) => Result;
};
export declare namespace Implementationguide_pageGeneration {
    type Html = "html" & {
        __Html: void;
    };
    type Markdown = "markdown" & {
        __Markdown: void;
    };
    type Xml = "xml" & {
        __Xml: void;
    };
    type Generated = "generated" & {
        __Generated: void;
    };
    interface _Visitor<Result> {
        html: () => Result;
        markdown: () => Result;
        xml: () => Result;
        generated: () => Result;
        _unknown: () => Result;
    }
}
