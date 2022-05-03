export declare type Structuremap_targetTransform = Structuremap_targetTransform.Create | Structuremap_targetTransform.Copy | Structuremap_targetTransform.Truncate | Structuremap_targetTransform.Escape | Structuremap_targetTransform.Cast | Structuremap_targetTransform.Append | Structuremap_targetTransform.Translate | Structuremap_targetTransform.Reference | Structuremap_targetTransform.DateOp | Structuremap_targetTransform.Uuid | Structuremap_targetTransform.Pointer | Structuremap_targetTransform.Evaluate | Structuremap_targetTransform.Cc | Structuremap_targetTransform.C | Structuremap_targetTransform.Qty | Structuremap_targetTransform.Id | Structuremap_targetTransform.Cp;
export declare const Structuremap_targetTransform: {
    Create: Structuremap_targetTransform.Create;
    Copy: Structuremap_targetTransform.Copy;
    Truncate: Structuremap_targetTransform.Truncate;
    Escape: Structuremap_targetTransform.Escape;
    Cast: Structuremap_targetTransform.Cast;
    Append: Structuremap_targetTransform.Append;
    Translate: Structuremap_targetTransform.Translate;
    Reference: Structuremap_targetTransform.Reference;
    DateOp: Structuremap_targetTransform.DateOp;
    Uuid: Structuremap_targetTransform.Uuid;
    Pointer: Structuremap_targetTransform.Pointer;
    Evaluate: Structuremap_targetTransform.Evaluate;
    Cc: Structuremap_targetTransform.Cc;
    C: Structuremap_targetTransform.C;
    Qty: Structuremap_targetTransform.Qty;
    Id: Structuremap_targetTransform.Id;
    Cp: Structuremap_targetTransform.Cp;
    _visit: <Result>(value: Structuremap_targetTransform, visitor: Structuremap_targetTransform._Visitor<Result>) => Result;
};
export declare namespace Structuremap_targetTransform {
    type Create = "create" & {
        __Create: void;
    };
    type Copy = "copy" & {
        __Copy: void;
    };
    type Truncate = "truncate" & {
        __Truncate: void;
    };
    type Escape = "escape" & {
        __Escape: void;
    };
    type Cast = "cast" & {
        __Cast: void;
    };
    type Append = "append" & {
        __Append: void;
    };
    type Translate = "translate" & {
        __Translate: void;
    };
    type Reference = "reference" & {
        __Reference: void;
    };
    type DateOp = "dateOp" & {
        __DateOp: void;
    };
    type Uuid = "uuid" & {
        __Uuid: void;
    };
    type Pointer = "pointer" & {
        __Pointer: void;
    };
    type Evaluate = "evaluate" & {
        __Evaluate: void;
    };
    type Cc = "cc" & {
        __Cc: void;
    };
    type C = "c" & {
        __C: void;
    };
    type Qty = "qty" & {
        __Qty: void;
    };
    type Id = "id" & {
        __Id: void;
    };
    type Cp = "cp" & {
        __Cp: void;
    };
    interface _Visitor<Result> {
        create: () => Result;
        copy: () => Result;
        truncate: () => Result;
        escape: () => Result;
        cast: () => Result;
        append: () => Result;
        translate: () => Result;
        reference: () => Result;
        dateOp: () => Result;
        uuid: () => Result;
        pointer: () => Result;
        evaluate: () => Result;
        cc: () => Result;
        c: () => Result;
        qty: () => Result;
        id: () => Result;
        cp: () => Result;
        _unknown: () => Result;
    }
}
