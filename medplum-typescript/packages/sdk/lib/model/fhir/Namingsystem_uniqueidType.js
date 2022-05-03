"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Namingsystem_uniqueidType = void 0;
exports.Namingsystem_uniqueidType = {
    Oid: "oid",
    Uuid: "uuid",
    Uri: "uri",
    Other: "other",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Namingsystem_uniqueidType.Oid:
                return visitor.oid();
            case exports.Namingsystem_uniqueidType.Uuid:
                return visitor.uuid();
            case exports.Namingsystem_uniqueidType.Uri:
                return visitor.uri();
            case exports.Namingsystem_uniqueidType.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Namingsystem_uniqueidType.js.map