"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.BundleType = void 0;
exports.BundleType = {
    Document: "document",
    Message: "message",
    Transaction: "transaction",
    Batch: "batch",
    History: "history",
    Searchset: "searchset",
    Collection: "collection",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.BundleType.Document:
                return visitor.document();
            case exports.BundleType.Message:
                return visitor.message();
            case exports.BundleType.Transaction:
                return visitor.transaction();
            case exports.BundleType.Batch:
                return visitor.batch();
            case exports.BundleType.History:
                return visitor.history();
            case exports.BundleType.Searchset:
                return visitor.searchset();
            case exports.BundleType.Collection:
                return visitor.collection();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=BundleType.js.map