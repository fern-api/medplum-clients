"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Implementationguide_pageGeneration = void 0;
exports.Implementationguide_pageGeneration = {
    Html: "html",
    Markdown: "markdown",
    Xml: "xml",
    Generated: "generated",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Implementationguide_pageGeneration.Html:
                return visitor.html();
            case exports.Implementationguide_pageGeneration.Markdown:
                return visitor.markdown();
            case exports.Implementationguide_pageGeneration.Xml:
                return visitor.xml();
            case exports.Implementationguide_pageGeneration.Generated:
                return visitor.generated();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Implementationguide_pageGeneration.js.map