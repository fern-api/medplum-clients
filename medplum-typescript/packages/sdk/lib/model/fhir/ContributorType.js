"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ContributorType = void 0;
exports.ContributorType = {
    Author: "author",
    Editor: "editor",
    Reviewer: "reviewer",
    Endorser: "endorser",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ContributorType.Author:
                return visitor.author();
            case exports.ContributorType.Editor:
                return visitor.editor();
            case exports.ContributorType.Reviewer:
                return visitor.reviewer();
            case exports.ContributorType.Endorser:
                return visitor.endorser();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ContributorType.js.map