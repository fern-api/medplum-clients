"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Person_linkAssurance = void 0;
exports.Person_linkAssurance = {
    Level1: "level1",
    Level2: "level2",
    Level3: "level3",
    Level4: "level4",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Person_linkAssurance.Level1:
                return visitor.level1();
            case exports.Person_linkAssurance.Level2:
                return visitor.level2();
            case exports.Person_linkAssurance.Level3:
                return visitor.level3();
            case exports.Person_linkAssurance.Level4:
                return visitor.level4();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Person_linkAssurance.js.map