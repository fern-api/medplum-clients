"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Catalogentry_relatedentryRelationtype = void 0;
exports.Catalogentry_relatedentryRelationtype = {
    Triggers: "triggers",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Catalogentry_relatedentryRelationtype.Triggers:
                return visitor.triggers();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Catalogentry_relatedentryRelationtype.js.map