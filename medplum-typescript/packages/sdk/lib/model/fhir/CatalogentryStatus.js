"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CatalogentryStatus = void 0;
exports.CatalogentryStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.CatalogentryStatus.Draft:
                return visitor.draft();
            case exports.CatalogentryStatus.Active:
                return visitor.active();
            case exports.CatalogentryStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=CatalogentryStatus.js.map