"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CodesystemContent = void 0;
exports.CodesystemContent = {
    Example: "example",
    Fragment: "fragment",
    Complete: "complete",
    Supplement: "supplement",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.CodesystemContent.Example:
                return visitor.example();
            case exports.CodesystemContent.Fragment:
                return visitor.fragment();
            case exports.CodesystemContent.Complete:
                return visitor.complete();
            case exports.CodesystemContent.Supplement:
                return visitor.supplement();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=CodesystemContent.js.map