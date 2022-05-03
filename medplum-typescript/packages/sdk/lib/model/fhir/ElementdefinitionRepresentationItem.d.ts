export declare type ElementdefinitionRepresentationItem = ElementdefinitionRepresentationItem.XmlAttr | ElementdefinitionRepresentationItem.XmlText | ElementdefinitionRepresentationItem.TypeAttr | ElementdefinitionRepresentationItem.CdaText | ElementdefinitionRepresentationItem.Xhtml;
export declare const ElementdefinitionRepresentationItem: {
    XmlAttr: ElementdefinitionRepresentationItem.XmlAttr;
    XmlText: ElementdefinitionRepresentationItem.XmlText;
    TypeAttr: ElementdefinitionRepresentationItem.TypeAttr;
    CdaText: ElementdefinitionRepresentationItem.CdaText;
    Xhtml: ElementdefinitionRepresentationItem.Xhtml;
    _visit: <Result>(value: ElementdefinitionRepresentationItem, visitor: ElementdefinitionRepresentationItem._Visitor<Result>) => Result;
};
export declare namespace ElementdefinitionRepresentationItem {
    type XmlAttr = "xmlAttr" & {
        __XmlAttr: void;
    };
    type XmlText = "xmlText" & {
        __XmlText: void;
    };
    type TypeAttr = "typeAttr" & {
        __TypeAttr: void;
    };
    type CdaText = "cdaText" & {
        __CdaText: void;
    };
    type Xhtml = "xhtml" & {
        __Xhtml: void;
    };
    interface _Visitor<Result> {
        xmlAttr: () => Result;
        xmlText: () => Result;
        typeAttr: () => Result;
        cdaText: () => Result;
        xhtml: () => Result;
        _unknown: () => Result;
    }
}
