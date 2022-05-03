"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.BiologicallyderivedproductProductcategory = void 0;
exports.BiologicallyderivedproductProductcategory = {
    Organ: "organ",
    Tissue: "tissue",
    Fluid: "fluid",
    Cells: "cells",
    BiologicalAgent: "biologicalAgent",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.BiologicallyderivedproductProductcategory.Organ:
                return visitor.organ();
            case exports.BiologicallyderivedproductProductcategory.Tissue:
                return visitor.tissue();
            case exports.BiologicallyderivedproductProductcategory.Fluid:
                return visitor.fluid();
            case exports.BiologicallyderivedproductProductcategory.Cells:
                return visitor.cells();
            case exports.BiologicallyderivedproductProductcategory.BiologicalAgent:
                return visitor.biologicalAgent();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=BiologicallyderivedproductProductcategory.js.map