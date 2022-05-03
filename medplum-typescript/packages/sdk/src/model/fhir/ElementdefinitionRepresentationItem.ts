export type ElementdefinitionRepresentationItem =
    | ElementdefinitionRepresentationItem.XmlAttr
    | ElementdefinitionRepresentationItem.XmlText
    | ElementdefinitionRepresentationItem.TypeAttr
    | ElementdefinitionRepresentationItem.CdaText
    | ElementdefinitionRepresentationItem.Xhtml;

export const ElementdefinitionRepresentationItem = {
    XmlAttr: "xmlAttr" as ElementdefinitionRepresentationItem.XmlAttr,
    XmlText: "xmlText" as ElementdefinitionRepresentationItem.XmlText,
    TypeAttr: "typeAttr" as ElementdefinitionRepresentationItem.TypeAttr,
    CdaText: "cdaText" as ElementdefinitionRepresentationItem.CdaText,
    Xhtml: "xhtml" as ElementdefinitionRepresentationItem.Xhtml,

    _visit: <Result>(
        value: ElementdefinitionRepresentationItem,
        visitor: ElementdefinitionRepresentationItem._Visitor<Result>
    ): Result => {
        switch (value) {
            case ElementdefinitionRepresentationItem.XmlAttr:
                return visitor.xmlAttr();
            case ElementdefinitionRepresentationItem.XmlText:
                return visitor.xmlText();
            case ElementdefinitionRepresentationItem.TypeAttr:
                return visitor.typeAttr();
            case ElementdefinitionRepresentationItem.CdaText:
                return visitor.cdaText();
            case ElementdefinitionRepresentationItem.Xhtml:
                return visitor.xhtml();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace ElementdefinitionRepresentationItem {
    export type XmlAttr = "xmlAttr" & {
        __XmlAttr: void;
    };
    export type XmlText = "xmlText" & {
        __XmlText: void;
    };
    export type TypeAttr = "typeAttr" & {
        __TypeAttr: void;
    };
    export type CdaText = "cdaText" & {
        __CdaText: void;
    };
    export type Xhtml = "xhtml" & {
        __Xhtml: void;
    };

    export interface _Visitor<Result> {
        xmlAttr: () => Result;
        xmlText: () => Result;
        typeAttr: () => Result;
        cdaText: () => Result;
        xhtml: () => Result;
        _unknown: () => Result;
    }
}
