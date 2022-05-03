"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ElementdefinitionRepresentationItem = void 0;
exports.ElementdefinitionRepresentationItem = {
    XmlAttr: "xmlAttr",
    XmlText: "xmlText",
    TypeAttr: "typeAttr",
    CdaText: "cdaText",
    Xhtml: "xhtml",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ElementdefinitionRepresentationItem.XmlAttr:
                return visitor.xmlAttr();
            case exports.ElementdefinitionRepresentationItem.XmlText:
                return visitor.xmlText();
            case exports.ElementdefinitionRepresentationItem.TypeAttr:
                return visitor.typeAttr();
            case exports.ElementdefinitionRepresentationItem.CdaText:
                return visitor.cdaText();
            case exports.ElementdefinitionRepresentationItem.Xhtml:
                return visitor.xhtml();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ElementdefinitionRepresentationItem.js.map