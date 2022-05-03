"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.LibraryStatus = void 0;
exports.LibraryStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.LibraryStatus.Draft:
                return visitor.draft();
            case exports.LibraryStatus.Active:
                return visitor.active();
            case exports.LibraryStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=LibraryStatus.js.map