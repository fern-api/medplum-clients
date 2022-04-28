export type Implementationguide_pageGeneration =
    | Implementationguide_pageGeneration.Html
    | Implementationguide_pageGeneration.Markdown
    | Implementationguide_pageGeneration.Xml
    | Implementationguide_pageGeneration.Generated;

export const Implementationguide_pageGeneration = {
    Html: "html" as Implementationguide_pageGeneration.Html,
    Markdown: "markdown" as Implementationguide_pageGeneration.Markdown,
    Xml: "xml" as Implementationguide_pageGeneration.Xml,
    Generated: "generated" as Implementationguide_pageGeneration.Generated,

    _visit: <Result>(value: Implementationguide_pageGeneration, visitor: Implementationguide_pageGeneration._Visitor<Result>): Result => {
        switch (value) {
            case Implementationguide_pageGeneration.Html: return visitor.html();
            case Implementationguide_pageGeneration.Markdown: return visitor.markdown();
            case Implementationguide_pageGeneration.Xml: return visitor.xml();
            case Implementationguide_pageGeneration.Generated: return visitor.generated();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Implementationguide_pageGeneration {
    export type Html = "html" & {
        __Html: void,
    };
    export type Markdown = "markdown" & {
        __Markdown: void,
    };
    export type Xml = "xml" & {
        __Xml: void,
    };
    export type Generated = "generated" & {
        __Generated: void,
    };

    export interface _Visitor<Result> {
        html: () => Result;
        markdown: () => Result;
        xml: () => Result;
        generated: () => Result;
        _unknown: () => Result;
    }
}
