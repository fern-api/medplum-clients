"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Datarequirement_sortDirection = void 0;
exports.Datarequirement_sortDirection = {
    Ascending: "ascending",
    Descending: "descending",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Datarequirement_sortDirection.Ascending:
                return visitor.ascending();
            case exports.Datarequirement_sortDirection.Descending:
                return visitor.descending();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Datarequirement_sortDirection.js.map