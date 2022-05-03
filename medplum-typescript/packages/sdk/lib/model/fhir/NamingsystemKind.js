"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.NamingsystemKind = void 0;
exports.NamingsystemKind = {
    Codesystem: "codesystem",
    Identifier: "identifier",
    Root: "root",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.NamingsystemKind.Codesystem:
                return visitor.codesystem();
            case exports.NamingsystemKind.Identifier:
                return visitor.identifier();
            case exports.NamingsystemKind.Root:
                return visitor.root();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=NamingsystemKind.js.map