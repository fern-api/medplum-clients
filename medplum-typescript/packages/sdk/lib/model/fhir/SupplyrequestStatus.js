"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SupplyrequestStatus = void 0;
exports.SupplyrequestStatus = {
    Draft: "draft",
    Active: "active",
    Suspended: "suspended",
    Cancelled: "cancelled",
    Completed: "completed",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.SupplyrequestStatus.Draft:
                return visitor.draft();
            case exports.SupplyrequestStatus.Active:
                return visitor.active();
            case exports.SupplyrequestStatus.Suspended:
                return visitor.suspended();
            case exports.SupplyrequestStatus.Cancelled:
                return visitor.cancelled();
            case exports.SupplyrequestStatus.Completed:
                return visitor.completed();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=SupplyrequestStatus.js.map