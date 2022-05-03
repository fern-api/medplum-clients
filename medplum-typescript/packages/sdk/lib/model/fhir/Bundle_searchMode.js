"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Bundle_searchMode = void 0;
exports.Bundle_searchMode = {
    Match: "match",
    Include: "include",
    Outcome: "outcome",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Bundle_searchMode.Match:
                return visitor.match();
            case exports.Bundle_searchMode.Include:
                return visitor.include();
            case exports.Bundle_searchMode.Outcome:
                return visitor.outcome();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Bundle_searchMode.js.map