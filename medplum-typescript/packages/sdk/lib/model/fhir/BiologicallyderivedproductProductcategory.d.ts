export declare type BiologicallyderivedproductProductcategory = BiologicallyderivedproductProductcategory.Organ | BiologicallyderivedproductProductcategory.Tissue | BiologicallyderivedproductProductcategory.Fluid | BiologicallyderivedproductProductcategory.Cells | BiologicallyderivedproductProductcategory.BiologicalAgent;
export declare const BiologicallyderivedproductProductcategory: {
    Organ: BiologicallyderivedproductProductcategory.Organ;
    Tissue: BiologicallyderivedproductProductcategory.Tissue;
    Fluid: BiologicallyderivedproductProductcategory.Fluid;
    Cells: BiologicallyderivedproductProductcategory.Cells;
    BiologicalAgent: BiologicallyderivedproductProductcategory.BiologicalAgent;
    _visit: <Result>(value: BiologicallyderivedproductProductcategory, visitor: BiologicallyderivedproductProductcategory._Visitor<Result>) => Result;
};
export declare namespace BiologicallyderivedproductProductcategory {
    type Organ = "organ" & {
        __Organ: void;
    };
    type Tissue = "tissue" & {
        __Tissue: void;
    };
    type Fluid = "fluid" & {
        __Fluid: void;
    };
    type Cells = "cells" & {
        __Cells: void;
    };
    type BiologicalAgent = "biologicalAgent" & {
        __BiologicalAgent: void;
    };
    interface _Visitor<Result> {
        organ: () => Result;
        tissue: () => Result;
        fluid: () => Result;
        cells: () => Result;
        biologicalAgent: () => Result;
        _unknown: () => Result;
    }
}
