export type BiologicallyderivedproductProductcategory =
    | BiologicallyderivedproductProductcategory.Organ
    | BiologicallyderivedproductProductcategory.Tissue
    | BiologicallyderivedproductProductcategory.Fluid
    | BiologicallyderivedproductProductcategory.Cells
    | BiologicallyderivedproductProductcategory.BiologicalAgent;

export const BiologicallyderivedproductProductcategory = {
    Organ: "organ" as BiologicallyderivedproductProductcategory.Organ,
    Tissue: "tissue" as BiologicallyderivedproductProductcategory.Tissue,
    Fluid: "fluid" as BiologicallyderivedproductProductcategory.Fluid,
    Cells: "cells" as BiologicallyderivedproductProductcategory.Cells,
    BiologicalAgent:
        "biologicalAgent" as BiologicallyderivedproductProductcategory.BiologicalAgent,

    _visit: <Result>(
        value: BiologicallyderivedproductProductcategory,
        visitor: BiologicallyderivedproductProductcategory._Visitor<Result>
    ): Result => {
        switch (value) {
            case BiologicallyderivedproductProductcategory.Organ:
                return visitor.organ();
            case BiologicallyderivedproductProductcategory.Tissue:
                return visitor.tissue();
            case BiologicallyderivedproductProductcategory.Fluid:
                return visitor.fluid();
            case BiologicallyderivedproductProductcategory.Cells:
                return visitor.cells();
            case BiologicallyderivedproductProductcategory.BiologicalAgent:
                return visitor.biologicalAgent();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace BiologicallyderivedproductProductcategory {
    export type Organ = "organ" & {
        __Organ: void;
    };
    export type Tissue = "tissue" & {
        __Tissue: void;
    };
    export type Fluid = "fluid" & {
        __Fluid: void;
    };
    export type Cells = "cells" & {
        __Cells: void;
    };
    export type BiologicalAgent = "biologicalAgent" & {
        __BiologicalAgent: void;
    };

    export interface _Visitor<Result> {
        organ: () => Result;
        tissue: () => Result;
        fluid: () => Result;
        cells: () => Result;
        biologicalAgent: () => Result;
        _unknown: () => Result;
    }
}
